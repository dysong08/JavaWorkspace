package com.kh.variable;

public class C_Cast {

	/*
	 * 형변환 : 값의 자료형을 바꾸는 개념
	 * 컴퓨터상에서 값처리 규칙
	 * 1. 대입연산자(=) 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 함. 즉, 같은 자료형에 해당하는 값만 대입이 가능하다.
	 *    만약, 다른 자료형의 값을 대입하고자 한다면 "형변환"이라는 과정이 필수이다.
	 *		[표현법]
	 * 		자료형 변수명 = (바꿀 자료형) 값;
	 *    
	 * 2. 같은 자료형끼리만 연산이 가능 => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야함.
	 * 		[표현법]
	 * 		값 + (바꿀 자료형) 값
	 * 
	 * 형변환의 종류
	 * 1) (암시적)자동형변환 => 자동형변환이 진행되는 케이스로 내가 직접 형변환 할 필요가 없다.
	 * 					   작은바이트의 자료형 -> 큰바이트의 자료형으로 변환시 발생
	 * 2) (묵시적)강제형변환 => 자동형변환이 되지 않아 내가 직접 강제로 형변환을 해야한다.
	 * 					   큰바이트의 자료형 -> 작은바이트의 자료형으로 바꿀때 발생
	 * 
	 * (바꿀 자료형) == 형변환 연산자 == cast 연산자라고 불림
	 * 
	 * **boolean은 형변형 불가
	 */
	
	public void autoCasting() {
		
		//(암시적)자동형변환
		//1. int(4byte) -> double(8byte)
		int i1 = 10;
		double d1 = i1;       //== double d1 = (double) i1;  <=  자동형변환
		System.out.println("d1 : " +  d1);  //10.0
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 +d2;   
		System.out.println(result);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/ i3;
		long l4 = 2000L;  //L을 붙이지 않아도 되는 이유? 자동형변환이 가능하기 때문. 
		
		//3. 특이케이스 long(8byte) -> float(4byte)  자동형변환 가능
		/* 		정수가 실수로 담길때에는 큰사이즈의 정수여도 작은사이즈의 실수변수에 대입 가능
		 * 		4byte의 float자료형이 long자료형보다 표현할 수 있는 값의 범위가 훨씬 더 크기 때문. 
		 * 		(단, 값의 정확도가 떨어질 수 있음)
		 */
		long l5 = 10000000000L;
		float f5 = l5;
		System.out.println("f5 : " + f5);
		
		//4. 특이케이스 char(2byte) <-> int(4byte) : 양뱡향 형변환 가능
		char ch = 65;
		System.out.println("ch : " + ch);
		
		int num = 'A';
		System.out.println("num : " + num);
		
		/*
		 * char의 범위 0~65xxx : 각 문자마다 고유의 10진수값(정수값)이 정해져 있다.
		 * 						따라서, 정해진 표를 통해 양방향 전환이 가능하다 (단, 음수값 제시시 오류발생)
		 * 참고 : 아스키코드표(0~127, 영문자 대소문자, 숫자, 특수문자)
		 * 		 유니코드표 (0~65xxx, 영어, 숫자, 특수문자, 한글, 한자 등등)
		 */
		System.out.println((int)'경');
		
		char sum = 'A' + 10;  // 65+10
		System.out.println(sum);
		
		//5. 특이케이스 byte와 short간의 연산(강제형변환)
		byte b1 = 1;
		byte b2 = 10;
		
		//byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다
		byte b3 = (byte)(b1+b2);
		
		
	
	}

	//(묵시적)강제형변환 : 큰 크기의 자료형을 작은크기의 자료형으로 형변환 할 경우.
	public void forceCasting() {
		
		//1. double(8byte) -> float(4btye)
		float f1 = 4.0f;
		
		double d2 = 8.0;
		float f2 = (float) d2;
		
		//2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int) d3;    //10.89 -> 10 (소숫점 제거)
		System.out.println("i3 : " + i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		//1. 연산결과를 int형으로 맞춰서 강제형변환시키기
		int iSum1 = (int)(iNum + dNum);  //10.0+5.89 => 15.89 => 15
		
		int iSum2 = iNum + (int)dNum;    //10+5 =>15
		
		//=>실수값을 정수형으로 강제형변환 할 때는 데이터 손실이 무조건 발생한다.
		
		/* 데이터 손실 테스트 */
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		System.out.println("bNum2 : " + bNum2);
		
		
		
		
		
		
	} 
		
	
}
