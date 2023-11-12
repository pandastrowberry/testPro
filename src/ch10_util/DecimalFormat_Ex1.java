package ch10_util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalFormat_Ex1 {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###,##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		
		try {
			Number num = df1.parse("1,234,56");
			double d = num.doubleValue();
			System.out.println(d + " -> " + df1.format(num));
			System.out.println(d + " -> " + df2.format(num));
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
