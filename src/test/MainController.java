package test;

import java.util.ArrayList;

public class MainController {//학생1: 1개의 클래스를 3개로 분리

	public static void main(String[] args) {
		// 실행 구조 생성.
		MemberVO m1 = new MemberVO();
		m1.setName("김일국1");
		m1.setAge(23);
		m1.setPhoneNumber("000-0000-0000");
		MemberVO m2 = new MemberVO();
		m2.setName("김일국2");
		m2.setAge(33);
		m2.setPhoneNumber("111-1111-1111");
		MemberVO m3 = new MemberVO();
		m3.setName("김일국3");
		m3.setAge(43);
		m3.setPhoneNumber("222-2222-2222");
		//--------------------------------
		//배열객체 만들기(아래)
		MemberVO[] memberVOs = new MemberVO[3];
		memberVOs[0] = m1;
		memberVOs[1] = m2;
		memberVOs[2] = m3;
		//학생2: ArrayList 클래스를 사용해서 위 스칼라 배열객체를 벡터 배열객체로 변환(아래)
		ArrayList<MemberVO> arrayList = new ArrayList<MemberVO>();
		arrayList.add(m1);
		arrayList.add(m2);
		arrayList.add(m3);//입력
		//arrayList.set(0, m3);//수정:m1객체 -> m3로 수정
		//arrayList.remove(0);//삭제:배열객체에 존재하는 0인덱스의 객체삭제
		//위 배열객체를 출력하는 서비스클래스 생성
		MemberService mService = new MemberService();
		mService.printMembers(memberVOs);//출력
		//학생3: printMembers 같은함수명으로 매개변수만 틀린 메서드를 생성한다.
		mService.printMembers(arrayList);
	}

}
