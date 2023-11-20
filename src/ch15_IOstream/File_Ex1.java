package ch15_IOstream;

import java.io.File;

public class File_Ex1 {
	public static void main(String[] args) {
		String filepath = "c:\\Program Files";
		File f1 = new File(filepath);
		String files[] = f1.list();
		for (String f : files) {
			File f2 = new File(filepath, f);
			if(f2.isDirectory())
				System.out.println("%s : 디렉토리%n");
			else if(f2.isFile())
				System.out.printf("%s : 파일(%, dbyte)%n", f, f2.length());
		}
	}
}
