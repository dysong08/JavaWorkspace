package com.kr.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 쿠게 두 종류로 나뉨 (for, while(do-while))
	 * 
	 * [표현법]
	 *  for(초기식;조건식;증감식) {  // ";"세미콜론을 통해 각각의 식을 구분하며 무조건 세미콜론 2개가 존재해야 함.
	 * 		반복적으로 실행시키고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 시작할 때 "초기에 딱 한 번만 실행"되는 구문
	 * 			(반복문에서 사용할 변수를 선언 및 초기화 할 때 사용)
	 * - 조건식 : 반복문이 실행 될 조건을 작성하는 구문
	 * 			조건식의 결과가 true면 반복문이 실행되고 false면 반복문을 멈추고 빠져나온다
	 * 			(보통 초기식에 사용한 변수를 가지고 조건식을 작성)
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 사용한 변수를 가지고 증감식을 작성)
	 * 
	 * 매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우에만 반복해서 실행한다.
	 * 
	 * 알아둘 것 : for문안에 초기식, 조건식, 증감식 각각 생략이 가능하긴 함
	 * 단, 반드시 ; ;은 작성해야 한다.
	 * 
	 * */
	
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력하고 싶은 경우
		
	
		for(int i = 0; i <= 4; i++ ) { 	// i값은 0, 1, 2, 3, 4, 5(false) 종료
			System.out.println("안녕하세요");
		}
		
		//for(;;) { 	//초기식,조건식,증감식이 없더라도 오류는 아님. 다만 무한반복 실행됨.
			//System.out.println("안녕하세요");
		//}
		
	
		for(int i =11; i < 16; i++) { 	// i값은 11, 12, 13, 14, 15, 16(false) 종료
			System.out.println("안녕하세요2");
		}
	
	
		for(int i = 1; i < 10; i+=2) { 	// i값은 1, 3, 5, 7, 9, 11(false) 종료
			System.out.println("안녕하세요3");
		}
		
	}		
	
	
	public void method2() {
		// 1~5까지 순차적으로 출력
		// i값이 1부터 6보다 작을때까지 1씩 증가시키면서 반복수행.
		
		for(int i = 1; i<6; i++) {	 	// 1 2 3 4 5
			System.out.print(i+" ");	
		}
		
		System.out.println();
		
		for(int i = 5; i>0; i--) {	 	// 5 4 3 2 1
			System.out.print(i+" ");	
		}
	
	}

	
	public void method3()  {
		// i값이 1에서부터 10사이의 홀수만 출력
		
		for(int i = 1; i <= 10; i++) {	//i값 10회반복
			if(i % 2 == 1) {
				System.out.print(i+" ");
		}
	}		//두가지 코드작성이 가능하나 아래코드가 실행횟수가 더 적음!
	
		for(int i = 1; i<10; i+=2) { 	//i값 1 3 5 7 9 11(false) 종료 =>5회반복
			System.out.print(i+" ");
		}
	}

	
	public void method4() {
		
		for(int i = 0; i <= 9; i++) {	// 1 2 3 4 5 6 7 8 9 10 
			System.out.print(i + 1 + " ");
		}
		
	}
	
	//산술연산+반복문
	public void method5() {
		//1~10까지의 총 합계
		
		int sum = 0;
			
		for(int i = 1; i <= 10; i++) {
			
//			sum += 1;
//			sum += 2;
//			sum += 3;
//			sum += 4;
//			sum += n;
			
			sum += i;	// i = 1 2 3 4 5 n... 
		}
		System.out.println("1부터 10까지의 총 합계는? : " + sum);
	}
	
	
	
	public void method6() {
		//1에서부터 사용자가 입력한 숫자까지의 모든 값을 더해서 출력해보기
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;							// 아래 방법도 가능함!
		for(int i = 1; i <= num; i++) {			// for(int i = 1; i <= num;)
			sum += i;							// sum += i++
		}
		System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
		
	}	
	
	
	
	public void method8() {
		// 1부터 매번 달라지는 랜덤값(1~10사이)까지의 총 합계
		
		/*
		 * java.lang.Math 클래스에 이미 정의되어 있는 random()메소드를 호출하여
		 * 매번 다른 랜덤값을 얻어올 수 있음.
		 * 
		 * Math.random(); => 반환형이 실수자료형
		 * 0.0 <= 랜덤값 < 1.0 
		 * */
		
		// 1~10사이의 랜덤값 구하기
		// 0.0 <= 랜덤값 < 1.0 
		// 10 곱하기
		// 0.0 <= 랜덤값 < 10.0
		// 1 더하기
		// 1.0 <= 랜덤값 < 11.0
		// 소숫점 버리기
		// 1 <= 랜덤값 <= 10
		
		// [표현법]
		// (int)(Math.random() * 10 + 1)
		// Math.random() * 출력하고자 하는 갯수 + 시작하고 싶은 수
		// 랜덤값 범위 == 시작수 ~ 시작수 + 출력하고자 하는 갯수
		
		double random1 = Math.random();
		int random = (int)(random1 * 10 + 1);
		System.out.println(random);
		
		int sum = 0;
		for(int i = 1; i <= random1; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총합은 %d 입니다. ", random, sum);
	}
	
	
	//반복문 + String
	public void method9() {
		
		String str = "hello";
//		h => sc.charAt(0);
//		e => sc.charAt(1);
//		l => sc.charAt(2);
//		l => sc.charAt(3);
//		o => sc.charAt(4);
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
		
		
		for(int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}
	} 
	
	
	public void method10() {
		// 사용자에게 문자열을 직접 입력받아서
		// 각 인덱스별로 문자를 하나씩 뽑아서 출력
		
		// apple 길이 : 5 / 01234
		// kiwi 길이 : 4 / 0123
		
		// 문자열의 마지막 인덱스 : 문자열의 길이 -1
		// 추출하고자 하는 인덱스 값의 범위 : 0 ~ (문자열의 길이 -1)
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열의 길이를 알려주는 메서드 => 문자열.length();
		System.out.println("입력한 문자열의 길이는 : " + str.length());
		
		for(int i = 0; i <= str.length() -1; i++) { //kiwi 입력시 i : 0 1 2 3
			System.out.println(str.charAt(i));
		}
		
	}
	
	
	
	public void method11() {
		//구구단 출력(2단)
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d \n", 2, i, (2*i));
		}
		
	} 
	
	
	public void method12() {
		// 사용자가 입력한 단을 출력
		// 단수는 2~9까지의 범위
		// 범위를 벗어난 단수를 입력시 "잘못입력했습니다(2~9사이의 정수 입력)"
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("단 수(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", dan, i, (dan*i));
			}
			
			
		}else {
			System.out.println("잘못입력했습니다(2~9사이의 정수 입력)");
		}

	}
	
	//중첩반복문
	public void method13() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 1; i <= 3; i++) {
			
		for( int j = 1; j <= 5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		}
		 	
	}
	
	
	
	public void method14() {
		// * * * * 
		// * * * * 
		// * * * * 
		// * * * * 
		
		
		for(int i = 1; i <= 4; i++) {
			
			for(int j = 1; j <= 4; j++) {
				System.out.print( "* ");
			}
			System.out.println();
			}		 	
		}
		
	
		
	public void method15() {
		//1***
		//*2**
		//**3*
		//***4
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == j) {
					System.out.print(i);
				} else {

					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method16() {
		// 2단부터 9단까지 모든 단을 출력하기
		// 각 단 시작시 "--- x단 ---"를 출력

		for (int i = 2; i <= 9; i++) {
			System.out.println("--- " + i + "단 ---");

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d \n", i, j, (i * j));
			}
			System.out.println();
		}

	}














}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
