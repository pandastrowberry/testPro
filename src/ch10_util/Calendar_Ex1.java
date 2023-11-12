package ch10_util;

import java.util.Calendar;

public class Calendar_Ex1 {
	public static void main(String[] args) {
			int year = 2023;
			int month = 11;
			Calendar sDay = Calendar.getInstance(); //시작일
			Calendar eDay = Calendar.getInstance(); //종료일
			//월의 경우 0~ 11까지 값을 가지기 때문에 1을 빼야 한다
			//ex) 2021년 7월 1일은 sDay.set(2021, 6, 1);처럼 해야 한다
			sDay.set(year, month -1, 1);
			eDay.set(year, month, 1); 
			//다음 달의 첫날에서 하루를 빼면, 현재 달의 마지막 날이 됨
			//ex) 12월 1일에서 하루를 빼면, 11월 30일
			eDay.add(Calendar.DATE, -1);
			//첫 번째 요일이 무슨 요일인지 알아내기
			int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			//eDay에 지정된 날짜 얻어오기
			int END_DAY = eDay.get(Calendar.DATE);
			
			System.out.println("1일 요일 : " + START_DAY_OF_WEEK);
			System.out.println("마지막 일 : " + END_DAY);
			
			
			System.out.println("      " + year + "년" + month + "월");
			System.out.println(" SU MO TU WE TH FR SA");
			
			//해당 월의 1일이 어느 요일인지에 따라 공백 출력
			//만일 1일이 수요일이면, 공백을 세 번 찍는다. (일요일부터 시작)
			for (int i = 1; i < START_DAY_OF_WEEK; i++) {
				System.out.print("   ");
			}
			
			for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
				System.out.print((i < 10)? "  " + i : " " + i);
				if(n % 7 == 0) {
					System.out.println();
				}
			}
		}
	}


