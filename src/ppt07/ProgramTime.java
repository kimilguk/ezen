package ppt07;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramTime {

	public static void main(String[] args) {
		//자바8부터는 LocalDate + LocalTime = LocalDateTime 사용
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("현재시간 기본형태: "+dateTime);
        String timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS").format(dateTime);//실제 DB에 저장될 때는 아래값으로 저장된다.
        System.out.println("변환: "+timeFormat);
        //1970년 1월 1일 1부터 현재 까지의 밀리초단위 시간사용(아래)
        Long miliSecond = System.currentTimeMillis();
        System.out.println("타임스템프 기본형태: "+miliSecond);
        Timestamp timestamp = new Timestamp(miliSecond);//현재시간을 이쁘게 변환
        System.out.println("변환: "+timestamp);

	}

}
