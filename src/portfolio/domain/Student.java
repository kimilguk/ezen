package portfolio.domain;

import java.util.ArrayList;

/**
 * 이 클래스는 학생 정보를 저장하는 도메인 클래스이다.
 * @author 402_S
 *
 */
public class Student {
	//멤버변수 추가
	private int studentId;//학번
	private String studentName;//학생이름
	private Subject majorSubject;//전공과목 클래스
	//학생별 과목점수 배열객체 생성(아래)
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int pStudentId, String pStudentName, Subject korean) {
		// 학생객체를 추가하면서, 데이터까지 초기화 하는 생성자 메서드
		this.studentId = pStudentId;
		this.studentName = pStudentName;
		this.majorSubject = korean;
	}
	//입출력 겟,셋메서드 자동추가
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	public ArrayList<Score> getScorelist() {
		// TODO Auto-generated method stub
		return scoreList;
	}
	public void addSubjectScore(Score score) {
		// 학생 과목별 점수 등록
		scoreList.add(score);//배열객체에 점수객체1개를 추가
	}
	
}
