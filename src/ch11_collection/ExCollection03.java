package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExCollection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Set 예제 (중복x, 정렬)
		 * Lotto 번호(1 ~ 45) 생성기를 Set 가지고 출력 
		 * */
		Set<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(lotto);
	}
}

