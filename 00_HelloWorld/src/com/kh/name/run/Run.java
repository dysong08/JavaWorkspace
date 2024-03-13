package com.kh.name.run;

import com.kh.name.MyName; // MyName class를 import 함.
// package의 첫번째 단어는 소문자
// Class 파일의 첫번째는 대문자로 적는게 관례, (에러가 나지는 않음)
// 대문자로 보고 어디까지 package이고 어디서부터 class인지 알 수 있음  

public class Run {

	public static void main(String[] args) {
		
		MyName mn = new MyName() ; //생성할 수 있게 되었음, 생성되어 호출 할 수 있음
		mn.callMyName(); //mn이 없으면 내부에 있는 클래스를 불러오는 거라고 생각함, MyName이라는 클래스의 변수를 생성해줘야 함
		
	}
	
	

}
