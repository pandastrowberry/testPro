package ch13_thread;

public class Thread_Ex8 {
	class Account {
		int money;
		synchronized void output() {
			while(money == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
			notifyAll();
			System.out.println(Thread.currentThread().getName() + " : " + money + "원 송금");
			money = 0;	
		}
		synchronized void input() {
			while(money > 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
			money = ((int) (Math.random() * 3) + 1) * 1000;
			notifyAll();
			System.out.println(Thread.currentThread().getName() + " : " + money + "원 : 입금");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 생산자, 소비자 스레드 예제
		 * 계좌에 잔액이 0이면, 아들은 wait() 상태로 변경
		 * 엄마는 계좌에 잔액이 있으면, wait() 상태로 변경 
		 *          잔액이 0이면, 10000/20000/30000원 중에서 한개만 입금
		 * 엄마 0 ~ 3000 동안 sleep
		 * 아들 0 ~ 1000 동안 sleep
		 * */
		
		Account acc = new Account();
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		son.start();
		mother.start();
	}

}
class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("엄마스레드");
		this.account = account;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int)(Math.random() * 30000));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class Son extends Thread {
	Account account;
	Son(Account account) {
		super("아들스레드");
		this.account = account;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}