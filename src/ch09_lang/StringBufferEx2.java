package ch09_lang;

public class StringBufferEx2 {
		
	public static void main(String[] args) {
			/*
			 * StringBuffer는 리터럴 대입 불가
			 * 메소드 append 추가
			 * append하면 참조형 변수 바뀌지 않음
			 * */
			
			//StringBuffer sb = "01"; 
			StringBuffer sb = new StringBuffer("01");
			
			StringBuffer sb2 = sb.append(23);
			System.out.println(sb);
			System.out.println(sb2);
			System.out.println(sb == sb2);
			
			sb.append('4').append(56);
			
			StringBuffer sb3 = sb.append(78);
			System.out.println(sb == sb3);
			sb3.append(9.0);
			System.out.println("sb = " + sb);
			System.out.println("sb2 = " + sb2);
			System.out.println("sb3 = " + sb3);
			
			System.out.println("sb : deleteCharAt = " + sb.deleteCharAt(10));
			System.out.println("sb : delete = " + sb.delete(3, 6));
			
			System.out.println("sb : insert = " + sb.insert(3, "abc"));
			System.out.println("sb : replace = " + sb.replace(6, sb.length(), "END"));
			System.out.println("capacity = " + sb.capacity());
			sb.append("aaaaaaaaaaaaaaaaaaa");
			System.out.println(sb);
			System.out.println("capacity = " + sb.capacity());
			System.out.println("length = " + sb.length());
	}
}