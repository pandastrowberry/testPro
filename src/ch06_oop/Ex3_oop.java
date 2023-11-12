package ch06_oop;


public class Ex3_oop {
		public static void main(String[] args) {
			 //1. card1 선언, 객체 생성
				Card card1 = new Card();
			 //2. card1.kind = "Heart", number = 1로 초기화 
				card1.kind = "Heart";
				card1.number = 1;
			 //3. card1 출력
				System.out.println(card1);
			 //4. card2 객체 생성
				Card card2 = new Card();
			 //5. card.kind = "Spade", number = 1로 초기화
				card2.kind = "Spade";
				card2.number = 1;
			 //6. card2 출력
				System.out.println(card2);
			 //7. card의 static 가로와 세로를 (50, 50)으로 변경
				Card.width = 50;
				Card.height = 50;
			 //8. card1 출력
				System.out.println(card1);
			 //9. card2 출력
				System.out.println(card2);
		}
    }

class Card {
	String kind;
	int number;
	static int width;
	static int height;
	
	
}

