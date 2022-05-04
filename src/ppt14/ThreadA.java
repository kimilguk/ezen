package ppt14;
class ThreadB extends Thread {
	long total;
	@Override //스레드를 .start() 하면 콜백으로 실행됨.
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		synchronized (this) {
			for(long i=0;i<999999999;i++) {
				total += i;//total = total + i;//누적구문
			}
			notify();//스레드작업(for문)이 완료시 자바시스템에 알림메세지를 보낸다.
		}
	}
	
}
public class ThreadA {

	public static void main(String[] args) throws Exception {
		// 스레드객체 생성 후 실행
		ThreadB tB = new ThreadB();
		tB.start();
		synchronized(tB) {
			System.out.println("스레드 B가 종료되기를 기다림...");
			System.out.println("tB객체 확인1: " + tB);
			tB.wait();//499999998500000001
			System.out.println("tB객체 확인2: " + tB);
			tB.wait();
			System.out.println("전체 합계: " + tB.total);
		}
	}

}
