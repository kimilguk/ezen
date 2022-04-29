package ppt04;

class NumberBox {
	public int iValue;
	public float fValue;
	public NumberBox(int iValue, float fValue) {
		//super();//iValue = 0;, fValue = 0f;
		this.iValue = 10;
		this.fValue = 1.2345f;
	}
	@Override
	public String toString() {
		return "NumberBox [iValue=" + iValue + ", fValue=" + fValue + "]";
	}
	
	
	
}

class Circle {
	//Circle circle = new Circle(); 
	static private int radius;//반지름
	static int count;//static 을 사용하면, 객체외부에서도 사용된다.(전역사용)
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	static double calcArea() {//private, protected, default(아무것도 없는상태)
		double result = radius*radius*3.14;
		count ++;
		return result;
	}
}

public class CircleTest {

	
	public static void main(String[] args) {//메인 스레드(1개 프로그램)
		Circle circle = new Circle();//객체생성, radius = 0;
		Circle circle2 = new Circle();//객체생성, radius = 0;
		//circle.radius = 100;//0 -> 100
		circle.setRadius(100);
		double result = circle.calcArea();
		Circle.calcArea();//Math.ramdom()*10 + 1;//1~10까지 랜덤 숫자를 출력
		//System.out.println("반지름이 "+ circle.radius + "인 원은 넓이는 " + result);
		System.out.println("반지름이 "+ circle.getRadius() + "인 원은 넓이는 " + result);
		NumberBox numberBox = new NumberBox(0, 0);
		System.out.println(numberBox);//객체를 출력하면 .toString()
		//스태틱 변수는 객체생성 없이 클래스로 바로 접근이 가능하다.(메모리에 고정영역에 존재하기 때문에)
		System.out.println("calcArea함수를 실행한 개수는 " + Circle.count);
	}

}
