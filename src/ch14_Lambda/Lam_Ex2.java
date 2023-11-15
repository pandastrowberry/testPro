package ch14_Lambda;

public class Lam_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 시작");
		Runnable r = () -> {
			int sum = 0;
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합 : " + sum);
		};
		Thread t = new Thread(r);
		Thread t2 = new Thread(() -> {
			int sum = 0;
			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			System.out.println("****** 1부터 100까지의 합 : " + sum);
		}
		);
		t.start();
		System.out.println("main 종료");
	}

}
