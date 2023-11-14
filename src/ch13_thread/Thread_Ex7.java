package ch13_thread;

public class Thread_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread son = new Thread(atm, "아들");
		Thread daughter = new Thread(atm, "딸");
		son.start();
		daughter.start();
	}
}

class ATM implements Runnable {
	private int money = 100000;
	public void run() {
		while(true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			if(money <=0) 
				break;
			withdraw();
		}
	}
	synchronized void withdraw() {
		if(money <= 0)
			return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + " 10000원 출금, 잔액 : " + money);
	}
}