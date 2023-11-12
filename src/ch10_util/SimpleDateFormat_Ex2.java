package ch10_util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormat_Ex2 {

	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2023-11-08";
		Date d = null;
		
		try {
			d = sf.parse(strDate);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(d);
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd은 E요일 입니다.");
		System.out.println(sf2.format(d));
	}
}
