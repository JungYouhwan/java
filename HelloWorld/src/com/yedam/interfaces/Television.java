package com.yedam.interfaces;
/*
 * 
 * RemoteControl 인터페이스의 구현클래스.
 * 인터페이스에서 구현한 메소드를 불러와서 재정의 함.
 *  
 */
public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켭니다.");
		// TODO Auto-generated method stub
	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");
		// TODO Auto-generated method stub
	}

}
