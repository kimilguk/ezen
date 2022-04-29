package ppt03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		// 반복시작
		for (int i = 0; i < 5; i++) {
			System.out.print("짝수,홀수를 판별할 정수를 입력시오 ");
			number = input.nextInt();
			// 조건문 시작
			if (number % 2 == 0) {// 짝수 일때 구현내용시작
				System.out.println("짝수 입니다.");
			}else if(number == 101 || number == 99) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {// 홀수일때 구현내용시작
				System.out.println("홀수 입니다.");
			}
		}

	}

}
