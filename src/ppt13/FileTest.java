package ppt13;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//폴더이름 String 으로 1개 받아논다.
		String dirName = "C:\\ezen\\eclipse";
		File dir = new File(dirName);//File 클래스이 생성자는 파일경로, 파일이름이 필수로 필요.
		String[] fileNames = dir.list();//폴안의 String 파이이름+폴더이름을 추출한다.
		System.out.println("이름 개수 확인: " + fileNames.length);
		for(String fileName:fileNames) {
			File file = new File(dir+ "/" + fileName);//현재폴더에서 File 객체 파일을 추출하는 기능
			System.out.println("----------------------------");
			try {
				System.out.println("이름: " + file.getName() +
						"\n경로: " + file.getPath() +
						"\n부모폴더: " + file.getParent() +
						"\n절대경로: " + file.getAbsolutePath() +
						"\n정규경로: " + file.getCanonicalPath() +
						"\n폴더인지여부: " + file.isDirectory() +
						"\n파일인지여부: " + file.isFile()
						);
			} catch (IOException e) {
				System.out.println("현재 시스템에서 정규경로를 찾을 수 없습니다.");
				e.printStackTrace();
			}
		}
	}

}
