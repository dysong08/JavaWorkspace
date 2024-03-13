package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void test1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double i1 = sc.nextDouble();

		System.out.print("세로 : ");
		double i2 = sc.nextDouble();

		System.out.println("면적 : " + (i1 * i2));
	

		System.out.println("둘레 : " + (i1 + i2) * 2);
	

}
}