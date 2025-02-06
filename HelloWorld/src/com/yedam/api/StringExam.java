package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
		// 문제호출
		연습();
		no1();
		no2();
		no3();
	}
	static void 연습() {
		String str = "hello";
		String str1 = "world";
		StringUtil.연결하기(str, str1);
	}
	static void no1() {
		String ssn1 = "980361234123";
		String ssn2 = "980351 2345234";
		String ssn3 = "021112-3341234";
		StringUtil.checkGender(ssn1, ssn2, ssn3);
	}
	static void no2() {
		// 파일경로와 파일명.
		String file1= "C:/temp/flower.jpg ";
		String file2= "D:/web/project/guide.mp3 ";
		StringUtil.checkExtesion(file1, file2);
	}
	static void no3() {
		// 문자의 갯수를 반환.
		String str1 = "  suggest   ";
		String str2 = "  currently   ";
		String str3 = "  particular  ";
		StringUtil.checkLength(str1, str2, str3);
	}
}
