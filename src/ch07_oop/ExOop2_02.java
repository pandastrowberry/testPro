package ch07_oop;

import javax.sound.midi.SysexMessage;

public class ExOop2_02 {
	public static void main(String[] args) {
		/*
		 * 다형성 예제
		 * 
		 * Product 클래스
		 * 		멤버 변수 : int 가격(price), int 포인트(point)
		 * 		생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
		 * TV 클래스(Product의 자손 클래스)
		 * 		생성자(int) : 가격을 100 설정
		 * 		toString() : 메소드에서 TV 리턴
		 * 컴퓨터 클래스(Product의 자손 클래스)
		 * 		 생성자(int) : 가격을 200 설정
		 * 		 toString() : 메소드에서 Computer 리턴
		 * SmartPhone 클래스(Proudct의 자손 클래스)
		 * 		 생성자(int) : 가격을 150 설정
		 * 		 toString() : 메소드에서 SmartPhone 리턴	
		 *  
		 */
		
			Tv tv = new Tv(100);  //100
			Computer com = new Computer(200); //200
			SmartPhone sp = new SmartPhone(300); //300
			System.out.println(tv);		System.out.println(com);
			System.out.println(sp);
		}
	}
	class Product {
		int price, point;
		Product(int price) {
			this.price = price;		
			this.point = price / 10;
		}
		}
	class Tv extends Product {
		Tv(int price) {		
			super(price);	
			}
		public String toString() {		
			return "Tv:"+price;	
			}
	}
	class Computer extends Product {
		Computer(int price) {		
			super(price);	
			}
		public String toString() {	
			return "Computer:"+price;	
			}
	}
	class SmartPhone extends Product {
		SmartPhone(int price) {		
			super(price);	
			}
		public String toString() {		
			return "SmartPhone:"+price;
		}
	}