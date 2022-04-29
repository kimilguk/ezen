package ppt03;

import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// 변수 몇단을 출력할 건지 지정 변수, 9번 반복할 변수
		int n;
		int i = 1;
		System.out.print("구구단 중 출력하고 싶은 단을 입력하세요 ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		//while 무한반복문 시작
		while (i <= 9) {
			System.out.println(n + " x " + i + "=" + n*i);
			i = i+1;//i++
		}
	}

}
