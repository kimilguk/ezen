package ppt10;

import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabel extends JFrame {
	
	public ImageLabel() throws HeadlessException {
		// 컨테이너 사이즈,타이틀
		setTitle("이미지 라벨");
		setSize(300, 150);
		JPanel jPanel = new JPanel();
		// 콤포넌트 생성
		JLabel jLabel = new JLabel("우주선 이미지");
		ImageIcon icon = new ImageIcon("./src/ppt10/car.png");//경로 . 현재폴더는 프로젝트 이름이있는 폴더다.
		jLabel.setIcon(icon);
		// 콤포넌트를 패널에 추가 후 패널을 프레임에 추가(아래)
		jPanel.add(jLabel);
		add(jPanel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 화면 생성(아래)
		ImageLabel imageLabel = new ImageLabel();

	}

}
