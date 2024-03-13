package com.kr.chap02.loop;


public class B_While {

	/*
	 * While 
	 * [표현법]
	 * 
	 * [초기식;] // 필수 아님
	 * while(조건식) {  //조건식의 결과가 true일 경우 while문의 중괄호 블럭안의 내용이 반복실행됨
	 * 		반복적으로 실행할 코드들
	 * [증감식;]  //필수 아님
	 * }
	 * */
	
	
	
	
	
	// for문을 while문으로, while문을 for문으로 변경해보기
	public void method1() {

		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		// ==============================//
		int i = 0;

		while (i < 5) { // 조건식
			System.out.println("안녕하세요");
			i++; 		// 증감식

		}

	}
	
	
	public void method2() {
		// i값이 1에서부터 10사이의 홀수만 출력

		// ============= for문
		for (int i = 1; i <= 10; i++) { // i값 10회반복
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		} // 두가지 코드작성이 가능하나 아래코드가 실행횟수가 더 적음!

		for (int i = 1; i < 10; i += 2) { // i값 1 3 5 7 9 11(false) 종료 =>5회반복
			System.out.print(i + " ");
		}
		
		// ============= while문
	
//		int i = 1;
//		while (i <= 10) {
//			while (i % 2 == 1) {
//				System.out.print(i + " ");
//
//			}
//			i++;
//		}
		
		
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

	}
	
	
	
	
	public void method3() {
		//1부터 랜덤값(1~100)까지의 총 합계
	
		// ============= while문
		int i = 1;
		int sum = 0;

		double random1 = Math.random();
		int random = (int)(random1 * 100 + 1);
		

		while (i <= random) {

			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 총 합계 : %d \n", random, sum);

		//===================== for문
//		int sum = 0;
//		for (int i = 1; i <= random; i++) {
//
//			sum += i;
//
//		}
//		System.out.print(sum);
			
	
		}
		
	
	
	
		public void method4() {
		//A_For클래스 10번 메서드를 while문으로 바꾸기
			
		// 	"java.util.Scanner" improt 하지 않아도 Scanner 사용하는 방법**
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 문자열의 길이를 알려주는 메서드 => 문자열.length();
		System.out.println("입력한 문자열의 길이는 : " + str.length());

		for (int i = 0; i <= str.length() -1; i++) { // kiwi 입력시 i : 0 1 2 3
			System.out.println(str.charAt(i));
		}
			
			
		// ============= while문
		
		int i = 0;
		
		while(i <= str.length() -1); {
			System.out.println(str.charAt(i));
			i++;
		}
		
		
		/*
		 * do-while문
		 * [표현법]
		 * do { 			//조건검사 없이 무조건 1번은 실행한다 
		 * 		실행할 코드		  =>조건식 결과가 false더라도 한 번은 반드시 수행함
		 * 		
		 * }while(조건식); 	//조건식의 결과가 true면 실행할 코드 실행
		 * 					//조건식의 결과가 false면 반복문 빠져나옴
		 * 
		 * for/while문과 do-while문의 차이점
		 * for/while문은 처음 시작할 때부터 조건검사를 하고 반환값이 true여야 실행을 함
		 * do-while문은 첫실행은 무조건 조건검사 없이 실행된다.
		 * */
		
		
		
		
		
} 
	
	
		public void method5()  {
			
			int num = 900; 
			do{
				System.out.println("하이");
			}while(false);
		}
	
		
	
		public void method6() {
			// 1부터 사용자가 입력한 숫자까지의 총 합계
			// do-while문 사용
			
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.print("정수 : ");
			int num = sc.nextInt();

			int sum = 0;
			int i = 1;

			do {
				sum += i++;			// <= 무조건 1번은 실행됨!
			} while (i <= num);
			System.out.printf("1부터 %d까지의 총 합계 : %d \n", num, sum);

		}
	
	
	
	
}
