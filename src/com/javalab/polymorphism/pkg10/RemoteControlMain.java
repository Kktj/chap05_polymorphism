package com.javalab.polymorphism.pkg10;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// 1. 인터페이스를 사용하지 않는 평번한 경우
		Television tv = new Television();
		
		// 2. 인터페이스를 사용하는 경우
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 선언 , 인터페이스 객체 생성 x
		
		// rc 변수에 Television 객체를 대입(일종의 자동 타입 변환)
		rc = new Television();
		rc.turnOn();  // 부모 타입의 turnOn()메소드는 감춰지고 구현 객체(자식)의 메소드가 호출됨
		
		rc = new Audio();
		rc.turnOn();  // Audio 객체의 오버로딩된 메소드가 호출됨
		
		RemoteControl[] rcs = new RemoteControl[2];
		rcs[0] = new Television(); // 자동 타입 변환
		rcs[1] = new Audio();
		for (int i = 0; i < rcs.length; i++) {
			rcs[i].turnOn();
		}
		for (RemoteControl remote : rcs) {
			remote.turnOn();
		}

	}

}
