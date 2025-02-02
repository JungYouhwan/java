package com.yedam.reference;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// CalculatorExe
public class Calculator {

	public void showCalendar(int month) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd E");
//		LocalDate date = LocalDate.of("year, month, 1");
		System.out.println("오늘 날짜는 " + date.format(cal.getTime()) + "요일 입니다."); // 오늘날짜
		System.out.println("보고싶은 날은 " + month + "월 입니다.");
		
		int spaces = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println("\n-----------------------------");
		// 공백, 말일 계산. 공백을
		// 배열에 값 채우기.
		for (int j = 0; j < spaces; j++) {
			System.out.printf("    "); // 공백 그리기
		}
		for (int i = 1; i < lastDay; i++) {
			System.out.printf("%4s", i); // 일 그리기
			if ((i+spaces) % 7 == 0) {
				System.out.printf("\n");
			}
		}
	}

	// 매개값이 없으면 기본생성자.
	// 도서명 입력 시 저자를 반환.
	// 반환해주는 값이 가격이 되도록 수정
	public int getBookInfo(String btitle) {
		Book[] bookRepo = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), //
				new Book("자바스크립트기초", "김자바", "자바출판사", 15000), //
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000) };
		// 배열검색.
		for (int i = 0; i < bookRepo.length; i++) {
			if (bookRepo[i].getBookTitle().equals(btitle)) {
				return bookRepo[i].getBookPrice();
			}
		}
		return 0;
	}

	// String 타입
	public String getBookIn(String btitle, Book[] bookRepo) {
//		Book[] bookRepo = {new Book("이것이 자바다","신용권","한빛미디어",10000),//
//						   new Book("자바스크립트기초","김자바","자바출판사",15000),//
//						   new Book("혼자공부하는자바","혼공자","한빛미디어",20000)};
		// 배열검색.
		for (int i = 0; i < bookRepo.length; i++) {
			if (bookRepo[i].getBookTitle().equals(btitle)) {
				return bookRepo[i].getBookTitle();
			}
		}
		return null;
	}

	// boolean타입
	public boolean getBookBoolean(String btitle) {
		Book[] bookRepo = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), //
				new Book("자바스크립트기초", "김자바", "자바출판사", 15000), //
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000) };
		// 배열검색.
		for (int i = 0; i < bookRepo.length; i++) {
			if (bookRepo[i].getBookTitle().equals(btitle)) {
				return true;
			}
		}
		return false;
	}

	// 배열타입
	public Book getBookLnfo(String btitle) {
		Book[] bookRepo = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), //
				new Book("자바스크립트기초", "김자바", "자바출판사", 15000), //
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000) };
		// 배열검색.
		for (int i = 0; i < bookRepo.length; i++) {
			if (bookRepo[i].getBookTitle().equals(btitle)) {
				return bookRepo[i];
			}
		}
		return null;
	}

	// 1~100 사이의 임의값을 n개 반환. 10이 들어오면 10개 반환.
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 100) + 1;
		}
		return result;
	}

	// 두 숫자중에서 큰 값을 반환.
	public int getMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		return num2;
	}

	// 두 배열중에 큰 배열을 반환
	public int getMax(int[] num1, int[] num2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < num1.length; i++) {
			sum1 += num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			sum2 += num2[i];
		}

		if (sum1 > sum2) {
			return sum1;
		}
		return sum2;
	}

	// 별출력
	public void printStar(int times) {
		for (int i = 0; i <= times; i++) {
			printStar(i, "★");
			System.out.println();
		}
	}

	// 별 출력하는 메소드. 별의 갯수를 입력한만큼 찍기위해 매개변수를 입력
	public void printStar(int times, String types) { // 매개변수.
		for (int i = 1; i <= times; i++) {
			System.out.println(types);
		}
	}

	// 두수의 합을 반환. num1과 num2에 int값을 무조건 집어넣어야함.
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 동일한 메소드명을 중복정의: overloading.
	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	// 동일한 메소드명을 가질경우 매개변수에 들어가는 타입에따라서 정해짐.
	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}

}
