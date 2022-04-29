package ppt09;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ppt09.MyFrame.MyListener;

public class MyFrame extends JFrame {
	//클래스변수 위치(전역,필드변수)
	private int count;
	JLabel jLabel;
	
	public class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {//콜백메서드 자동생성=이벤트가 발생될 때 자동실행됨.
			// 라벨의 카운트를 증가하는 코딩이 추가(아래)
			jLabel.setText("현재의 카운트 값: " + ++count);
		}

	}	

	public MyFrame() throws HeadlessException {
		// 윈도우 디자인을 만든다.
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		//-------------------------
		jLabel = new JLabel("현재의 카운트 값: "+count);
		JButton jButton = new JButton("증가");
		//-------------------------
		//이벤트 리스너 시작
		jButton.addActionListener(new MyListener());
		//------------------------
		add(jLabel);
		add(jButton);
		setVisible(true);
	}

	public static void main(String[] args) {
		//프레임 객체를 생성
		MyFrame myFrame = new MyFrame();
	}

}
