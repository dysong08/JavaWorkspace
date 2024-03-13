package com.kh.test;

public class MethodTest {
	
	public void printMethodA() {
	
		System.out.println("프린트 메서드 A 출력중");
		printMethodB(); //같은 클래스이기 때문에 따로 변수를 만들어 줄 필요 없음
	}
	
	public void printMethodB() {
		
		System.out.println("프린트 메서드 B 출력중");
		printMethodC();
	}
	
	public void printMethodC() {

		System.out.println("프린트 메서드 C 출력중");
		printMethodA();
	}
	
}
