package ch14_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class Stream_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * File에서 읽은 내용을 스트림으로 생성
		 * Path에서 읽은 파일 이름을 출력
		 * */
		System.out.println("파일의 내용을 스트림을 이용하여 화면에 출력");
		BufferedReader br = new BufferedReader(new FileReader(new File("src/ch14_Stream/Stream_Ex1.java")));
		br.lines().forEach(s -> System.out.println(s));
		
		Scanner scan = new Scanner(new File("src/ch14_Stream/product.txt"));
		scan.tokens().forEach(p -> System.out.println(p));
		
		
		System.out.println("src/ch14_Stream 폴더 목록====");
		System.out.println();
		Path path = Paths.get("src/ch14_Stream");
		Stream<Path> st = Files.list(path);
		st.forEach(p -> System.out.println(p.getFileName()));
		
		System.out.println("C:");
		System.out.println();
		path = Paths.get("C:/");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName() + (p.toFile().isDirectory()? ">": "")));
		
	}
};