package ch15_IOstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("src/ch15_IOstream/buffered.txt");
		String data = null;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		//fw.flush();
		fw.close();
	}
	
}
