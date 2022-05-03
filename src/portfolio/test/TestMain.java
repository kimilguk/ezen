package portfolio.test;

import portfolio.config.Define;
import portfolio.domain.Score;
import portfolio.domain.Student;
import portfolio.domain.Subject;
import portfolio.school.School;
import portfolio.school.report.GeneratorReport;

/**
 * 이 클래스는 실행하는 클래스이다. 화면에 해당한다.
 * @author 402_S
 *
 */
public class TestMain {
	// 멤버변수
	School ezenAcademy = School.getInstance();
	Subject korean;//
	Subject math;//1개 클래스로 객체2개를 만들 변수만 생성
	Subject art;
	GeneratorReport gReport = new GeneratorReport();//출력객체생성
	public static void main(String[] args) {
		TestMain test = new TestMain();
		test.createSubject();//과목데이터 입력
		test.createStudent();//학생데이터 입력(전공과목, 과목, 과목점수 추가)
		String report = test.gReport.getReport();
		System.out.println(report);
	}
	private void createStudent() {
		// 학생데이터 입력(전공과목, 과목, 과목점수 추가)
		//학번, 이름, 필수과목클래스 등록(아래)
		Student student1 = new Student(2201, "강감찬", korean);
		//student1.setStudentName("강감찬");
		Student student2 = new Student(2202, "김유신", math);
		Student student3 = new Student(2203, "이순신", korean);
		Student student4 = new Student(2204, "홍길동", math);
		Student student5 = new Student(2205, "아무개", art);
		//위 4명 학생을 학교클래스에 등록(아래)
		ezenAcademy.addStudent(student1);
		ezenAcademy.addStudent(student2);
		ezenAcademy.addStudent(student3);
		ezenAcademy.addStudent(student4);
		ezenAcademy.addStudent(student5);
		//과목별 수강하는 학생 등록
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		//학생별 점수등록
		student1.addSubjectScore(new Score(student1.getStudentId(), korean, 95));
		student2.addSubjectScore(new Score(student2.getStudentId(), korean, 95));
		student3.addSubjectScore(new Score(student3.getStudentId(), korean, 89));
		student4.addSubjectScore(new Score(student4.getStudentId(), korean, 85));
		student5.addSubjectScore(new Score(student5.getStudentId(), korean, 95));
		
		student1.addSubjectScore(new Score(student1.getStudentId(), math, 56));
		student2.addSubjectScore(new Score(student2.getStudentId(), math, 95));
		student3.addSubjectScore(new Score(student3.getStudentId(), math, 95));
		student4.addSubjectScore(new Score(student4.getStudentId(), math, 56));
		student5.addSubjectScore(new Score(student5.getStudentId(), math, 56));
	}
	private void createSubject() {
		// 과목데이터 입력
		korean = new Subject("국어", Define.KOREA);//겟셋으로 데이터를 생성하지 않고, 생성자로 객체를
		//만들면서 데이터를 초기화 한다.
		math = new Subject("수학", Define.MATH);
		art = new Subject("미술사", Define.ART);
		//학교클래스에 등록한 과목을 추가한다.
		ezenAcademy.addSubject(korean);
		ezenAcademy.addSubject(math);
		ezenAcademy.addSubject(art);
	}

}
