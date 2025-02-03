package com.yedam.reference;

import java.util.Scanner;

// Calculator
public class CalculatorExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
//		System.out.printf("보고싶은 월을 입력하세요");
//		int month = Integer.parseInt(scn.nextLine());
		Calculator cal = new Calculator();
		//cal.showCalendar(2025, 05); 5월달 달력 출력 
		cal.showCalendar();
		
//		Book[] bookStore = new Book[5];
//		bookStore[0] = new Book("이것이자바다", "신용권", "한빛미디어", 30000);
//		bookStore[1] = new Book("자바스크립트기초", "김기초", "자바출판사", 15000);
//		bookStore[2] = new Book("혼자공부하는자바", "김자바", "자바출판사", 20000);
//		bookStore[3] = new Book("혼자공부하는CSS", "CSS바", "CSS출판사", 30000);
//		bookStore[4] = new Book("혼자공부하는HTML", "HTML바", "html출판사", 10000);
//		
		
//		
//		int author = cal.getBookInfo("자바스크립트기초");
//		if (author != 0) {
//			System.out.println(author);
//		}else {
//			System.out.println("조회결과없음");
//		}
//		
//		String author2 = cal.getBookIn("혼자공부하는CSS", bookStore);
		
//		if (author2 != null) {
//			System.out.println(author2);
//		}else {
//			System.out.println("조회결과없음");
//		}
//		
//		boolean author3 = cal.getBookBoolean("자바스크립트기초");
		
//		if (author3 != false) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
//		Book author4 = cal.getBookLnfo("자바스크립트기초");
		
//		if (author4 != null) {
//			System.out.println("ㅇㅇ");
//		}else {
//			System.out.println("조회결과없음");
//		}
		
		// 랜덤숫자 배열에 담기
//		int[] randomA = cal.randomAry(5);
//		for(int num : randomA) {
//			System.out.println("랜덤 값 " + num);
//		}
		
		// 불러올려면 인스턴스 생성해야함.(스캐너 불러오듯이)
//		int[] ary1 = { 14, 23, 11, 14, 24 };
//		int[] ary2 = { 33, 23, 6, 12, 9 };
//		System.out.println(cal.getMax(ary1, ary2));
//		cal.printStar(4);
		// 별
//		for(int i=0; i<= 9; i++) {
//			cal.printStar(3,"㉾"); // 매개값.
//		}
//		// double 실수를 표현하기위한 타입
//		// sum을 불러옴. cal.sum
//		double result = cal.sum(10.5, 20.3);
//		System.out.println("double 타입 결과: " + result);
//		int result2 = cal.sum(10, 20);
//		System.out.println("int 타입 결과: " + result2);
//		int result3 = cal.sum(new int[] { 10, 20, 30, 40});
//		System.out.println("배열 타입 결과: " + result3);
	}
	
}
