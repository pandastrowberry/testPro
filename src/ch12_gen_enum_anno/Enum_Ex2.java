package ch12_gen_enum_anno;

public class Enum_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6);
		
		Lottery lottery = Lottery.values()[num];
		System.out.println(lottery + "당첨되었습니다!!!");
		
	}
}

enum Lottery {
	Kwang, Car, Computer, MobilePhone, Book, Giftcard
}