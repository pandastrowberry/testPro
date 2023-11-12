package ch04_control;

import java.util.Scanner;

public class ExCont08 {

	public static void main(String[] args) {
				/*
				  사과를 사과 상자에 담기로 한다. 1개의 상자에 10개의 사과를 담을 수 있다.
				  필요한 사과 상자의 갯수를 출력하기
				  [결과]
				  사과의 갯수를 입력하세요
				  22
				  필요한 상자의 갯수 : 3
				 
				  사과의 갯수를 입력하세요
				  30
				  필요한 상자의 갯수 : 3
				 */
		
				System.out.println("");
				Scanner scan = new Scanner(System.in);
				//int  = scan.nextInt();
				
				/*if (num <= 10) {
					System.out.println("필요한 상자의 개수 : " + "1");
				}
				else if(num / 10 == 0) {
					System.out.println("필요한 상자의 개수" + (num / 10));
				}
				else{
					System.out.println("필요한 상자의 개수 : " + (num % 10 + 1));
				}*/
				/*for (int i = num; i <= num; i++) {
					if (i <= 10) {
						System.out.println("필요한 상자의 개수 : " + 1);
					}
					else if (num % 10 == 0) {
						System.out.println("필요한 상자의 개수 : " + (num / 10));
					}
					else {
						System.out.println("필요한 상자의 개수 : " + (num % 10 + 1));
					}
				}*/
				
				/*
				 system.out.println("필요한 상자의 개수" + (num % 10 == 0)? (num / 10) : (num / 10 + 1))
				 */
				
		
				/*
				  조건 연산자를 이용하기, 삼항연산자 이용하기
				  점수를 입력받아서 90이상이면 "A학점" 80이상이면 "B학점" 70이상이면 "C학점"
				              60이상이면 "D학점" 그외는 "F학점" 출력하기
				 */
				/*System.out.println("점수를 입력하세요");
				Scanner scan = new Scanner(System.in);
				int score = sc.nextInt();
				
				if (score >= 90) {
					System.out.println("A학점");
				}
				else if (score >= 80) {
					System.out.println("B학점");
				}
				else if (score >= 70) {
					System.out.println("C학점");
				}
				else if(score >= 60) {
					System.out.println("D학점");
				}
				else {
					System.out.println("F학점");
				}*/
				
				/*System.out.println((score >= 90)? "A학점" : 
										(score >= 80)? "B학점" : 
												(score >= 70)? "C학점" : 
													(score >= 60)? "D학점" : "F학점");  
				*/

				/*
				 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장 작은 10의 배수를 구하기
				 * 10의배수에 입력수를 뺀 값을 출력하기 : 
				 * [결과]
				 * 10부터 99까지의 수를 입력하세요
				 * 24
				 * 30 - 24 = 6
				 * 
				 * 10부터 99까지의 수를 입력하세요
				 * 20
				 * 20 - 20 = 0
				 * 
				 * 10부터 99까지의 수를 입력하세요
				 * 77
				 * 80 - 77 = 3
				 */
	
				/*System.out.println("10부터 99까지의 두자리수를 입력하세요");
				Scanner sc = new Scanner(System.in);
				int num = scan.nextInt();
				int num_ = (num + 9) / 10 * 10; 	
				int diff = num_ - num;
				System.out.println(num_ + "-" + num + " = " + diff );
				*/
			}
	}