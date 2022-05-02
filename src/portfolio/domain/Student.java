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
	private Subject majorSubject;//전공과목
	//학생별 과목점수 배열객체 생성(아래)
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
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
	
}
