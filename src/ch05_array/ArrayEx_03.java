package ch05_array;

import java.util.Iterator;

public class ArrayEx_03 {
		public static void main(String[] args) {
			/* 로또 번호 추첨기
			 * 1. 1 - 45 할당
			 * 2. 중복 없이 무작위로 6개의 수 생성
			 * 3. 오름차순 정렬
			 */
			
			//배열 선언 후 주소 생성
			int[] balls = new int[45];
			int[] lotto = new int[6];
			
			//주소에 들어갈 값 초기화
			for (int i = 0; i < balls.length; i++) {
				balls[i] = i + 1;
				//System.out.println(balls[i]);
			}
			
			//ball 섞기
			for (int i = 0; i < 1000; i++) { //왜 1000?
				int f = (int) (Math.random() * 45); //0 ~ 44 index
				int t = (int) (Math.random() * 45); 
				
				//swap 알고리즘
				int tmp = balls[f];
				balls[f] = balls[t]; //위치 바뀔 경우 발생하는 문제? 
				balls[t] = tmp;
			}
			
			//
			for (int i = 0; i < balls.length; i++) {
				System.out.print(balls[i] + " ");
			}
			System.out.println();
			
			//balls의 0 ~ 5 인덱스의 자료를 lotto 0 ~ 5 index에 복사
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = balls[i];
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
			
			//sort ascending
			for (int i = 0; i < lotto.length; i++) {
				boolean change = false; //
				for (int j = 0; j < lotto.length - 1 - i; j++) {
					if (lotto[j] > lotto[j + 1]) {
						int temp = lotto[j];
						lotto[j] = lotto[j + 1];
						lotto[j + 1] = temp;
						change = true;
					}
				}
				if (!change) break;
			}
			for (int i : lotto) {
				System.out.print(i + " ");
			}
		}
			
}
