package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void upDown() {
//		 1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데
//		 몇 번 만에 맞췄는지 출력하세요.

		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 100 + 1);

		System.out.println(random);

		int count = 0;

		while (true) {

			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			count++;

			if (num < 0 || num >= 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}

			if (num > 0 || num <= 100) {

				if (num == random) {
					System.out.printf("정답입니다 !! %d회만에 맞추셨습니다.", count);
					return;

				}
				if (num <= random) {
					System.out.println("UP !");

				} else {
					System.out.println("DWUN !");

				}
			}

		}

		// =========================//

//			while (true) {
//
//				System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
//				int num = sc.nextInt();
//				count++;
//
//				if (!(num > 0 && num <= 100)) {
//					System.out.println("1~100 사이의 숫자를 입력해주세요.");
//					continue;
//				}
//
//				if (num == random) {
//					System.out.printf("정답입니다 !! %d회만에 맞추셨습니다.", count);
//					break;
//
//				} else if (num <= random) {
//					System.out.println("UP !");
//
//				} else {
//					System.out.println("DWUN !");
//				}
//			}

	}

	public void rps() {
//	 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
//	 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
//	 사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
//	 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.

		Scanner sc = new Scanner(System.in);

		int win = 0;
		int draw = 0;
		int lose = 0;
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		
		while (true) {


			System.out.print("가위바위보 : ");
			String rps = sc.nextLine();
			int c_rps = (int) (Math.random() * 3 + 1);
			int result = 0;
			
			
			switch (rps) {
			case "가위":
				if (c_rps == 1) {	//가위
					draw++;		
					result = 0;
				} else if (c_rps == 2) { 	//바위
					lose++;
					result = -1;
					
				} else {		//보
					win++;
					result = +1;
				}
				break;
			case "바위":
				if (c_rps == 1) {
					win++;
					result = +1;
					
				} else if (c_rps == 2) {
					draw++;		
					result = 0;	
				} else {
					lose++;
					result = -1;
				}
				break;
			case "보":
				if (c_rps == 1) {
					lose++;
					result = -1;
				} else if (c_rps == 2) {
					lose++;
					result = -1;				
				} else {
					draw++;		
					result = 0;	
				}
				break;
			case "exit":
				System.out.printf("%d전 %d승 %d무 %d패", (win + lose + draw), win, draw, lose);
				return;
			default:
				System.out.println("잘못입력했습니다.");
				continue;
			}
			System.out.println("컴퓨터 : " + (c_rps == 1 ? "가위 " : c_rps == 2 ? "바위" : "보"));
			System.out.println(result > 0 ? "이겼습니다!" : result == 0 ? "비겼습니다." : "졌습니다 ㅠㅠ");
		}

	}

}
