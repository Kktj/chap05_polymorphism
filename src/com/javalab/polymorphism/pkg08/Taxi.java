package com.javalab.polymorphism.pkg08;

/**
 * 추상클래스의 구현 클래스(자식클래스)
 */
public class Taxi extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("택시가 정차합니다.");
	}

}
