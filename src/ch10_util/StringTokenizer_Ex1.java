package ch10_util;

import java.util.StringTokenizer;

public class StringTokenizer_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) { //반복자
			System.out.println(st.nextToken());
		}
		
		System.out.println("==================");
		String expression = "x=100*(200+300)/2";
		StringTokenizer st1 = new StringTokenizer(expression,"+-*/=()", false);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}

