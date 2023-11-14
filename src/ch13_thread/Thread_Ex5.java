package ch13_thread;

public class Thread_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 동기화(synchronized) : synchronized 예약어로 표현
		 * 동기화 블록
		 * - lock 객체를 소유한 스레드만 동기화 영역 실행
		 * - lock은 Object 객체
		 * - 기본자료형은 lock으로 사용x
		 * - 모든 스레드가 공유하는 객체여야 함
		 * 동기화 메소드 
		 * */
		Thread t1 = new PrintThread('A');
		Thread t2 = new PrintThread('B');
		Thread t3 = new PrintThread('C');
		t1.start();
		t2.start();
		t3.start();
	}

}
class PrintThread extends Thread{
	char ch;
	PrintThread(char ch) {
		this.ch = ch;
	}
	static int[] lock = new int[3];
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (lock) {
			for (int j = 0; j < 80; j++) {
				System.out.print(ch);
			}
			System.out.println();
			}
		}
	}
}