package 조영찬;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 *계급별/중대별/주특기별 특급전사 현황(각 과목별 일정 기준에 따라 등급화)
		 * 계급별/중대별/주특기별 불합격 현황
		 * 계급별/중대별/주특기별 총합/평균 개수 현황
		 * 사단 추가?
		 * 과목별 등수 ex) 팔굽혀펴기 최다 개수, 
		 */
	
		List li = new ArrayList();
		Scanner sc = new Scanner(new File("src/chan/ch11_challenge.txt"));
		while (sc.hasNext()) {
			String line = sc.next();
			Challenge p = new Challenge(line);
			li.add(p);
			//System.out.println(p);
		}
		  System.out.println("1) 중대별 검정 현황");
			
			Iterator<Challenge> it = li.iterator();
			Map <String, List<Challenge>> map1 = new HashMap<>();
			while(it.hasNext()) {
				Challenge p = it.next();
				if (!map1.containsKey(p.formation)) map1.put(p.formation, new ArrayList());
				map1.get(p.formation).add(p);
			}
			
			System.out.println(map1.keySet());
			
			for (String formation : map1.keySet()) {
				System.out.println(formation+" 체력검정 현황");
				for (Challenge p : map1.get(formation)) {  
					System.out.println(p);
				}
			}
	}
}
class Challenge {
	String soldier, skil, number;
	int pushup, situp, pullup, shooting;
	String formation;
	
	public Challenge(String line) {
		
		String[] lines = line.split(",");
		this.soldier=lines[0];
		this.number=lines[1];
		this.formation=lines[2];
		this.skil=lines[3];
		this.pushup=Integer.parseInt(lines[4]);
		this.situp=Integer.parseInt(lines[5]);
		this.pullup=Integer.parseInt(lines[6]);
		this.shooting=Integer.parseInt(lines[7]);
	}

	public String getSoldier() {
		return soldier;
	}

	public void setSoldier(String soldier) {
		this.soldier = soldier;
	}

	public String getSkil() {
		return skil;
	}

	public void setSkil(String skil) {
		this.skil = skil;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	@Override
	public String toString() {
		return "Challenge [soldier=" + soldier + ", skil=" + skil + ", number=" + number + ", pushup = " + pushup
				+ ", situp=" + situp + ", pullup=" + pullup + ", shooting = " + shooting + ", formation=" + formation + "]";
	}

}