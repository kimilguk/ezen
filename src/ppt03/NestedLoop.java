package ppt03;

public class NestedLoop {

	public static void main(String[] args) {
		for(int x=0;x<5;x++) { //5행 반복
			for(int y=0;y<10;y++) {//10열 반복
				if(x==1 && y >= 5) {
					continue;
				}
				System.out.print("*");//가로로 10개 별표가 생성
			}
			//다음 행을 이동하기 전에 엔터
			System.out.println();//엔터 줄바꿈
		}

	}

}
