package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간과 근무일수를 곱해서 월급을 알아보는 메소드
	public void printVariable() { //변수를 출력하는 프로그램
	
		//sysout + Ctrl + spacebar 를 누르면 아래처럼 변함
		System.out.println("변수 사용 전");
		System.out.println("시급 : 11000");
		System.out.println("근무 시간 : 8 ");
		System.out.println("근무일 : 5 ");
		
		// 월급 = 시급 * 근무시간 * 근무일 
		// 민경민 : 00000원 입니다.
		
		System.out.println("민경민 : " + (11000 * 4 * 5) + "원 입니다.");
		System.out.println("푸바오 : " + (11000 * 8 * 20) + "원 입니다.");
		System.out.println("아이바오 : " + (11000 * 6 * 20) + "원 입니다.");
		
		System.out.println();
		System.out.println("변수 사용 후");
		
		int pay = 11000; // 자바에서 =은 대입을 나타내는 연산자 (동등 비교시는 == 사용), 변수명 중요
		int time = 8;
		int day = 20;
		
		System.out.println("시급 : " + pay);
		System.out.println("근무 시간 : " + time);
		System.out.println("근무일 : " + day);
		System.out.println("민경민 : " +  (pay * time * day) + "원 입니다.");
		System.out.println("푸바오 : " + (pay * time * day) + "원 입니다.");
		System.out.println("아이바오 : " + (pay * (time-2) * day) + "원 입니다.");
	
		/*
		 * 변수를 사용하는 이유?
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용 (가독성이 좋음)
		 * 2. 단 한번 값을 기록해두고 필요할 때마다 꺼내서 계속 사용할 목적으로 사용 (재사용이 좋음)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
	}
	
	//변수 선언 
	public void declareVariable() {
		/* 
		 * 변수의 선언 (값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다)
		 * [표현법]  자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼 지, 어떤 크기의 값을 담아낼 지에 따라서 변수의 크기 및 모양을 지정하는 부분
		 * 변수명 : 변수의 이름을 정하는 부분
		 * 
		 * 주의점
		 * 1. 변수명은 소문자로 시작하는게 관례 (단, 낙타등표기법 지키기)
		 *    ex) String userName;(o)
		 *        String username;(x)
		 *        String user_name;(언더스코어표기법)
		 * 2. 같은 영역 ({}) 안에서는 동일한 변수명으로 선언 불가
		 * 3. 해당 영역에 선언된 변수는 해당 영역안에서만 사용 가능 (다른 메소드에서는 불가)
		 * 
		 */
		
		// 1. 논리형(논리값 true / false)
		boolean isTrue ; // 1byte , 참 거짓만 저장하기 때문에 용량 클 필요 없음
		
		// 2. 숫자형 
		// 2_1. 정수형 , int가 대표적이다.
		byte bNum ; // 1byte (-128~127)
		short sNum ; // 2byte
		int iNum ; // 4byte(-21억~21억) 가장 많이 사용되는 정수형태 대표 형태
		long lNum ; // 8byte , 1조같은 값을 저장할 때 사용함
		// 2_2. 실수형 , double이 대표적 ( 보다 정확한 실수값을 담을 수 있기 때문)
		float fNum ; // 4byte , 소수점 아래 7자리까지 표현 가능. inum 보다 큼
		double dNum ; // 8byte, 소수점 아래 15자리까지 표현 가능. float 보다 정확

		// 3. 문자형 (A, B, C 등 한글자)
		char ch ; // 2byte  

		// 4. 문자열 (참조형)
		String str ; // byte 크기가 별도로 없음
		
		/*
		 * 변수에 값 대입
		 * [표현법]
		 * 변수명 = 값(리터럴);  ,, 값 자체를 리터럴이라고 부름
		 */
		
		isTrue = true;
		
		bNum = 1;  // byte = int 형변환
		sNum = 2; // short = int 형변환
		iNum = 4;
		lNum = 8L; // long 자료형에 값을 대입하고 있음을 알려주기 위해 대문자 L을 표기함
		
		fNum = 4.0f; // 대입하고자 하는 값이 float 자료형임을 알려주기 위해 f를 추가해야 함
		dNum = 8.0; // 
		
		ch = '민'; // ch에는 ''(작은 따옴표) 안에 추가해줘야함, 문자는 한글자만 들어갈 수 있음
		str = "민경민"; // 문자열은 반드시 ""(쌍따옴표) 안에 넣어줘야 함
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
	}
	
	//변수 초기화 , 변수를 선언함과 동시에 값을 주는 것
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴);
		 */
		
		// 기본자료형(Primitive type)=========================================		
		// 1. 논리형 
		boolean isTrue = false; // 1byte
		
		// 2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 2_2. 실수형
		float fNum = 4.0f; //4.0은 더블 자료형이기 때문에 f를 붙여야 오류가 안난다
		double dNum = 8.0;
		
		// 3. 문자형
		char ch = '민'; // 2byte
		
		//===================================================
		// 4. 문자열(참조 자료형) - Reference type 
		String str = "자바 공부중 ..."; 
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
		int longInt = 999_999_999; // "," 대신 쓸 수 있는 "_"
		System.out.println(longInt);
		
		int age = 20;
		System.out.println("변경전 age :" + age );
		age = 21;
		System.out.println("변경후 age : " + age);
		
		final int AGE = 20;
		System.out.println("변경전 AGE : " + AGE);
		
		
	}
	
	

}
 