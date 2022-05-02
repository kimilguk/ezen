package portfolio.test;

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
		
	}
	private void createSubject() {
		// 과목데이터 입력
		
	}

}
