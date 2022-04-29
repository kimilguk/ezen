package ppt10;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {

	
	
	public static void main(String[] args) {
		//화면객체생성
		TextFieldFrame tFrame = new TextFieldFrame();
	}
	
	//생성자로 화면을 초기화
	public TextFieldFrame() throws HeadlessException {
		// 화면만들기 프레임설정 -> 패널생성 -> 콤포넌트 추가
		setSize(300, 150);
		setTitle("제곱 계산하기");
		JPanel jPanel = new JPanel();
		//콤포넌트추가 시작
		JLabel jLabel1 = new JLabel("숫자입력 : ");
		JTextField jField = new JTextField(15);//기본숫자 입력란
		JLabel jLabel2 = new JLabel("제곱한값 : ");
		JTextField jField2 = new JTextField(15);
		jField2.setEditable(false);//입력불가능하게 처리
		JButton jButton = new JButton("OK");
		jButton.addActionListener(new ActionListener() {
			
			@Override//버튼을 클릭하는 순간 자동실행=콜백메서드
			public void actionPerformed(ActionEvent e) {
				// jField 의 값을 get으로 가져와서 2번 곱한후 jField2 입력콤퍼넌트에 set으로 입력한다.
				String valueText = jField.getText();
				int valueInt = Integer.parseInt(valueText);
				jField2.setText(""+(valueInt*valueInt));				
			}
		});
		//화면출력
		jPanel.add(jLabel1);
		jPanel.add(jField);
		jPanel.add(jLabel2);
		jPanel.add(jField2);
		jPanel.add(jButton);
		add(jPanel);
		setVisible(true);		
		
	}

}
