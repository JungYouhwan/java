package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String[][] friend = new String[100][3];
		friend[0] = new String[] { "홍길동", "010-1234-5678", "남자" };
		friend[1] = new String[] { "남길동", "010-1234-5678", "남자" };
		friend[2] = new String[] { "남자길동", "010-1234-5678", "남자" };
		friend[3] = new String[] { "길동", "010-1234-5678", "여자" };
		friend[4] = new String[] { "여길동", "010-1234-5678", "여자" };
		friend[5] = new String[] { "여자길동", "010-1234-5678", "여자" };

		while (run) {
			System.out.println("1.목록 2.등록 3.조회 4.삭제 5.수정 9.종료");
			System.out.println("메뉴를 선택하세요>");
			System.out.println("==================================");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:

//				System.out.println("목록입니다.");
//				System.out.println("==================================");
//				for (int i = 0; i < friend.length; i++) {
//					for (int j = 0; j < friend[i].length; j++) {
//						for (int e = 0; e < friend[i][j].length; e++) {
//							if (friend[i] != null && friend[i][j] != null && friend[i][j][e] != null) {
//								System.out.println(friend[i] + friend[i][j] + friend[i][j][e]);
//								System.out.println("==================================");
//							}else {
//								break;
//							}
//						}
//					}
//				}
//				break;
			case 2:
				System.out.println("등록화면 입니다. 이름, 전화번호, 성별을 입력해주세요.");
				System.out.println("ex)홍길동,010-2222-2321,남");
				System.out.print("==================================");
				for (int i = 0; i <= friend.length; i++) {
					if (friend[i] == null) {
//						friend[i] = scn.nextLine();
						System.out.println(friend[i]);
						System.out.println("등록 완료.");
						System.out.println("==================================");
						break;
					}
				}
				break;
			case 3:
				System.out.println("조회 화면입니다. 조회할 성별을 입력해주세요");
				System.out.print("==================================");
				String searchEx = scn.nextLine();
				String ex = null;
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] == null) {
						break;
					} else {
//						ex = friend[i].split(",")[2];
					}
					if (ex.equals(searchEx)) {
						System.out.println(friend[i]);
						System.out.println("==================================");
					}
				}
				System.out.println(searchEx);
				searchEx = null;
				break;
			case 4:
				System.out.println("삭제화면 입니다. 이름을 입력해주세요");
				System.out.print("==================================");
				String searchName = scn.nextLine();
				for (int i = 0; i <= friend.length; i++) {
					if (friend[i] == null) {
						System.out.println("null값");
						break;
//					} else if (friend[i].split(",")[0].equals(searchName)) {
//						friend[i] = null;
//						System.out.println("삭제 완료.");
//						System.out.println("==================================");
//						break;
					}
				}
				searchName = null;
				break;
			case 5:
				System.out.println("수정화면 입니다. 이름을 입력해주세요");
				System.out.print("==================================");
				String search = scn.nextLine();
				for (int i = 0; i <= friend.length; i++) {
					if (friend[i] == null) {
						break;
					}
//					else if (friend[i].split(",")[0].equals(search)) {
//						System.out.println("이름,전화번호,성별(남자,여자)입력해주세요.");
//						System.out.print("==================================");
//						String name = scn.nextLine();
////						friend[i] = name;
//						System.out.println("수정 완료.");
//						System.out.println("==================================");
//						name = null;
//						break;
//					}
				}
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.err.println("프로그램을 종료합니다.");

	} // end of main.
}
