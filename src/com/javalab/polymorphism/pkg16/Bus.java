package com.javalab.polymorphism.pkg16;

/**
 * 추상클래스의 구현 클래스(자식클래스)
 */

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 정류장에서 손님을 태우고 운행중입니다.");
	}

}
