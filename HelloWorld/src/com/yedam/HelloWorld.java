package com.yedam;
// 객체(object) 지향 언어
// class : 객체를 자바언어로 표현한것.
// HelloWorld.java 소스코드. => HelloWorld.class (실행)
// 코드내의 클래스이름과 파일이름이 같아야함.
// bin폴더에 실행파일 src폴더에 코드가 저장됨.
// project탭에 clean하면 전부 삭제. automaticcally가 켜져있으면 다시 클래스파일을 만듬.
// 그래서 clean하면 새로고침이 됨.
public class HelloWorld {
	// main = method: 기능.
	// main의 매개변수로 String[] args
	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		int myAge = 20;
		myAge = 25;
		int sum = 0;
		for (int i=1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println("i의 값은" + i); 
				sum += i;				
			}
		}
		System.out.println("sum의 값은 " + sum);
	}
}
