package ch05_array;

import java.util.Iterator;

public class ArrayEx_06 {
		public static void main(String[] args) { //String args[] 
			/*
			 * 2차원 가변 배열 초기화 
			 */
			
			int[][] arr = {{10, 20}, {30, 40} ,{50, 60, 70}}; // [3][x]
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
				}
				System.out.println();
			}
		}
}
