package ch11_collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 대용량 데이터를 파일로 생성
		 * 
		 * 계급별/중대별/주특기별 특급전사 현황(각 과목별 일정 기준에 따라 등급화)
		 * 계급별/중대별/주특기별 불합격 현황
		 * 계급별/중대별/주특기별 총합/평균 개수 현황
		 * 사단 추가?
		 * 과목별 등수 
		 */
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] soldier = {"이병", "일병", "상병", "병장", "하사", "중사", "상사", "소위", "중위", "대위"};
		String[] formation = {"1중대", "2중대", "3중대"};
		String[] number = {"16-", "17-", "92-", "18-", "08-", "13-", "03-", "11-", "10-", "03-"};
		String[] skil = {"보병", "포병", "공병", "수색대", "저격수", "운전병", "전차대대", "의무병"};
		String[] test1 = {"팔굽혀 펴기"};
		String[] test2 = {"윗몸 일으키기"};
		String[] test3 = {"턱걸이"};
		String[] test4 = {"사격"};
		
		int limit = 0; 
		int con = 0;
		
		try {
			fos = new FileOutputStream("src/ch11_challenge.txt");
			ps = new PrintStream(fos);
			while(limit ++ < 100) {
				ps.print(soldier[(int) (Math.random() * 10)] + ", ");
				ps.print(number[(int) (Math.random() * 10)] + ", ");
				ps.print(formation[(int) (Math.random() * 3)] + ", ");
				ps.print(skil[(int) (Math.random() * 8)] + ", ");
				
				ps.print(test1[(int) (Math.random() * 1)] + ", ");
				ps.print((int) (Math.random() * 121) + ", ");
				ps.print(test2[(int) (Math.random() * 1)] + ", ");
				ps.print((int) (Math.random() * 101) + ", ");
				ps.print(test3[(int) (Math.random() * 1)] + ", ");
				ps.print((int) (Math.random() * 21) + ", ");
				ps.print(test4[(int) (Math.random() * 1)] + ", ");
				ps.print((int) (Math.random() * 21) + " ");
				
				ps.println();
				System.out.println("파일 생성 완료");
				ps.flush();

			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
