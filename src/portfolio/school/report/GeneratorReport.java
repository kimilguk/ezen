package portfolio.school.report;

import java.util.ArrayList;
import java.util.List;

import portfolio.config.Define;
import portfolio.domain.Score;
import portfolio.domain.Student;
import portfolio.domain.Subject;
import portfolio.grade.BasicEvaluation;
import portfolio.grade.GradeEvaluation;
import portfolio.grade.MajorEvaluation;
import portfolio.school.School;

/**
 * 이 클래스는 출력서식을 생성한는 클래스 이다. 헤더(header), 바디(body), 푸터(footer)
 * @author 402_S
 *
 */
public class GeneratorReport {
	//멤버변수생성
	School school = School.getInstance();//싱글톤 객체를 생성한다.
	//헤더디자인을 고정값인 static으로 생성(아래)
	public static final String TITLE = " 과목 등급\t\t\n";//앞에 과목이름을 동적으로 출력할 예정
	public static final String LINE = "----------------------------\n";
	public static final String HEADER = " 이름 | 학번 | 전공 | 필수과목 | 점수 | 등급 \n";
	
	//본문내용 출력부분 생성(아래)
	private StringBuffer buffer = new StringBuffer();//배열객체의 값을 누적할때 임시저장하는 공간생성
	public String getReport() {
		//배열객체 반복시작
		ArrayList<Subject> subjectList = school.getSubjectList();//클래스에서 직접접근은 static, 객체에서는 public
		for(Subject subject:subjectList) {
			makeHeader(subject);//목록의 타이틀 출력된다.
			makeBody(subject);//학생 리스트 출력된다.
			makeFooter();//1개 학생객체 출력이후 엔터처리
		}
		return null;
	}
	private void makeFooter() {
		// 1개 학생객체 출력이후 엔터처리
		buffer.append("\n");
	}
	private void makeBody(Subject subject) {
		// 학생 리스트 출력된다.
		List<Student> studentList = subject.getStudentList();
		for(Student student:studentList) {
			buffer.append(student.getStudentName());//학생이름
			buffer.append(" | ");
			buffer.append(student.getStudentId());//학번
			buffer.append(" | ");
			//buffer.append(student.getMajorSubject());//전공출력 -> 전공은 전공과목으로 구할 수 있다.
			//여기서 전공을 최초로 부여한다.
			switch (student.getMajorSubject().getSubjectId()) {
			case Define.KOREA:
				buffer.append("국어국문학과");
				break;
			case Define.MATH:
				buffer.append("컴퓨터공학과");
				break;
			default:
				buffer.append("전공미지정");
				break;
			}
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName());//필수과목이름
			buffer.append(" | ");
			getScoreAndGrade(student, subject.getSubjectId());//점수 와 등급을 구해서 버퍼에 추가하는 메서드
			buffer.append("\n");
		}
		
	}
	
	private void getScoreAndGrade(Student student, int subjectId) {
		// 학생의 과목(코드)점수 와 등급을 구해서 버퍼에 추가하는 메서드
		//등급구분부터 시작
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};
		//학생개인별 학점객체(국어,수학) 가져오기
		ArrayList<Score> scoreList = student.getScorelist();
		int majorId = student.getMajorSubject().getSubjectId();//학생별 전공과목ID별로 S, A 결정
		//과목별 점수:예, 컴퓨터공학과 학생 전공과목ID 수학, 국어과목id의 점수리스트 확인)
		for(Score score:scoreList) {
			if(subjectId == score.getSubject().getSubjectId()) { //현재조건은 국어과목만 출력하는 조건
				String grade;//학점(등급)저장용 변수
				if(majorId == subjectId) {//전공과목이면 구현
					grade = gradeEvaluations[Define.SAF_TYPE].getGrade(score.getPoint());
				}else {
					grade = gradeEvaluations[Define.AF_TYPE].getGrade(score.getPoint());
				}
				buffer.append(score.getPoint());
				buffer.append(" | ");
				buffer.append(grade);
			}
		}
	}
	private void makeHeader(Subject subject) {
		// 목록의 타이틀 출력된다.
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(this.TITLE);
		buffer.append(this.LINE);
		buffer.append(this.HEADER);
	}
}
