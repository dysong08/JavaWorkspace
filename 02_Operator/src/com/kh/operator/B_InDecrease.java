package com.kh.operator;

public class B_InDecrease {



		/*
		 * 증감연산자(단항연산자) ++ --
		 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
		 * 		++변수, 변수++ => (전위연산자), (후위연산자)
		 * -- : 변수에 담긴 값을 1 감소시키는 연산자
		 * 		--변수, 변수-- => 
		 * 
		 * (증감연산자)변수 : 전위연산 -> 선증감 후처리
		 * 변수(증감연산자) : 후위연산 -> 선처리 후증감
		 * 
		 * int num = 1;
		 * 
		 * num = num + 1  == num++;
		 * */
		
		
		
		public void method1() {
			// 전위연산(J)
			int num = 10; 
			
			System.out.println("전위연산 적용전 num : " + num);	//10
			System.out.println("1회 수행후 결과 : " + ++num);	//11
			System.out.println("2회 수행후 결과 : " + ++num);	//12
			System.out.println("3회 수행후 결과 : " + ++num);	//13
			
			System.out.println("최종 num : " + num);			//13
			System.out.println("=====================");
			
			
			
			//후위연산(P)
			int num2 = 10;
			
			System.out.println("후위연산 적용전 num2 : " + num2);//10
			System.out.println("1회 수행후 결과 : " + num2++);	//10
			// 출력당시에는 10이 출력되고 출력처리가 끝난 후 11로 후증감처리 된다.
			System.out.println("2회 수행후 결과 : " + num2++);	//11
			System.out.println("3회 수행후 결과 : " + num2++);	//12
			
			System.out.println("최종 num2 : " + num2);
			System.out.println("=====================");	//13
			

			
		}
		
		
		
		public void method2() {
			
			int a = 10;
			int b = ++a;  
			
			System.out.println(a);
			System.out.println(b);
			System.out.println();
			//++가 선처리 해주기 때문에 a=11 b=11
			
			int c = 10;
			int d = c++;
			
			System.out.println(c);
			System.out.println(d);	
			//++가 후처리 하기 때문에 c=11 d=10
			
			//예측
			int num = 20;
			
			System.out.println("현재 num : " + num);	//출력시 : 20, num : 20 
			System.out.println("++num ? " + ++num);	//출력시 : 21, num : 21 
			System.out.println("num++ ? " + num++); //출력시 : 21, num : 22 
			System.out.println("--num ? " + --num); //출력시 : 21, num : 21
			System.out.println("num-- ? " + num--); //출력시 : 21, num : 20
			
			System.out.println("최종 num ? " + num); //num : 20
			

		}
		
		
		
		public void method3() {
			
			int num1 = 20;
			int result1 = num1++ *3;
			// num1 = 21, result1 = 60 => result1 = 20 * 3 연산처리 후 num1 = num1 +1;
			
			System.out.println("num1 : " + num1);
			System.out.println("result1 : " + result1);
			
			
			int num2 = 20;
			int result2 = ++num2 *3;
			//num2 = 21, result1 = 21 * 3 
			
			System.out.println("num2 : " + num2);
			System.out.println("result2 : " + result2);
			
			
			
		}
		
		public void method4() {
			
			int a = 10;
			int b = 20;
			int c = 30;
		
			//출력될 값 예측해보기.
			
			//a++; 							10
			//((++a) + (b++))				12+20 = 32
			//(a++) + (--b) + (--c)			12+20+29 = 61  
			// a? b? c?						13 20 29
			
			
			System.out.printf("a : %d, b : %d, c : %d", a, b, c);
			
		}
	
		
		
		public void quiz() {
			
			int a = 5;
			int b = 10;
			
			int c = (++a) + b; 				//c = 6 + 10 = 16     //a=6 b=10 c=16
			int d = c / a;					//d = 16 / 6 = 2		//d=2
			int e = c % a;					//e = 16 % 6 = 4		//e=4
			
			int f = e++;					//f = 4					//e=5 f=4
			int g = (--b) + (d--);			//g = 9 + 2 = 11		//b=9 d=1
			
			int h = 2;											//h=2
			int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); 
//			a=6 b=9 c=16 d=1 e=5 f=4 g=11 h=2 
			
			

//			6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
//			6 + 9 / 3 * 10 % 8
//			6 + 3 * 10% 8
//			6 + 30 % 8
//			6 + 6
//			12
			
		
//			a7 b9 c15 d1 e6 f4 g10 h2 i12
			
			
			System.out.printf("a : %d, b : %d, c : %d, d : %d, e : %d, f : %d, g : %d, h : %d, i : %d", a,b,c,d,e,f,g,h,i);
		}
		
		
		
		
		
	
		}

