package ch06_oop;


public class Ex2_oop {
		public static void main(String[] args) {
			/*
			 * Rectangle 객체 3개 저장하는 배열 생성 후 각각의 넓이와 둘레 출력
			 * 
			 * 0번 직사각형 : 가로 10, 세로 20
			 * 1번 직사각형 : 가로 11, 세로 21
			 * 2번 직사각형 : 가로 12, 세로 22
			 * 
			 * 
			 * (출력)
			 * 넓이 : 10 * 5
			 * 둘레 : (10 + 5) * 2
			 */
			Rectangle arr[] = new Rectangle[3];
			
			Rectangle r1 = new Rectangle();
			r1.width = 10;
			r1.height = 20;
			
			Rectangle r2 = new Rectangle();
			r2.width = 11;
			r2.height = 21;
			
			Rectangle r3 = new Rectangle();
			r3.width = 12;
			r3.height = 22;
			
			arr[0] = r1;
			arr[1] = r2;
			arr[2] = r3;
			
			for (Rectangle r : arr) {
				r.area();
				r.length();
			}
			
			System.out.println("--------------");
			Rectangle arr2[] = new Rectangle[3];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = new Rectangle();
				arr2[i].width = 10 + i;
				arr2[i].height = 20 + i;
				arr2[i].area();
				arr2[i].length();
			}

			System.out.println("--------------");
			Rectangle arr3[] = new Rectangle[3];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = new Rectangle(10 + i, 20 + i); 
				arr2[i].area();
				arr2[i].length();
			}
		}
    }