package com.yedam.api;

public class StringUtil {

	static void 연결하기(String str, String str1) {
		// 문자를 출력하는 메소드 "" + "" + ""
		System.out.println(str.concat(",").concat(str1));
	}

	static void checkGender(String ssn1, String ssn2, String ssn3) {
		// 성별을 출력. "남자입니다." 또는 "여자입니다"

		System.out.println(ssn1.length());
		int last = 7;
		if(ssn1.length() == 14) {
			last = 8;
		}
		String gender = ssn1.substring(6, last);
			switch (gender) {
			case "1":
			case "3":
				System.out.println(ssn1.concat("남자입니다."));
				break;
			case "2":
			case "4":
				System.out.println(ssn1.concat("여자입니다"));
				break;
			}
	}

	static void checkExtesion(String file1, String file2) {
		// 파일을 확장자는 jpg입니다. mp3입니다.
		System.out.println("확장자는".concat(file1.substring(file1.indexOf(".")+ 1)));
		System.out.println("확장자는".concat(file2.substring(file2.indexOf(".")+ 1)));
		
		
	}

	static void checkLength(String str1, String str2, String str3) {
		// 문자의 객수를 반환
		System.out.println(str1.trim().length());
		System.out.println(str2.trim().length());
		System.out.println(str3.trim().length());
	}

}
