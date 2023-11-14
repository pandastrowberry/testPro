package ch11_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExCollection04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = 
				new Scanner(new File("src/ch11_challenge.txt"));
		List<Challenge> li = new ArrayList<Challenge>();
		Map<String, Challenge> map = new HashMap<>();
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] str = line.split(",");
		}
		Collections.sort(li, new Comparator<Challenge>() {

			@Override
			public int compare(Challenge o1, Challenge o2) {
				return o2.tot - o1.tot;
			}
		}
	);
		
		for (Challenge s : li) {
			System.out.println(s);
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("계급을 입력 하세요. (종료 : 9999)");
	    while(true) {
	    	String input = sc2.nextLine();
	    	if (input.equals("9999")) { 
	    		break; 
	    	}
	  
	    /*
	    	for (int i=0 ; i < li.size() ; i++) {
	    		if (li.get(i).stno.equals(input)) {
	    			System.out.println((i+1)+"등:"+ li.get(i));
	    		}
	    	}
	    */
	    	Challenge s = map.get(input);
	    	System.out.println("등수 : "+ (li.indexOf(s)+1));
	    	System.out.println(s);
	    }
	    
		/*
		 * 1. 합계를 내림차순으로 정렬하여 출력 
		 * 2. stno를 입력해서 등수 확인
		 */
	}
}

class Challenge {
	String soldier;
	int test1;
	int test2;
	int test3;
	int test4;
	int tot;
	public Challenge(String soldier, int test1, int test2, int test3, int test4) {
		super();
		this.soldier = soldier;
		this.test1 = test1 ;
		this.test2 = test2;
		this.test3 = test3;
		this.test4 = test4;
		tot = test1 + test2 + test3 + test4;
	}
	@Override
	public String toString() {
		return "Challenge [solider=" + soldier + " test1 = " + test1 + ", test2 = " + test2 + ", test3 = " + test3 + ", test4 = " + test4 + "tot = " + tot + "]";
	}
}		