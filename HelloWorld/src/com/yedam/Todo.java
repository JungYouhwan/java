package com.yedam;

import java.util.Scanner;
// 01-22
// com.yedam.Todo
public class Todo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; //예금액. 현재 잔액보다 큰금액: "잔액을 확인하세요." 인출X 입금액이 100000넘으면: "초과금액입니다."
		int bal = 0; // 입력받는 값
//			int num = Integer.parseInt(scn.nextLine()); // 문자타입반환. -> int 변환 Integer.parseInt();
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요>");
			int num = Integer.parseInt(scn.nextLine());
			if (num == 1) {
				System.out.println("입금화면입니다.");
				System.out.print("입금액을 입력.");
				bal = Integer.parseInt(scn.nextLine());
				if (bal + balance < 100000) {
					balance += bal;
					System.out.println(bal +" 입금했습니다.");
				}else {
					
					System.out.println("입금 실패. 초과금액입니다.");
				}
				
			} else if (num == 2) {
				System.out.println("출금화면입니다.");
				System.out.print("출금액을 입력.");
				bal = Integer.parseInt(scn.nextLine());
				if (bal <= balance) {
					balance -= bal;
					System.out.println("출금했습니다.");
				}
				System.out.println("입금액을 확인하세요.");
			} else if (num == 3) {
				System.out.print("잔액조회입니다.");
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			} else if (num == 4){
				System.out.print("프로그램을 종료합니다.");
				break;
			}
		}

		// nextLine() , nextInt()
		// 시스템의 기본 입력장치 System.out
//		System.out.printf("입력한 값은 %s\n", num);
	}
}
