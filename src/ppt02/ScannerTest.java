package ppt02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//객체생성
		Scanner input = new Scanner(System.in);//생성자 메서드로 객체를 생성
		System.out.print("나누어질 수를 입력하세요? ");
		int value1 = input.nextInt();//객체의 기능중 입력받는 메서드를 사용
		System.out.print("나눌 수를 입력하세요? ");
		int value2 = input.nextInt();//객체의 기능중 입력받는 메서드를 사용
		int result = value1%value2;
		//입력한 내용을 출력
		System.out.println(value1 + "을 "
							+value2 + "로 나눈 나머지는 = "
							+result + "입니다.");
	}

}
