package ch06_oop;
class Math1 {
	int add1(int a, int b)
		{
		return
			a + b;
		}

	long add2(int a, int b)
		{
		return 
				a + b;			
		}	
	
	static double add3 (int a, int b) 
		{
		return 
				a + b;
		}
}	
public class MethodEx1 {
	public static void main(String[] args) {
		/* 메소드 구성
		 *[접근제어자] 리턴 타입 메소드명 [매개변수 목록] => 선언 []는 생략가능
		 *{     문장        }               => 구현
		 *리턴 타입 : 메소드 종료 후 전달되는 값의 자료형
		 *         void인 경우, 리턴 값x
		 *매개변수 : 메소드 호출시 전달되는 초기화 값
		 *		  매개변수가 없으면 ()로 표현
		 *return : return이 실행되면 메소드 종료
		 *         리턴타입이 void가 아니면 반드시 return 리턴값; 구현
		 *         void이면 return 생략 가능(메소드의 마지막 ")" 메소드 종료)                    
		 */
		 Math1 m1 = new Math1();
		 int i = m1.add1(10, 10);
		 long l = m1.add2(10, 10);
		 double d = m1.add3(10, 20);
		 System.out.println(m1.add1(10, 20));
		 System.out.println(i);
		 System.out.println(l);
		 System.out.println(d);
	}	
}
