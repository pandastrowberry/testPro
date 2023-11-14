package ch13_thread;
	
public class Thread_Ex6 {
	public static void main(String[] args) {
		/*
		 * 동기화 메소드 예제
		 * - 공유 객체의 메소드여야 한다 ※ 공유 객체 : 모든 스레드가 하나의 객체를 공유하고 있음
		 * */
		
		Printer ptr = new Printer();
		Thread t1 = new PrintThread3(ptr, 'A');
		Thread t2 = new PrintThread3(ptr, 'B');
		Thread t3 = new PrintThread3(ptr, 'C');
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class Printer {
	public void printChar(char ch) {
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
class PrintThread3 extends Thread {
	Printer ptr;
	char ch;
	
	PrintThread3(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}
