package ppt02;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.141592;//상수변수 PI 지정
		double r, result;//변수지정 2개
		//초기값 지정
		r = 5.0;
		//구현코드
		result = r*r*PI;
		//출력
		System.out.println("반지름이 "+ r + "인 원의 면적은="+result);
		double x = 3.2;
		int y = (int) x;//형변환 더블 x -> 정수 y 로 변환
		System.out.println("더블형 x="+x+"가 정수형 y="+y);
	}

}
