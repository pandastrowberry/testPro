package ch10_util;

import java.util.Random;

class Random_Ex2 {
	final static int RECORD_NUM = 10;
	final static String TABEL_NAME = "TEST-TABEL";
	final static String[]CODE1 = {"010", "011", "017", "018", "019"};
	final static String[]CODE2 = {"남자", "여자"};
	final static String[]CODE3 = {"10대", "20대","30대","40대","50대"};
	
	static Random r= new Random();
	
	public static void main(String[] args) {
		for (int i = 0; i < RECORD_NUM; i++) {
			System.out.println(" INSERT INTO " + TABEL_NAME + " VALUES (" 
	                  + " '" + getRandArr(CODE1) + "'" + ", '"
	               + getRandArr(CODE2) + "'" + ", '" + getRandArr(CODE3)
	               + "'" + ",  " + getRand(100, 200) // 100~200
	               + "); ");
			}
		}
	
	public static String getRandArr(String[] arr) {
		return arr[r.nextInt(arr.length)];
	}
	
	public static int getRand(int from, int to) {
		return r.nextInt((from) + (to - from));
	
	}
}	


