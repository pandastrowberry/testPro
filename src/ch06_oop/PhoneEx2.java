package ch06_oop;

public class PhoneEx2 {

	public static void main(String[] args) {
		//클래스 배열
			Phone [] parr = new Phone[3];
			for (int i = 0; i < parr.length; i++) {
				Phone p = new Phone();
				parr[i] = p;
				parr[i].no = i + "1234"; //no : 0 : 01234, 1 : 11234, 2 : 21234 
			}
			for (int i = 0; i < parr.length; i++) {
				System.out.printf("parr[%d].no=$s\n", parr[i].no);
			}
			
			for (int i = 0; i < parr.length; i++) {
				System.out.printf("parr[%d].no=$s\n",i,parr[i].no);
				parr[i].send((i == 0)? parr[parr.length - 1].no : parr[i - 1].no);
				/* 0 -> 2 21234
				   1 -> 0 01234
				   2 -> 1 11234
				*/   	
			}
	}	
}
