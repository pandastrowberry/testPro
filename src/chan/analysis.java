package chan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *계급별/중대별/주특기별 특급전사 현황(각 과목별 일정 기준에 따라 등급화)
		 * 계급별/중대별/주특기별 불합격 현황
		 * 계급별/중대별/주특기별 총합/평균 개수 현황
		 * 사단 추가?
		 * 과목별 등수 ex) 팔굽혀펴기 최다 개수, 
		 */
		try {
			Scanner sc = new Scanner(new FileInputStream("src/ch11_challenge.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
