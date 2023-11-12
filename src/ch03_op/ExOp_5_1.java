package ch03_op;

public class ExOp_5_1 {
		public static void main(String[] args) {
			//1. 잘못된 문장을 골라내고 그 이유를 설명하시오.
		    char a='a';      
		    //char b="a"; //홑따옴표로 묶음        
		    String c="a";       
		    //String d='a';//쌍따옴표로 묶음       
		    //char e= 'ab'; //char은 하나의 문자로만 구성     
		    String f="ab";     
		    //char g = ''; //'(문자 하나만)              
		    String h = ""; 
		    

		    //2. 잘못된 문장을 골라내고 그 이유를 설명하시오. 
			//byte var1 = 128; -128~ 127
			//short var2 = 128; 
			//int var3 = 128L; 작은 것으로 형변환
			//long var4 = 128L; 
			//float var5 = 123456.789123f; 소수점은 F/f 
			//double var6 = 123456.789123; 

			//3. 잘못된 문장을 고쳐서 에러가 발생하지 않도록 수정하시오.
			/*
			byte var1 = 127;
			short var2 = 128;
			int var3 = 128;
			long var4 = 128;
			var4 = var1;
			var1 = (byte)var3; //작은 것으로 형변환
			float var5 = 1.0f; //소수점은 f/F
			double var6 = 1.0; 
			var5 = (float)var6; //작은 것으로 형변환
			var6 = var5; 
			*/

			//4. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 변수 이름으로 사용할 수 있는 것을 고르시오.  
			//A. false //예약어x
			//B. default//예약어x
			//C._object //언더바로 시작 가능    
			//D. a-class //언더바만 허용	
			}
		}