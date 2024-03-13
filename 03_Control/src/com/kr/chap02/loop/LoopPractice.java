package com.kr.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
			return;
		}

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
	}

	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
			return;
		}

		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void practice3() {
//		 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		System.out.print("정수를 하나 입력하세요 :  ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i + (i == num ? " = " : " + "));
		}

		for (int i = 1; i <= num; i++) {
			sum += i;

		}

		System.out.print(sum);

	}

	public void practice4() {
//		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
//		 력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		System.out.print("첫 번째 숫자 :  ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 :  ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {

			System.out.println("1 이상의 숫자를 입력해주세요");
			practice4();
			return;
		}

		int sta = num1;
		int end = num2;

		if (num1 <= num2) {
			for (int i = sta; i <= end; i++) {

				System.out.print(i + " ");

			}

		} else {

			for (int i = end; i <= sta; i++) {

				System.out.print(i + " ");
			}

		}

	}

	public void practice5() {
//		 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		 “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9) {

			for (int i = dan; i <= 9; i++) {
				System.out.println("==== " + dan + "단 ====");

				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d \n", i, j, i * j);
				}
				dan++;
				System.out.println();
			}

		} else {
			System.out.println("9 이하의 숫자를 입력해주세요");
			practice5();
			return;
		}

	}

	public void practice6() {
//		 사용자로부터 시작 숫자와 공차를 입력 받아
//		 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		 단, 출력되는 숫자는 총 10개입니다.

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;

		}

	}

	public void practice7() {
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String ch = sc.nextLine();

			if (ch.equals("exit")) {
				System.out.println(" 프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			int result = 0;

			switch (ch) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 / num2;
				break;
			case "%":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				continue;

			}

			System.out.printf("%d %s %d = %d \n", num1, ch, num2, result);
		}

	}

	
	
	public void practice8() {
//		 *
//		 **
//		 ***
//		 ****	<- 구현하기
		 

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

	
	
	public void practice9() {
//		****
//		***
//		**
//		* 		<- 구현하기

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = num1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}

	}
	/*
	 * num1=4 i= 4 j= 0 1 2 3 i= 3 j= 0 1 2 i= 2 j= 0 1 i= 1 j= 0
	 ****
	 ***
	 **
	 *
	 * 
	 */

	public void practice13() {
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {

			System.out.println("잘못 입력하셨습니다 ");
			return;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				System.out.println(num + "은 소수가 아닙니다.");
				return;
			}

		}

		System.out.println(num + "은 소수입니다.");

	}
	
	
	
	public void practice14() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		int conut = 0;
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime) {
				System.out.print(i + " ");
				conut++;
			}

		}

		System.out.printf("\n 2부터 %d까지의 소수의 개수는 %d개 입니다.", num, conut);

}

	
	
	
	public void practice15() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.

		
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int conut = 0;
		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				conut++;
			}

		}
		System.out.println("\n count : " + conut);
	}
		
		
		
		
		
		
	public void practice16() {
//		*
//		**
//		***
//		**
//		* 			<- 구현하기

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = num - 1; i > 0; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}		
		
		
	
	
	//////////////다시 해야함
		public void practice17() {
//			*****
//			*   *
//			*   *
//			* 	*
//			*****		<- 구현하기
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			for (int i = 0; i < num; i++) { // 0 1 2 3 4

				for (int j = 0; j == i; j++) { // 0 1 2 3 4

				}
				System.out.print("*");
			}

			for (int i = 0; i < num; i++) { // 0 1 2 3 4

				for (int j = 0; j < i; j++) { // 0 1 2 3 4

					if (i == 0 || i <= num) {
						System.out.print("*");
					} else {

						if (i == 0 || i == num - 1) {
							System.out.print("*");
						} else {
							System.out.print("");
						}
					}
				}
				System.out.println();

			}
		}
		
		
		
		public void practice18() {
//			 *
//		    ***
//         *****
//	      *******
//	       *****
//	        ***
//	         *		<- 구현하기

			
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			for (int i = 0; i < num; i++) {

				for (int j = 0; j < num + i; j++) {
					if (j >= (num - (1 + i))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			for (int i = num - 2; i >= 0; i--) { // 2 1 0
				for (int j = 0; j < num + i; j++) { // 6 5 4

					if (j >= (num - (i + 1))) { // 1 2 3
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}
				
				
				
				

	
	
		public void practice19() {
//			*
//		   * *
//		  *	  *
//		 *	   *
//		  *   *
//		   * *
//		    * 		<- 구현하기
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			for (int i = 0; i < num; i++) { // 0 1 2 3

				for (int j = 0; j < num + i; j++) {

					if (j == (num - (1 + i)) || j == (num - 1 + i)) { // 3 2 1 0 || 3 4 5 6
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}

			for (int i = num - 2; i >= 0; i--) { // 2 1 0

				for (int j = 0; j < num + i; j++) { // 4 + 0 + (2 1 0)

					if (j == num - i - 1 || j == num + i - 1) { // 1 2 3 || 5 4 3
						// 5 -> num(4) +i -1
						// 1 -> num(4) -i -1
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}

		}
	
	
	
	
	
	
}
	
	

