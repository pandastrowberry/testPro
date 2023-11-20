package chan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class analysis {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 *계급별/중대별/주특기별 특급전사 현황(각 과목별 일정 기준에 따라 등급화)
		 * 계급별/중대별/주특기별 불합격 현황
		 * 계급별/중대별/주특기별 총합/평균 개수 현황
		 * 사단 추가?
		 * 과목별 등수 ex) 팔굽혀펴기 최다 개수, 
		 */
	
		List Challenge = new ArrayList();
		Scanner sc = new Scanner(new File("src/ch11_challenge.txt"));
		while (sc.hasNext()) {
			String line = sc.next();
			Challenge p = new Challenge();
			Challenge.add(p);
			System.out.println(p);
		}
		  System.out.println("1) test1별 검정 현황");
			
			Iterator<Challenge> it = Challenge.iterator();
			Map <Integer, List<Challenge>> map1 = new HashMap<>();
			while(it.hasNext()) {
				Challenge p = it.next();
				if (!map1.containsKey(p.formation)) map1.put(p.formation, new ArrayList());
				map1.get(p.test1).add(p);
			}
			
			System.out.println(map1.keySet());
			
			for (Integer formation : map1.keySet()) {
				System.out.println(formation+"중대별 체력검정 현황");
				for (Challenge p : map1.get(formation)) {   
				}
			}
	}
}
class Challenge {
	String soldier, formation, skil, number, test1, test2, test3, test4;
	
	public Challenge() {
		String[] skil = line.split(",");
		if (skil.length == 5)
			this.skil = skil[4];
		else
			this.skil = "";
	}

	
}