package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_Ex3 {
	public static void main(String[] args) {
		/*
		 * 화면에서 여러개의 수를 입력받고, 그 중에서 홀수인 자연수들의 합, 홀수 중에서 최댓값/최솟값과 그 값의 인덱스 출력 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수를 여러개 입력하세요(종료 : 0)");
		List<Integer>list = new ArrayList<Integer>();
		int sum = 0;
		while (true) {
			int num = scan.nextInt();
			if(num % 2 == 1) {
				list.add(num);
				sum += num;
			}
			else if(num == 0) {
				break;
			}
		}
		System.out.println("입력된 홀수 : " + list);
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("홀수의 합 : " + sum);
		System.out.println("최댓값 : " + Collections.max(list) + ", index : " + list.indexOf(Collections.max(list)));
		System.out.println("최솟값 : " + Collections.min(list) + ", index : " + list.indexOf(Collections.min(list)));
	}
}
