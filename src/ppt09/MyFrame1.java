package ppt09;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ppt09.MyFrame.MyListener;

public class MyFrame1 extends JFrame implements ActionListener {
	//클래스변수 위치(전역,필드변수)
	private int count;
	JLabel jLabel;
		
	public MyFrame1() throws HeadlessException {
		// 윈도우 디자인을 만든다.
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		//-------------------------
		jLabel = new JLabel("현재의 카운트 값: "+count);
		JButton jButton = new JButton("증가");
		//-------------------------
		//이벤트 리스너 시작
		jButton.addActionListener(this);
		//------------------------
		add(jLabel);
		add(jButton);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 라벨의 카운트를 증가하는 코딩이 추가(아래)
		jLabel.setText("현재의 카운트 값: " + ++count);

	}

	public static void main(String[] args) {
		// 객체생성
		MyFrame1 myFrame1 = new MyFrame1();
	}

}
