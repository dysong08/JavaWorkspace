package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	Scanner sc = new Scanner(System.in);
	
	
	
	 public void practice1(){
//		 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
//		 홀수면 ‘박’, 짝수면 ‘수’를 출력하도록 하세요.
//		 단, 입력 받은 수가 양수가 아니면 “양수가 아닙니다”를 출력하세요.
		 
		 
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {

					if (i % 2 == 0) {
						System.out.print("수");
					} else
						System.out.print("박");
				}

			} else {
				System.out.println("양수가 아닙니다.");
				return;
			}

		}
	 

	 
	 
	 public void practice2() {
//		 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		 “양수가 아닙니다.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {

					if (i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}

				}
			} else {
				System.out.println("양수가 아닙니다.");
				practice2();
				return;
			}

		}
			
			
			
			
	 public void practice3() { 
	
//	 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
//	 몇 개 있는지 개수를 출력하세요.
//	 ex.
//	 문자열 : banana
//	 문자 : a
//	 banana 안에 포함된 a 개수 : 3

	
			System.out.print("문자열 : ");
			String str = sc.nextLine();

			System.out.print("문자 : ");
			char text = sc.nextLine().charAt(0);

			int count = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == text) {
					count++;
				}
			}
			System.out.printf("%s 안에 포함된 %c 개수 : %d \n", str, text, count);
		}
	
	
	
	 public void practice4() {
//		 위 문제와 모든 것이 동일하고, “더 하시겠습니까?”라고 추가로 물어보도록 하세요.
//		 이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌
//		 다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고
//		 더 하겠냐는 물음을 반복하세요.
		 
		 
			System.out.print("문자열 : ");
			String str = sc.nextLine();

			System.out.print("문자 : ");
			char text = sc.nextLine().charAt(0);

			int count = 0;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == text) {
					count++;

				}
			}
			System.out.printf("%s 안에 포함된 %c 개수 : %d \n", str, text, count);

			while (true) {
				System.out.print("더 하시겠습니까? (y/n) : ");
				char ch = sc.nextLine().charAt(0);

				if (ch == 'N' || ch == 'n') {
					break;
				} else if (ch == 'Y' || ch == 'y') {
					practice4();
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");

				}
			}
			
			//===========================================
			
//			while (true) {
//
//				System.out.print("문자열 : ");
//				String str = sc.nextLine();
//
//				System.out.print("문자 : ");
//				char text = sc.nextLine().charAt(0);
//
//				int count = 0;
//
//				for (int i = 0; i < str.length(); i++) {
//
//					if (str.charAt(i) == text) {
//						count++;
//					}
//				}
//				System.out.printf("%s 안에 포함된 %c 개수 : %d \n", str, text, count);
//				System.out.print("더 하시겠습니까? (y/n) : ");
//				char ch2 = sc.nextLine().charAt(0);
//
//				if (ch2 == 'N' || ch2 == 'n') {
//					return;
//				} else if (!(ch2 == 'Y' || ch2 == 'y' || ch2 == 'N' || ch2 == 'n')) {
//					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
//				}
//			}

		}
			
			
		
		 
		 
	
	 
	 
	 
	 
	 
	 
	 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


