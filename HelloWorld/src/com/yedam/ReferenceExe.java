package com.yedam;

import com.yedam.reference.ReferenceExe1;

// class수업
// referenceExe1.java 파일의 클래스를 불러옴
// com.yedam.reference.ReferenceExe1 ref1; 이 코드가 import대신해서 쓰는 코드(파일의 위치
public class ReferenceExe {
	public static void main(String[] args) {
		String[] arg = null;
		ReferenceExe1.main(arg); // static 메소드는 클래스,메소드()
		ReferenceExe1 ref1; // import를 사용시 이런식으로 사용가능.
		ref1 = new com.yedam.reference.ReferenceExe1();
//		ref2 = new com.yedam.reference.ReferenceExe2(); private는 다른 클래스에서는 사용안됨.
		// ref1 = public
		// ref2 = private
		ref1.method1();
//		ref1.method2();
	}
}
