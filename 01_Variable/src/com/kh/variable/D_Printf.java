package com.kh.variable;

public class D_Printf {
	
	
	/*
	 * system.out.print("출력하고자 하는 값");  => 값을 출력
	 * system.out.println("출력하고자 하는 값"); => 값을 출력 +줄바꿈처리
	 * 
	 * system.out.printf("출력하고자 하는 형식", 출력하고자 하는 값, 출력하고자 하는 값, ...");
	 * =>f는 format(형식)을 의미
	 * =>형식에 맞춰서 값들이 출력된다.(줄바꿈처리X)
	 * =>문자열 안에 출력하고자 하는 값들을 다음과 같은 형식으로 미리 위치를 잡아줘야 한다.
	 * 
	 * 형식
	 * %d : 정수
	 * %f : 실수
	 * %c : 문자
	 * %s : 문자열 
	 */
	
	
	public void printFtest() {
		
		//정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx를 출력
		
		// 1. println문 사용
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		
		// 2. printf문 사용 => 정수값의 형식인 %d를 사용해서 완성. 줄바꿈기능X 직접 개행문자 추가할 것(\n).
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1 , iNum2);
		
		
		//ex) 10 + 20 =30을 출력해보기
		int a = 10;
		int b = 20;
		
		// 1. println문 사용해서 출력
		System.out.println(a + " + " + b + " = " + (a+b));
		
		// 2. printf문 사용해서 출력
		System.out.printf("%d + %d = %d\n", a, b, (a+b));
		
		
		System.out.printf("%5d \n", a);    // %5d  : 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d \n", a);   // %-5d : 5칸의 공간 중 왼쪽 정렬
		
		
		
		//실수 테스트
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n", 10.0);   
		// %f : 소숫점 아래 7번째 줄에서 반올림되어 소숫점아래 6번째까지만 출력됨(기본값)
		
		System.out.printf("dNum : %.1f \n", dNum);
		// %.1f : 소숫점 아래 2번째에서 반올림하여 소숫점아래 1번째까지만 출력하라 라는 의미 => 4.3
		// %.2f : 소숫점 아래 3번째에서 반올림하여 소숫점아래 2번째까지만 출력하라 라는 의미 => 4.28
		// .자릿수로 소숫점 제어가 가능하다.
		
		
		//printf : 포맷 한 번으로 가독성이 좋게 출력이 가능하다.
		// 단, 지정한 포맷의 갯수와 종류, 뒤에 오는 변수의 갯수와 종류가 정확하게 일치해야 한다.
		
		// 문자와 문자열 테스트
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%c %s %% \n", ch, str);
		// ctrl + shift + x/y => 대문자 / 소문자 전환
		
	
		
	}
	
	
	
	
	
	
	
	
}
