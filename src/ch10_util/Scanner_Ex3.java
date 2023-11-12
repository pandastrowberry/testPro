package ch10_util;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scanner_Ex3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("src/score.txt"));
		int sum = 0;
		int cnt = 0;
		
		while (sc.hasNext()) {
			String line = sc.nextLine();
			//System.out.println(line);
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			System.out.print(sc2.next() + " : ");
			sum = 0;
			cnt = 0;
			
			while (sc2.hasNextInt()) {
				int num = sc2.nextInt();
				sum += num;
				++cnt;
				System.out.print(num + " ");
			}
			System.out.println(sum + " " + (double)sum/cnt);
		}
	}
}
