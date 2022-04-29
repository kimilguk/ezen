package test;

import java.util.ArrayList;

public class MemberService {

	public void printMembers(MemberVO[] memberVOs) {
		// 매개변수로 배열객체를 받아서 향상된 for문으로 출력
		for(MemberVO member:memberVOs) {
			//학생1: 출력 내용 입력
			System.out.println("--------------------");
			System.out.println(member.getName()+
					"\n"+member.getAge()+
					"\n"+member.getPhoneNumber());
		}
		
	}
	//학생2: 오버로드 메서드 필요

	public void printMembers(ArrayList<MemberVO> arrayList) {
		for(MemberVO member:arrayList) {
			//학생1: 출력 내용 입력
			System.out.println("--------------------");
			System.out.println(member.getName()+
					"\n"+member.getAge()+
					"\n"+member.getPhoneNumber());
		}
		
	}

}
