package com.kr.chap01;

import java.util.Scanner;

public class ControlPractice {

	
	
	public void Practice1() {
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호를 입력하세요 : ");
		
		int menu = sc.nextInt();
		String result = "";
		
		switch(menu) {
		
		case 1 : result = "입력"; break;
		case 2 : result = "수정"; break;
		case 3 : result = "조회"; break;
		case 4 : result = "삭제"; break;
		case 7 : result = "종료"; break;
		}	
		
		if(result.equals("종료")) {
			System.out.println("프로그램이 종료됩니다.");
			
		}else {
			System.out.println(result + "메뉴입니다");
		}
	
	}
	
	
	
	public void Practice2() {
//		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
//		String result = "홀수다";
//		
//		if(num > 0 && num % 2 == 0) {
//			result = "짝수다";
//		} else if(num <= 0) { 
//			result = "양수만 입력해주세요.";
//			Practice2();
//			return;
//		}
//		System.out.println(result);
		
		if(num > 0) {
	//	syso	
		 
		
		
	//	else { syso}
		}
	
	}
	
	public void Practice3() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor + math + eng);
		double avg = sum / 3.0;
		
	//1)	
//		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {	 
//			System.out.println("축하합니다, 합격입니다!");
//		} else {
//			System.out.println("불합격입니다.");
//		}
//		}
		
		
	//2)
		
			 if(kor >= 40 && math >= 40 && eng >= 40) {
			 System.out.println("국어 : " + kor);
			 System.out.println("국어 : " + kor);
			 System.out.println("국어 : " + kor);
			 System.out.println("국어 : " + kor);
			 System.out.println("국어 : " + kor);
			 System.out.println("국어 : " + kor);
			 System.out.println("축하합니다, 합격입니다!");
			 } else {
	
		}
		
	}
	
	
		public void Practice4() {
//		pdf파일 (4_제어문 7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 
//		switch문으로 바꿔서 출력하세요
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1~12 사이의 정수 입력 : ");
			int month = sc.nextInt();
			
			String season = "";	
			
			switch(month) {
			case 1 : case 2 : case 12 : 
				season = "겨울";
				break;
			case 3 : case 4: case 5 :
				season = "봄";
				break;
			case 6 : case 7 : case 8 :
				season = "여름";
				break;
			case 9 : case 10 : case 11 :
				season = "가을";
				break;
			default :
				season = "해당하는 계절이 없습니다.";
				
						
			}		
			//System.out.printf("%d월은 %s 입니다", month, season);
			System.out.println(month + "월은 " + season);
		}
		
		
		

		
		public void Practice5() {
//			아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//			로그인 성공 시 “로그인 성공”,
//			아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//			비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("아이디 : ");
//			String id = sc.nextLine();
//			
//			System.out.print("비밀번호 : ");
//			String pw = sc.nextLine();
//
//			//1. 아이디값 잘 입력했는지 체크
//			//2. 아이디값이 정상이라면 비밀번호를 잘 입력했는지 체크
//			
//			if (id.equals("minmin")) { 
//
//				if (pw.equals("Min1234")) {
//					System.out.println("로그인 성공");
//				} else {
//					System.out.println("비밀번호가 틀렸습니다");
//					
//				}
//			} else {
//				System.out.println("아이디가 틀렸습니다");
//				
//			}
//			Practice5();
			Scanner sc = new Scanner(System.in);
			
			for(;;) {
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				for(;;) {
					System.out.print("비밀번호 : ");
					String pw = sc.nextLine();
					if (id.equals("minmin")) { 
						if (pw.equals("Min1234")) {
							System.out.println("로그인 성공");
							return;
						} else {
							System.out.println("비밀번호가 틀렸습니다");
						}
					} else {
						System.out.println("아이디가 틀렸습니다");
						break;
					}
				  }
			}

		}
		
		
		
		public void Practice6() {
//			사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//			단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//			회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//			비회원은 게시글 조회만 가능합니다
			
			
			Scanner sc = new Scanner(System.in);

			System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			String level = sc.nextLine();
			
			
			switch(level) {
			
			case "관리자" : System.out.print("회원관리, 게시글 관리, "); 
			case "회원"  : System.out.print("게시글 작성, 댓글작성, ");
			case "비회원" : System.out.print("게시글 조회");
			}			
		}
		
		
		
		public void Practice7() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
			
			
			Scanner sc = new Scanner(System.in);

			System.out.print("키(m)를 입력해주세요 : ");
			double hight = sc.nextDouble();
			
			System.out.print("몸무게(kg)를 입력해주세요 : ");
			double weight = sc.nextDouble();	
			
			double BMI = weight / (hight * hight);
				
			String result = "";
			
			if(BMI < 18.5) { 
				result = "저체중";
			}else if( BMI < 23) {
				result = "정상체중";
			}else if(BMI < 25) {
				result = "과체중";	
			}else if(BMI < 30) {
				result = "과체중";
			}else if(BMI >= 30) {
				result = "고도 비만";
			}
				System.out.println("BMI 지수 : " + BMI);
				System.out.println(result);
			
	}
			
			
		
		
		public void Practice8() {
//			키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//			(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//			“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
			
			Scanner sc = new Scanner(System.in);

			System.out.print("피연산자1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("피연산자2 입력 : ");
			int num2 = sc.nextInt();
			
		
			sc.nextLine();
			
			System.out.print("연산자를 입력(+,-,*,/,%) 입력 : ");
			char ch = sc.nextLine().charAt(0);
			
			double result = 0;
			
			if(num1 > 0 && num2 > 0) {
				switch(ch) {
				case '+' : 	result = num1 + num2; break;
				case '-' : 	result = num1 - num2; break;
				case '*' : 	result = num1 * num2; break;
				case '/' :  result = num1 / (double)num2; return;
				case '%' :  result = num1 % num2; break;

				default : 
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
				
			}System.out.printf("%d %c %d = %f \n" , num1, ch, num2, result );
			}
				
		}
		

		public void Practice9() {
//			중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
//			평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//			이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//			70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요
			
	// 9-1번)		
			Scanner sc = new Scanner(System.in);

			System.out.print("중간 고사 점수 : ");
			double mid = sc.nextDouble() * 0.2;			
			
			System.out.print("기말 고사 점수 : ");
			double fin = sc.nextDouble() * 0.3;
			
			System.out.print("과제 점수 : ");
			double test = sc.nextDouble() * 0.3;
			
			System.out.print("출석 회수 : ");
			double check = sc.nextDouble();
			
			
			System.out.println("============ 결과 ===========");
			
			double sum = mid + fin + test + check ;
			
				
					
			if(sum >= 70) {
			
			System.out.printf("중간 고사 점수(20) : %.1f\n" , mid );
			System.out.printf("기말 고사 점수(30) : %.1f\n" , fin);
			System.out.printf("과제 점수(30) : %.1f\n" , test);
			System.out.printf("출석 점수(20) : %.1f\n" , check);
			System.out.printf("총점 : %.1f\n" , sum);
				System.out.println("Pass");
			} else {
				System.out.println("Fail [출석 회수 부족 (" + (int)check + "/20)]" );
			}
						



		//boolean result = mid*0.2 + fin*0.2 +  + > 70 && check > 14 ? true : false;
		

		}	
		
		
		
		public void Practice10() {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("실행할 기능을 선택하세요. ");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : Practice1(); break;
			case 2 : Practice2(); break;
			case 3 : Practice3(); break;
			case 4 : Practice4(); break;
			case 5 : Practice5(); break;
			case 6 : Practice6(); break;
			case 7 : Practice7(); break;
			case 8 : Practice8(); break;
			case 9 : Practice9(); break;
				
			}
		}		
	
		
		
		public void Practice11() {
//			정수를 이용해서 4자리 비밀번호를 만들려고 하는데
//			이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
//			중복 값이 있으면 ‘중복 값 있음‘
//			자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
//			단, 제일 앞자리 수의 값은 1~9 사이 정수
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("비밀번호 입력(1000~9999) : ");
			int pw = sc.nextInt();
			
			char ch = sc.nextLine().charAt(0);
	
		

//			char ch1 = pw.charAt(0);
//			char ch2 = pw.charAt(1);
//			char ch3 = pw.charAt(2);
//			char ch4 = pw.charAt(3);
//			
//			
//			System.out.println(ch1);
//			System.out.println(ch2);
//			System.out.println(ch3);
//			System.out.println(ch4);
			
			
			
			
			
			
			
			
			
			
			
		//=====================================	
			//4자리수 맞는지 확인
//			if(pw > 999 && pw < 10000 ) {
//				//자릿수 구하기
//				int first = pw % 10; 		 //1의자리
//				int second = (pw / 10) % 10; //10의자리 
//				int third = (pw / 100) % 10; //100의자리 
//				int forth = (pw / 1000) % 10; //1000의자리 
//				
//				//중복값이 있는지 확인
//				if(first != second && first != third && first != forth 
//							&& second != third && second != forth
//							&& third != forth) {
//					System.out.println("생성 성공");
//				}else {
//					System.out.println("중복 값 있음");	
//				}
//			}else {
//				System.out.println("자리수 안맞음");
//			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
			
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

