package portfolio.domain;
/**
 * 이 클래스는 학생의 학번, 과목과 점수 데이터를 저장하는 클래스. 
 * @author 402_S
 *
 */
public class Score {
	//멤버변수
	private int studentId;//학번
	private String subject;//과목명
	private int point;//과목점수
	//메인메서드에서 학생점수를 추가할 때 사용하는 초기값 생성한는 기능(아래)
	public Score(int studentId, String subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	//자동으로 생성(아래)
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
