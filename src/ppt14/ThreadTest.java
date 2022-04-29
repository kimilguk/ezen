package ppt14;

public class ThreadTest {

	public static void main(String[] args) {
		// 상속받지 않고 익명클래스로 새작업(Thread) 생성(람다식으로 구현하는 방식)
//		Runnable task = () -> {
//			for(int i=10;i>=0;i--) {
//				System.out.print(i + " ");
//			}
//		};
		//익명클래스 구현하는 방식(아래)
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				for(int i=10;i>=0;i--) {
					try {
						Thread.sleep(1000);//1000밀리세컨트 = 1초간 스레드대기
						System.out.print(i + " ");
						if(i == 5) {
							System.out.println("여기까지");
							//Thread.currentThread().stop();//현재 작업중인 스레드를 중지한다.
							//취소선이 있는 메서드,클래스는 사용가능하지만, 앞으로는 사용중지될 예정.
							//System.out.println("여기까지2");
							//break;//스레드는 백그라운드에서 살아있다.
							Thread.currentThread().interrupt();//강제로 작업을 중지 예외를 발생시킨다.
						}						
					} catch (InterruptedException e) {//스레드가 중지될때 발생하는 예외
						System.out.println("여기까지2");
						break;
					}
					
				}
			}
		};
		//스레드 시작
		new Thread(task).start();//러너블 객체를 스레드로 실행하는 start메서드
	}

}
