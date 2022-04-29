package ppt12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// 이클립스 폴더의 eclipse.ini 파일을 읽어 들이기
		try {
			FileReader fReader = new FileReader("./src/ppt12/eclipse.ini");//불러오는 경로
			FileWriter fWriter = new FileWriter("./src/ppt12/eclipse.txt");//저장되는 경로
			int ch;
			while((ch=fReader.read()) != -1) {
				//ch = fReader.read();//read함수를 2번 사용하지 않으려고 조건에 ch 를 추가한다.
				//System.out.print((char)ch);//ch 변수 0~255 정수를 -> 단일문자형으로 변경처리
				fWriter.write(ch);
			}
			fReader.close();//null 처리
			fWriter.close();//특징: 파일리더와 파일라이터 클래스가 동시에 작동하면 2중에 1개 작동이 않됨.
		} catch (FileNotFoundException e) {
			System.out.println("해당위치에 파일이 존재않습니다.");
		} catch (IOException e) {
			System.out.println("파일에서 문자를 읽어 들이는 read함수에서 에러가 발생했다.");
		}

	}

}
