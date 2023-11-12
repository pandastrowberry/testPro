package ch05_array;

import java.util.Iterator;

public class ArrayEx_04 {
		public static void main(String[] args) { //String args[] 
			/*
			 * command 라인에서 파라미터 받기
			 * javac ArrayEx6.java
			 * c:\aaa\java ArrayEx6 홍길동 김삿갓 aaa bbb
			 * 우클릭 -> run as -> run configuration -> tab : arrangements
			 */
			System.out.println(args.length);
			if(args.length == 0) {
				System.out.println("command line에 파라미터를 입력하세요");
				System.out.println("java ch05_array.ArrayEx_01 홍길동 김삿갓 aaa");
				return;
			}
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "]=" + args[i]);
				
			}
		}
}
