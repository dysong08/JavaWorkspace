package com.kh.test;

public class MethodTestRun {


	public static void main(String[] args) {
		// Q. MethodTest 내부에 있는 print Method A 호출해보기
		
		// 1. 사용하고자 하는 클래스 임포트 및 생성
		MethodTest mt = new MethodTest(); //변수 선언을 먼저 해주고, 메서드 생성
		
		// 2. 생성한 클래스 "내부"에 접근하여 printMethodA() 함수 호출
		mt.printMethodA(); 
	}
}

