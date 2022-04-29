package ppt09;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {
	//클래스변수 위치(전역,필드변수)
	private int count;
	JLabel jLabel;
	
	public MyFrame2() throws HeadlessException {
		// 윈도우 디자인을 만든다.
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		//-------------------------
		jLabel = new JLabel("현재의 카운트 값: "+count);
		JButton jButton = new JButton("증가");
		//-------------------------
		//이벤트 리스너 시작
//		jButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 라벨의 카운트를 증가하는 코딩이 추가(아래)
//				jLabel.setText("현재의 카운트 값: " + ++count);
//				
//			}
//		});
		//람다식으로 리스너 시작
		jButton.addActionListener(e -> {
			jLabel.setText("현재의 카운트 값: " + ++count);
		});
		//------------------------
		add(jLabel);
		add(jButton);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame2 myFrame2 = new MyFrame2();
	}

}
