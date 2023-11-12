package ch10_util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormat_Ex1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}
