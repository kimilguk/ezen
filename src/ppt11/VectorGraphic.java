package ppt11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1.고정값(스칼라값): bmp,jpg,png(화면확대하면 이미지가 깨진다.)
 * -자바데이터(기본형x,y): int[][] intArray = new int[2][2];
 * 2.가변값(벡터값): svg,안드로이드이미지(확대를 해도 이미지가 화질불변)
 * -자바데이터(객체형,배열리스트):ArrayList<Integer[]> aList = new ArrayList<Integer[]>();
 * @author 402_S
 *
 */
public class VectorGraphic {

	public static void main(String[] args) {
		//오토박싱(아래)
		Integer number = 56;
		// 고정값 좌표 데이터처리(스칼라값) { {10,20} ,{30,40} } 값만 존재
		int[][] intArray = new int[2][2];
		intArray[0][0] = 10;
		intArray[0][1] = 20;
		intArray[1][0] = 30;
		intArray[1][1] = 40;
		System.out.println(Arrays.toString(intArray[0])+"\n"+Arrays.toString(intArray[1]));
		// int, byte, short, long, boolean(기본형) -> (객체형,참조형,랩퍼형)Integer, Byte, Short, Logn, Boolean
		// 가변값 좌표 데이터처리(벡터값) { {10,20} ,{30,40}, ... } 값 + 방향
		// 제네릭타입으로 배열객체를 만드는 이유? 개발자가 컴파일단계에서 데이터오류를 잡기 위해서
		ArrayList aList2 = new ArrayList();//1+"1" 아래 같은 방식을 제네릭 타입가진 배열객체
		ArrayList<Integer[]> aList = new ArrayList<Integer[]>();
		Integer[] item1 = {10,20};
		Integer[] item2 = {30,40};
		Integer[] item3 = {50,60};
		//... 자료를 동적으로 추가가능
		aList.add(item1);
		aList.add(item2);
		aList.add(item3);
		System.out.println(Arrays.toString(aList.get(0))+"\n"
		+ Arrays.toString(aList.get(1))
		+"\n" + Arrays.toString(aList.get(2)));
	}

}
