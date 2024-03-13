package com.kr.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * switch문과 if문은 동일한 조건문
	 * 
	 * 차이점 : 
	 * if(조건식) => 조건식을 복잡하게 기술 가능, 범위 제시 가능
	 * switch(조건식) => 정확한 값의 조건만 기술 가능 (동등비교만 수행가능)
	 * 
	 * [표현법]
	 * switch(동등비교할 대상) {
	 * case 값1 : 실행할 코드 1;   	//동등비교할 대상과 값1이 일치할 경우 실행할 코드
	 * 			break;
	 * case 값2 : 실행할 코드 2; 
	 * 			break;
	 * case 값n : 실행할 코드 n;
	 * 			break;
	 * default : 실행할 코드  		// default : if~else의 else와 같은 역할
	 * 							// 위의 값1, 값2, 값n...과 비교대상이 모두 일치하지 않을 경우
	 * 							// default 내의 실행할 코드가 실행된다
	 * 
	 * switch문은 언제쓰나?
	 * 항상 정확하게 동일한 시간으로 연산결과가 수행되어야 하는 경우
	 * ex) 키보드입력, 마우스입력 등
	 * */

	
	public void method1() {
		// 1~3사이의 정수값을 입력받아 
		// 1인 경우 "빨간불입니다"
		// 2인 경우 "파란불입니다"
		// 3인 경우 "초록불입니다"
		// 잘못입력한 경우 "잘못입력했습니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(양수)를 입력 : ");
		int num = sc.nextInt();		
		
//		if(num ==1) {
//			System.out.println("빨간불입니다");
//		} else if( num == 2) {
//			System.out.println("파란불입니다");
//		} else if(num == 3) {
//			System.out.println("초록불입니다");
//		} else {
//			System.out.println("잘못입력했습니다");
//		}
		
		 
		// 위의 if문을 switch문으로 작성하기
		// break; => 반복문, switch문에만 사용가능함
		
		switch(num) {
		case 1 : 
			System.out.println("빨간불입니다");
			break;
		case 2 : 
			System.out.println("파란불입니다");
			break;
		case 3 :
			System.out.println("초록불입니다");
			break;
		default :
			System.out.println("잘못입력했습니다");
		}
		
	} 
	
	
	public void method2() {
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력하기(사과 1000원, 바나나 2000원, 복숭아 5000원)
		// 잘못된 과일 입력시 "저희 가게에서 판매하는 과일이 아닙니다"
		// 출력예시 : xx의 가격은 xx원 입니다. or "저희 가게에서 판매하는 과일이 아닙니다"+ 재호출
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일을 입력 : ");
		String fruit = sc.nextLine();
		
	
		int price = 0;
		
		switch(fruit) {
		
		case "사과" :
			 price = 1000; 	break;
		case "바나나" :
			price = 2000; 	break;
		case "복숭아" :
			price = 5000; 	break;
		default :
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다");	
			method2();
			return;
	}		
		System.out.printf("%s의 가격은 %d원입니다. \n", fruit, price);
				
	} 
	
	
	public void method3() {
		
		/*
		 * break;가 없는 switch문
		 * 
		 * 사용자에게 등급별로 권한을 부여하는 프로그램
		 * 1 : 관리자권한, 글쓰기권한, 읽기권한
		 * 2 : 글쓰기권한, 읽기권한
		 * 3 : 읽기권한
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급 : ");
		int level = sc.nextInt();
		
		switch(level) {
		
		case 1 : System.out.print("관리자권한, "); 
		case 2 : System.out.print("글쓰기권한, "); 
		case 3 : System.out.print("읽기권한");
		}
		
	}
	
	
	public void method4() {
		/*
		 * 사용자에게 1월~12월 사이의 월을 입력받아
		 * 해당 달의 마지막 날짜를 출력하는 프로그램
		 * 1, 3, 5, 7, 8, 10, 12 -> 31일
		 * 4, 6, 9, 11 -> 30일
		 * 2월 -> 28일이거나 29일
		 * 조건)각 출력문은 한 번만 사용 -switch문
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월~12월 사이의 월 입력 : ");
		int month = sc.nextInt();
		
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 13 :
			System.out.println("해당 달은 31일까지 입니다");
			break;
		case 4: case 6 : case 9 : case 11 :
			System.out.println("해당 달은 30일까지 입니다");
			break;
		case 2 : 
			System.out.println("해당 달은 28일 이거나 29일까지 입니다");
			break;
		default : System.out.println("1월부터 12월에 해당하는 달을 입력하세요");
			method4();
			
		}
		
	}
	
		// 위와 같은 내용. 
			
//		System.out.print("1월~12월 사이의 월 입력 : ");
//		int month = sc.nextInt();
//		String days = "28일 이거나 29일";
//		
//		switch(month) {
//		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 13 :
//			days = "31일";
//			break;
//		case 4: case 6 : case 9 : case 11 :
//			days = "30일";
//			break;
//		case 2 : 
//			
//			break;
//		default : System.out.println("1월부터 12월에 해당하는 달을 입력하세요");
//			method4();
//			return;
//		}
//		
//		System.out.printf("%d월은 %s까지 입니다. \n", month, days);
//	}
	
	
}
