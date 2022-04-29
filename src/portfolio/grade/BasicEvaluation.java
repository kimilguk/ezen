package portfolio.grade;
/**
 * 일반과목 학점 구현 클래스
 * @author 402_S
 *
 */
public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		// 학점이 A ~ F 까지 적용되는 내용을 반환하는 값을 구현
		String grade = null;
		if (100 >= point && point >= 90) {
			grade = "A";
		} else if (89 >= point && point >= 80) {
			grade = "B";
		} else if (79 >= point && point >= 70) {
			grade = "C";
		} else if (69 >= point && point >= 55) {
			grade = "D";
		} else if (55 > point) {
			grade = "F";
		}
		return grade;
	}

}
