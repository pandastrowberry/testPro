package ch05_array;

public class ArrayEx_01 {
		public static void main(String[] args) {
			//배열 참조 변수 선언
			int [] arr1; 
			int arr2[];
			
			//배열 객체 생성
			arr1 = new int[5]; //주소 생성(int형 저장공간 5개 생성하고, 기본 값은 0으로 초기화)
			arr2 = new int[5]; 
			
			//배열 값 초기화
			arr1[0] = 10;
			arr1[1] = 20;
			arr1[2] = 30;
			//arr2 = arr1;
			//arr1[4] = 50;
			
			//배열 출력
			System.out.println("arr1 배열 : ");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("arr1[" + i + "] = " + arr1[i]);
			}
			
			System.out.println("-------------");
			
			System.out.println("arr2 배열 : ");
			for (int i = 0; i < arr2.length; i++) {
				System.out.println("arr2[" + i + "] = " + arr2[i]);
			}
			
			System.out.println("-------------");
			
			for (int a : arr1) {
				System.out.println(a);
			}
		}
}
