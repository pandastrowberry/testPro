package ch10_util;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scanner_Ex2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("src/score.txt"));
		int sum = 0;
		int cnt = 0;
		
		while (sc.hasNext()) {
			String line = sc.nextLine();
			//System.out.println(line);
			
			String[] str = line.split(",");
			System.out.print(str[0] + " : ");
			sum = 0;
			cnt = 0;
			for (int i = 0; i < str.length - 1; i++) {
				int num = Integer.parseInt(str[i + 1]);
				sum += num;
				++cnt;
				System.out.print(num + " ");
			}
			System.out.println(sum + " " + (double)sum/cnt);
		}
	}
}
