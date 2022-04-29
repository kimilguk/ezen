package ppt02;

public class PlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 10;
		int k = v++%5;
		System.out.println(k + ":" + v);//나머지 0
		int x = 10;
		int y = ++x%5;
		System.out.println(y + ":" + x);//나머지 1
	}

}
