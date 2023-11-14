package ch13_thread;

public class Thread_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Thread 우선순위
		 * 1. Runnable 상태에서 스케줄러로부터 선택받아 Running 상태로 변경 등의 우선순위 설정
		 * 2. 우선순위가 높다고 해서 빠른 선택을 받지 않음 = 확률
		 * 
		 * 우선순위 설정 메소드 : setPriority 
		 * */
		
		/*
		 * Thread(Third, 10 , main)
		 * Third : 스레드 이름
		 * 10 : 우선순위
		 * main : 스레드 그룹
		 * */
		
		System.out.println(Thread);
		System.out.println("높은 우선 순위 : " + Thread.MAX_PRIORITY);
		System.out.println("낮은 우선 순위 : " + Thread.MIN_PRIORITY);
		System.out.println("기본 우선 순위 : " + Thread.NORM_PRIORITY);
		
	
		
	}
}
class ThreadProperty extends Thread {
	ThreadProperty(String name, int p) {
		super(name);
		setPriority(p);
	}
	@Override
	public void run() {
		try {
			sleep(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("*** : " + this);
		}
	}
	@Override
	public String toString() {
		return this.getName() + ", " + this.getPriority();
	}
}