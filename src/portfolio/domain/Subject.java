package portfolio.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스는 과목 클래스로 과목명, 과목코드, 평가구분값
 * @author 402_S
 *
 */
public class Subject {
	//멤버변수
	private String subjectName;//과목명
	private int subjectId;//과목코드
	private int gradeType;//평가구분값
	//1명의 학생이 가질수 있는 학점객체의 리스트 객체 생성(아래)
	private List<Score> scoreList = new ArrayList<Score>();
	//점수데이터 객체를 1개씩 추가등록하는 메서드(아래)
	public void addSubjectScore(Score sore) {
		//점수클래스부터 생성 후 작업
		scoreList.add(sore);
	}
	public List<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}

	//생성자로 초기깂을 입력하는 메서드 생성(아래)
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
}
