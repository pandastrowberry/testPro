package ch15_IOstream;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class File_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currDir = System.getProperty("user.dir");
		System.out.println(currDir);
		File dir = new File(currDir);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH : mm");
		File[] files = dir.listFiles();
		for (File f : files) {
			String name = f.getName();
			String attribute = "";
			String size = "";
			if(f.isDirectory()) {
				attribute = "DIR";
			}else {
				size = f.length() + "";
				attribute = f.canRead()? "R" : " ";
				attribute = f.canRead()? "W" : " ";
				attribute = f.canRead()? "H" : " ";
				
			}
			System.out.printf("%s %3s %6s %s%n", df.format(new Date(f.lastModified())), attribute, size, name);	
		}
	}

}
