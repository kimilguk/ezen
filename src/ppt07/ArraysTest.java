package ppt07;
/**
 * 예외처리는 2가지 방식이 존재한다. 내부 메서드에서 처리하는 방법(네트워통신, 파일입출력의 경우),
 * 2번째는 메서드 외부로 예외를 보내서 1군데 클래스에서 공통으로 처리하는 방법 
 */
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) throws Exception {
		int x = 10, y = 0;
		int[] a = {1, 2, 3};
		try {
			int z = x/y;//1번째 에러 처리
			z = a[4];//2번째 에러 처리
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		int[] array = {9, 4, 5, 6, 2, 1};
		Arrays.sort(array);
		printArray(array);
		System.out.println();
		System.out.println(Arrays.binarySearch(array, 9));//9의 인덱스값을 구하는 함수.
		Arrays.fill(array, 8);//배열의 내용을 초기화 할때 사용.
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int result:array) {
			System.out.print(result + " ");
		}
		
	}

}
