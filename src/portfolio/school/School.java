package portfolio.school;

import java.util.ArrayList;

import portfolio.domain.Student;
import portfolio.domain.Subject;

/**
 * 이 클래스는 싱글톤 클래스로서 학생리스트(성적포함) 과목리스트를 모두 모아 놓는 임시 클래스이다. 
 * @author 402_S
 *
 */
public class School {
	//멤버변수 생성
	private static School instance = new School();//이 클래스를 컴파일할때 정적메모리 영역에 올라간다.
	private static String SCHOOL_NAME = "이젠 아카데미";
	private ArrayList<Student> studentList = new ArrayList<Student>();//제네릭타입을 사용한다.
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	//생성자 메서드 생성(아래)
	public School() {
	}
	//수동으로 1객체씩 입력: 학생과 과목 메서드 생성:사용은 메인메서드에서(아래)
	public void addStudent(Student student) {
		studentList.add(student);
	}
	public void addSubject(Subject subject) {
		subjectList.add(subject);//배열객체에 1개의 객체를 추가
	}
	
	//싱글톤 객체를 생성하는 메서드(아래)
	public static School getInstance() {
		if(instance ==null ) {//스쿨객체가 생성이 되지 않았다면...
			instance = new School();
		}
		return instance;
	}
	//레포트클래스에서 사용할 리스트를 출력할 겟 메서드 생성(자동으로)

	public static String getSCHOOL_NAME() {
		return SCHOOL_NAME;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	
}
