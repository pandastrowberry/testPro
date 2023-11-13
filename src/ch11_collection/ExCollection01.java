package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExCollection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 홀수 개의 숫자를 입력받아 정렬하고, 숫자의 평균과 중간값 출력
		 * 10 40 30 60 30
		 * 
		 * 10 30 30 40 60
		 * 
		 * 평균 값 : 
		 * 중간 값 : 
		 * */
		
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(60);
		list.add(30);
		list.add(70);
		list.add(55);
		
		for (int n : list) {
			sum += n;
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("평균 : " + sum/list.size());
		System.out.println("index : " + list.size()/2);
		System.out.println("중앙값 : " + list.get(list.size()/2));
	}

}
