package ppt01;
/**
 * cmd 창에서 컴파일: javac -d . Hello.java -encoding UTF-8
 * cmd 창에서 실행: java ppt01.Hello
 * 윈도우용 jar파일을 cmd 창에서 실행: javaw -jar -Dfile.encoding=UTF-8 추가
 * @author kimilguk
 *
 */
public class Hello {

	public static void main(String[] args) {
		// 한줄 주석
		boolean val = 1<2;
		System.out.println("안녕 자바!\n안녕 자바!\n안녕 자바!" + val);
	}

}
