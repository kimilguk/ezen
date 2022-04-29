package ppt10;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class RadioButtonFrame extends JFrame implements ActionListener {
	//클래스변수 선언(멤버변수=필드)
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 액션처리는 여기서

	}
	//아래 화면생성 메서드
	public RadioButtonFrame() throws HeadlessException {
		// 프레임설정 -> 패널생성 -> 콤포넌트 생성 -> 액션리스너 처리
	}

	public static void main(String[] args) {
		// 객체생성 -> 화면생성 -> 이벤트 처리

	}

}
