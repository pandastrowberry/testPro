package ch05_array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_Array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기 
		 * java Exam7 10
		 * int num = Integer.parseInt(args[0]);
		 * 10의 약수 : 1,2,5,10,
		 */
				/*int num = Integer.parseInt(args[0]);
				System.out.println(num);
				
				for (int i = 1; i <= num; i++) {
					if(num != 0) {
						System.out.print(i + " ");
					}
				}
				System.out.println();/*
				
		/*
		 * 5명 학생의 국어,영어,수학 점수를 학생별로 총점, 평균을 출력하고
		 * 과목별 총점과 평균 출력하기
		 * [결과]
		 *          국어  영어  수학  총점  평균
		 * 1번학생 : 100  80  90  270 90.0..
		 * 2번학생 :  80  95  100 275 90.0..
		 * .....
		 * 과목총점 : 400 350  430
		 * 과목평균 : 90.??? 90.???  90.???  
		 */
				/*int score[][] = {
				  {100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}
				};
				int total[] = new int[3];
				System.out.println("\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < score.length; i++) {
					System.out.print(i + 1 + "번학생 : ");
					int sum = 0;
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
						sum += score[i][j];
						total[j] += score[i][j];
					}
					System.out.printf("%d \t %.2f \n", sum, (double)sum/score[i].length);
				}
				System.out.println("과목총점:\t");
				for (int i = 0; i < total.length; i++) {
					System.out.print(total[i] + "\t");
				}
				System.out.println();
				System.out.print("과목평균:\t");
				for (int i = 0; i < total.length; i++) {
					System.out.printf("%.2f\t", (double)total[i]/score.length);
				}*/
		
		/*
		 * 2차원 배열보다 가로,세로가 1씩 더 큰 배열 result를 생성하여,
		 * 마지막 행과열에 합계를 저장하는 프로그램을 구현하기 
		 */
	
				/*int score[][] = {
						  {100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}
						};	
				int [][] result = new int[score.length + 1][score[0].length + 1];
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j <score[i].length;j++) {
					result[i][j] = score[i][j];
					result[i][score[i].length] += score[i][j];
					result[score.length][j] += score[i][j];
					result[score.length][score[i].length] += score[i][j];
				}
			}
				for (int i = 0; i < result.length; i++) {
					for (int j = 0; j < result[i].length; j++) {
						System.out.printf("%5d", result[i][j]);
					}
					System.out.println();
				}*/

		/*
		 * 2차원 배열의 행의 합과 열의 합 구하기
		 * [결과]
		0row(행)의합:1
		1row(행)의합:30
		2row(행)의합:120
		3row(행)의합:300
		4row(행)의합:400
		0column(열)의합:161
		1column(열)의합:200
		2column(열)의합:210
		3column(열)의합:180
		4column(열)의합:100
		*/
				/*{
				int arr[][] = {{1},{10,20},{30,40,50},
						      {60,70,80,90},{60,70,80,90,100}};
				int trow[] = new int[arr.length];
				int maxcol = 0;
				for (int i = 0; i < arr.length; i++) {
					if (maxcol < arr[i].length) {
						maxcol = arr[i].length;
					}
				}
				
				int tcol[] = new int[maxcol];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						trow[i] += arr[i][j];
						tcol[j] += arr[i][j];
					}
					System.out.println(i + "row(행의 합" + trow[i]);
				}
				for (int i = 0; i < tcol.length; i++) {
					System.out.println(i + "column(열)의 합" + tcol[i]);
				}
		}*/
			/*
			 * 11 사이즈의 배열에 0~9 수를 2번 중복 하여넣고 나머지는 1번 넣어서 배열의 내용을 프린트 하세요 
			 * array length는
			 * 11임 예) {7,4,6,0,8,7,4,6,0,8,2,}  순서는 상관 없음
			 */
		 	 int num[] = new int[10];
		 	 for (int i = 0; i < num.length; i++) {
				num[i] = i;
			}
		 	 for (int i = 0; i < 1000; i++) {
				int f = (int)(Math.random() * 10);
				int t = (int)(Math.random() * 10);
				int temp = num[f];
				num[f] = num[t];
				num[t] = temp;
			}
		 	 int answer[] = new int[11];
		 	 System.arraycopy(num, 0, answer, 0, 5);
		 	 System.arraycopy(num, 0, answer, 5, 5);
		 	 answer [10] = num[5];
		 	 for (int ans : answer) {
				System.out.print(ans + " ");
			}
		 	 System.out.println();
	}
}	

