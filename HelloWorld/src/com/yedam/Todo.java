package com.yedam;

import java.util.Scanner;

// com.yedam.Todo
public class Todo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		int sum =0;
//			int num = Integer.parseInt(scn.nextLine()); // 문자타입반환. -> int 변환 Integer.parseInt();
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요>");
			int num = scn.nextInt();
			
			if (num == 1) {
				System.out.println("입금화면입니다.");
				System.out.print("입금액을 입력.");
				sum += scn.nextInt();
				balance += sum;
				
			} else if (num == 2) {
				System.out.println("출금화면입니다.");
				System.out.print("출금액을 입력.");
				balance -= scn.nextInt();
			} else if (num == 3) {
				System.out.print("잔액조회입니다.");
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			} else if (num == 4){
				break;
			}
			break;
		}

		// nextLine() , nextInt()
		// 시스템의 기본 입력장치 System.out
//		System.out.printf("입력한 값은 %s\n", num);
	}
}
