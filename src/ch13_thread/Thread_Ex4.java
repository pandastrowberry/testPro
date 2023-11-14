package ch13_thread;

public class Thread_Ex4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		/*
		 * 데몬 스레드
		 * - 데몬 스레드의 기능은 일반 스레드의 보조 역할 담당
		 * - 일반 스레ㅡ가 종료되면 데몬 스레드도 종료
		 * - 데몬 스레드는 무한 반복해서 구현
		 * 설정 : setDaemon(true) -> 반드시 new 상태에서 해야됨
		 * 							Runnable 상태에서 설정하면 예외 발생
		 * */
		
		Thread t1 = new DaemonThread(); //데몬 스레드 설정(New 상태에서 설정 가능)
		Thread t2 = new DaemonThread();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
	
		Thread.sleep(2000);
		
		System.out.println("main 스레드 종료");
	}

}
class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}