package ch08_exp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ResourceTry {
	   public static void main(String[] args) {
		  
		   try (Scanner sc = new Scanner(new File("Text11"))) {
			   System.out.println(sc.nextLine());
		   }
		   catch (FileNotFoundException e) {
			   e.printStackTrace();
	   }
	  }
}	 
