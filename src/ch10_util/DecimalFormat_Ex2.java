package ch10_util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalFormat_Ex2 {

	public static void main(String[] args) {
		double number = 12345.673;
		String[] patterns = { "0", "#", "0.0", "#,###", "-#,###.##", "##E0", "#.#%", "'$'#,###" };
		
		for (int i = 0; i < patterns.length; i++) {
			DecimalFormat df = new DecimalFormat(patterns[i]);
			System.out.println(patterns[i] + " : " + df.format(number));
		}
	}
}
