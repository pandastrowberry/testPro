package ch14_Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_Ex10 {
	public static void main(String[] args) {
		List<Student> studentList1 = Arrays.asList(new Student("홍길동", 10), new Student("김나라", 20), new Student("장일등", 30));
		List<Student> studentList2 = Arrays.asList(new Student("나자바", 10), new Student("신용권", 20), new Student("유미선", 30));
		
		List<List<Student>> stu = new ArrayList<List<Student>>();
		stu.add(studentList1);
		stu.add(studentList2);
		
		long sum = stu.stream().flatMap(List :: stream).count();
		System.out.println(sum);
		
	}
}
