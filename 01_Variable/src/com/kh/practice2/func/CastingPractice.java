package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	
	
	public void printFtest()  {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor+eng+math);
		int avg = sum/3;
		
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +avg);
		
		
		

	}
	
	
	
	
	

}
