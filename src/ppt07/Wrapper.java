package ppt07;
/**
 * 이 클래스는 래퍼 기능을 하는 클래스 Json 데이터는 문자이기 때문에 숫자로 변경할 때 주로 사용.
 * @author 402_S
 *
 */
public class Wrapper {

	public static void main(String[] args) {
		Integer obj1 = 100;//<->new Integer(100); 래퍼클래스 <-> 바로 입력하면 오토박싱 처리 되었다고 한다.
		Integer s1 = Integer.parseInt("10");//Integer.toString(10);
				
	}

}
