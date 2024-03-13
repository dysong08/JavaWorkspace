package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 변수에 기록하는 방법
public class B_Keyboardinput {
	public void inputTest1() {
		/*
		 * 자바에서 제공하고 있는 java.util.Scanner클래스를 이용할 것(API) Scanner클래스 안에 이미 만들어져 있는 메소드를
		 * 호출해서 사용
		 */

		Scanner sc = new Scanner(System.in);

		// 사용자의 인적사항 입력받기(이름, 나이, 키)

		System.out.print("당신의 이름은 무엇 입니까 : ");

		/*
		 * 사용자가 입력한 값을 문자열로 받아오는 메소드 : next(), nextLine() 사용법 : 변수 선언과 동시에 값을 입력받아 바로 대입
		 * String name = sc.next(); nextLine(); : 사용자가 입력한 값 중 공백(스페이스바)이 있을 경우 공백 이전까지만 출력해줌
		 */

		// String name = sc.next();

		String name = sc.nextLine(); // 사용자가 엔터를 누르기 전까지 대기상태
		/*
		 * nextLine() : 사용자가 입력한 값 중 개행문자가 있을 경우 공백에 무관하게 개행문자 이전까지만 출력해준다 남아있는
		 * 개행문자(\n)를 날려버린다. 사용자가 입력한 값에 공백이 포함될 여지가 있는 경우 nextLine을 사용할 것.
		 */

		System.out.print("당신의 나이는 몇 살 입니까 : ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수형(int)으로 받을때 사용

		System.out.print("당신의 키는 몇 cm입니까 : ");
		double height = sc.nextDouble();

		sc.nextLine(); // 입력버퍼공간에 남아있는 엔터값(\n)를 비워주기 위해 실행

		System.out.print("당신이 사는 곳은 어디입니까 : ");
		String address = sc.nextLine();

		// ㅇㅇㅇ씨의 나이는 00세이며 키는 000.0cm 입니다.

		System.out.println(address + "에 사는, " + name + "씨의 나이는 " + age + "세 이며 키는 " + height + "cm 입니다");

	}

	public void inputTest2() {
		/*
		 * 내가 입력한 값을 
		 * 문자열로 뽑을때 => sc.next() / sc.nextLine() 
		 * 정수값으로 뽑을때 => sc.nextInt() / sc.nextByte() / sc.nextShort() / sc.nextLong() 
		 * 실수값으로 뽑을때 => sc.nextDouble() / sc.nextFloat() 
		 * 문자로 뽑을때 => sc.nextChar() << XXXX
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		char newGender = gender.charAt(0);

		// "MALE" 문자열
		// charAt(뽑고자 하는 문자의 위치) : String클래스 내부에 존재하는 일반메소드로 문자열에서
		// 내가 뽑고자 하는 위치의 문자를 반환해줌

		// ㅇㅇㅇ님의 성별은 X 입니다.
		System.out.println(name + "님의 성별은 " + newGender + "입니다.");

	}

	/*
	 * 1. 콘솔창에 값을 출력하기 위해서는 : System.out.println[In]() 메소드 이용 
	 * 2. 콘솔창에 값을 입력받기 위해서는 : Scanner를 이용해서 (nextXXX() 메소드 이용)
	 * 
	 * >주의사항 
	 * 1)sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야할 경우 sc.nextLine() 메소드를 한 번
	 * 더 실행시켜줘서 입력버퍼에 남아있는 엔터를 뺴줘야 함
	 * 
	 * 2)'문자'값을 입력받아야 할 경우 sc.nextLine() 메소드를 통해 우선 문자열(String)형태로 입력받고, 
	 * 그 뒤에 .charAt(인덱스위치) 메소드를 통해 원하는 위치의 문자 하나만 추출한다.
	 */
}
