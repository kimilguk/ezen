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
	
	
	//현재과목을 수강한 학생리스트 객체 생성(아래)
	private List<Student> studentList = new ArrayList<Student>();
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
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

	public void register(Student student) {
		// 과목별 1명씩 학생을 등록하는 메서드
		studentList.add(student);
	}
	
}
