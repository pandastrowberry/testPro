package ch10_util;

import java.util.Random;

public class Random_Ex1 {
	public static void main(String[] args) {
			/* Random : 임의의 난수를 생성하는 클래스
			 * Math 클래스의 random()메소드를 통해서 난수를 생성할 때는 double 자료형만 가능했지만,
			 * Random 클래스를 이용하면, boolean/int/long/float/double 등 자료형별 난수를 만들 수 있다 
			 * 또한, 난수를 만드는 알고리즘에 사용되는 종자 값을 설정해서 다양한 난수를 만들 수 있다
			 * seed 값이 같은 Random 클래스는 같은 난수를 산출
			 * */
		Random rand = new Random();
		rand.setSeed(1); //seed 고정 설정
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis()); //seed 변경
		
		System.out.println("rand ==>");
		
		for (int i = 0; i < 5; i++) 
			System.out.println(i + ":" + rand.nextInt(100));
		System.out.println();
		
		System.out.println("rand2 ==>");
		
		for (int i = 0; i < 5; i++) 
			System.out.println(i + " : " + rand2.nextInt(100));
		}
	
	}
	


