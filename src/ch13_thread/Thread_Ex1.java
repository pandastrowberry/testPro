package ch13_thread;

public class Thread_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 스레드 예제1
		 * 스레드 생성
		 * 1. Thread1.java(Thread 클래스 상속)
		 * start() 기능
		 * 1. 스택 영역을 병렬화
		 * 2. 자신의 스택 영역에 run()메소드 호출
		 * 
		 * */
		
		System.out.println("main. 스레드 시작");
		Thread1 t1 = new Thread1("First");
		Thread1 t2 = new Thread1("Second");
		t1.start();
		t2.start();
		
		System.out.println("main 스레드 종료");
	}
}

class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " = " + getName());
			
			try {
				sleep(1);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}