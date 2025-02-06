package com.yedam.exception;

import com.yedam.reference.Student;

public class NullpointerExe {
	public static void main(String[] args) {
		
		Student student = null; 
		String[] strAry = {"Hello", "World"};
		// 예외처리에도 부모와 자식관계가 있음.
		// Exception 이 최고 상위의 예외임.
		// 예외처리.
		try {
			int menu = Integer.parseInt("a");
			strAry[2] = "Nice"; // 배열의 범위 밖.
			System.out.println(student.getStudentNm());// 에러나는 부분에서 부터 종료
			System.out.println("null값을 참조 또는 배열 범위 초과했습니다");
//		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
		} catch (NullPointerException e) {
			System.out.println("null값을 참조 또는 배열 범위 초과했습니다");
			e.printStackTrace(); // 빨간색 에러메시지로 에러발생위치 알려줌.
		} catch (RuntimeException e) {
			System.out.println("상위exception은 하위 exception 처리");
			System.out.println("상위exception은 하위 exception 처리");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog"); // 끝부분
	}
}
