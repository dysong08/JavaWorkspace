package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String s1 = sc.nextLine();

		System.out.println("첫 번째 문자 : " + s1.charAt(0));

		System.out.println("두 번째 문자 : " + s1.charAt(1));

		System.out.println("세 번째 문자 : " + s1.charAt(2));

		System.out.println("네 번째 문자 : " + s1.charAt(3));

	}
}
