package ch05_array;

import java.util.Iterator;

public class ArrayEx_02 {
		public static void main(String[] args) {
			/*
			 * 배열 선언시 초기화하는 예제 + 배열 선언 생성(주소) 초기화
			 * - = new int[5] 생성
			 * - = {10, 20, 30, 40, 50} 생성과 동시에 주소 초기화
			 * - = new int [] {10, 20, 30, 40, 50} 생성과 동시에 주소 초기화
			 */
			
			int arr[] = {10, 20, 30, 40, 50};
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "]= " + arr[i]);
			}
			System.out.println();
			
			//생성 초기화(향상된 for문)
			arr = new int[] {100, 200, 300};
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
}
