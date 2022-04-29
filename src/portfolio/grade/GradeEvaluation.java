package portfolio.grade;
/**
 * 이 인터페이스는 평가정책을 구현하는 메서드명만 있는 자바파일. 
 * 자식은 2개의 클래스로 구현 1.전공과목평가정책, 2.일반과목평가정책 구현
 * @author 402_S
 *
 */
public interface GradeEvaluation {
	public String getGrade(int point);
}
