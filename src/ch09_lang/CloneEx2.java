package ch09_lang;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5};
		
		//배열 arr을 복제해서 같은 내용의 새로운 배열 만들기
		int[] arrClone = arr.clone();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}