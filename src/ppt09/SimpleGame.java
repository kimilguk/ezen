package ppt09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGame extends JFrame {
	//클래스변수
	int n1, n2, n3;
	JButton jButton1, jButton2, jButton3;
	
	public SimpleGame() throws HeadlessException {
		// 디자인 객체 생성
		setSize(300, 150);
		setTitle("슬롯머신");
		//setLayout(null);
		JPanel jPanel = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				g.setColor(Color.blue);
				g.fillOval(0, 0, 100, 100);
			}

			@Override //콜백메서드(자동실행)
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				super.paint(g);
				
			}
			
		};
		//패널에 키보드 이벤트 추가
		jPanel.requestFocus();
		jPanel.setFocusable(true);
		jPanel.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//super.keyPressed(e);
				// 개발자 코드 추가
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					n1 = (int) (Math.random()*10);
					jButton1.setText(""+n1);
					jButton2.setText(""+(int)(Math.random()*10));
					jButton3.setText(""+(int)(Math.random()*10));
				}
			}
			
		});
//		jPanel.addKeyListener(new KeyListener() {//KeyAdapter() 바꾸기 예외처리.
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				System.out.println("여기까지");
//				// 개발자 코드 추가
//				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//					n1 = (int) (Math.random()*10);
//					jButton1.setText(""+n1);
//					jButton2.setText(""+(int)(Math.random()*10));
//					jButton3.setText(""+(int)(Math.random()*10));
//				}
//			}
//
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		//--------------------------
		jButton1 = new JButton("" + n1);
		jButton2 = new JButton("" + n2);
		jButton3 = new JButton("" + n3);
		
		//--------------------------
		jPanel.add(jButton1);//스윙 클래스 객체에 JFrame > J로 시작하는 객체클래스를 포함이 가능
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		//-------------------------
		add(jPanel);
		setVisible(true);//JFrame에 스윙 객체=스윙콤포넌트가 나타난다.
		
	}


//
//	@Override
//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paint(g);
//		//Graphics graphics = getGraphics();//1번만 객체를 만드는 클래스 = 싱글톤 형식으로 만든 클래스를 객체로 만드는 방법
//		g.setColor(Color.orange);
//		g.fillOval(0, 0, 100, 100);//왜 안될까? 이유는 윈도우(JFrame)이 화면에 출력되기전에 그랙픽객체를 그리기 때문에
//	}



	public static void main(String[] args) {
		SimpleGame simpleGame = new SimpleGame();
		System.out.println("여기까지1");
	}

}
