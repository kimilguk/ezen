package ppt08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() throws HeadlessException {
		//윈도우용 프레임 컨테이너를 초기화시키는 코드시작
		setSize(300, 200);//프레임의 크기
		setTitle("첫번째 윈도우 프로그램");
		setLayout(new FlowLayout());//익명객체:가로로 배치하는 레이아웃
		getContentPane().setBackground(Color.yellow);//벽 배경색
		
		JPanel jPanel = new JPanel();//실행가능한 객체
		jPanel.setBackground(Color.red);//패널의 배경색
		jPanel.setLayout(new FlowLayout());
		//jPanel.setSize(150, 200);//패널크기 왜 일까?
		jPanel.setPreferredSize(new Dimension(180,150));
		
		//콤퍼넌트 추가시작
		JButton jButton1 = new JButton("김일국");//사용가능한 클래스인 객체가 됨
		JButton closeBotton = new JButton("종료");
		JLabel jLabel = new JLabel("아이디: ");
		JTextField jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(100, 20));
		//jLabel.setSize(120, 200);
		jLabel.setFont(new Font(null, Font.BOLD, 12));
		
		//패널에 추가
		jPanel.add(jButton1);//프레임에 추가 -> 패널에 추가된다.
		jPanel.add(closeBotton);
		jPanel.add(jLabel);
		jPanel.add(jTextField);
		
		//프레임에 추가
		add(jPanel);
		setVisible(true);//false 기본을 true 로 화면에 출력
	}

	public static void main(String[] args) {
		// 객체를 만들면 생성자로 초기화 됩니다.
		MyFrame myFrame = new MyFrame();
	}

}
