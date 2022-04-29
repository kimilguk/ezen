package ppt06;

abstract class Animal {//추상 클래스는 목차만 있고, 구현내용이 없는 클래스를 말한다.
	private String S = "상수";
	public String s = "일반변수";
	public abstract void speak(); //추상 클래스는 이름만 
}
class Cat extends Animal {
	
	@Override
	public void speak() {
		System.out.println("고양이는 야옹 짓습니다.");
		
	}

		
}
public class Dog extends Animal {

	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		//super.speak();//이 부분이 생략되도 자바가 자동 실행
		System.out.println("개는 멍멍 짓습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.speak();
		Animal cat = new Cat();
		cat.speak();
	}

}
