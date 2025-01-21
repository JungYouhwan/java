package com.yedam;

import java.util.Scanner;

// com.yedam.Todo
public class Todo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.println("메뉴를 선택하세요>");
			int num = Integer.parseInt(scn.nextLine()); // 문자타입반환. -> int 변환 Integer.parseInt();
			
			if (num == 1) {
				System.out.println("입금화면입니다.");
				System.out.println("입금액을 입력.");
				balance += scn.nextInt();
			} else if (num == 2) {
				System.out.println("출금화면입니다.");
				System.out.println("출금액을 입력.");
				balance -= scn.nextInt();
			} else if (num == 3) {
				System.out.println("잔액조회입니다.");
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			} else if (num == 4){
				return;
			}
		}

		// nextLine() , nextInt()
		// 시스템의 기본 입력장치 System.out
//		System.out.printf("입력한 값은 %s\n", num);
	}
}
