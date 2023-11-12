package ch05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 100까지 임의의 수 10개를 배열에 저장하고, 정렬해서 출력
		 * 단, Arrays.sort() 메서드 사용x
		 */
	 	int[] arr = new int[10];
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random() * 100) + 1;
		}
		 for (int i = 0; i < arr.length; i++) {
				boolean change = false; //
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						change = true;
					}
				}
				if (!change) break;
			}
		 		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		 	System.out.println();
		 			
		}
	 }
