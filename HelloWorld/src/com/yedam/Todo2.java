package com.yedam;

import java.util.Scanner;

// 친구정보관리 앱 v.1
// 이름, 연락처, 성별(남/여) => 홍길동,010-222-2222,남
// 1.목록(이름, 연락처, 성별) 2.등록(이름,연락처,성별) 3.조회(성별입력 같은성별조회) 4.삭제(이름) 5.수정(이름)9.종료.
public class Todo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String[] friend = new String[10];
		friend[0] = "홍길동,010-1234-5678,남자";
		friend[1] = "남길동,010-1234-5678,남자";
		friend[2] = "남자길동,010-1234-5678,남자";
		friend[3] = "길동,010-1234-5678,여자";
		friend[4] = "여길동,010-1234-5678,여자";
		friend[5] = "여자길동,010-1234-5678,여자";
		while (run) {
			System.out.println("1.목록 2.등록 3.조회 4.삭제 5.수정 9.종료");
			System.out.println("메뉴를 선택하세요>");
			System.out.println("==================================");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("목록입니다.");
				System.out.println("==================================");
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null) {
						System.out.println(friend[i]);
						System.out.println("==================================");
					}
				}
				break;
			case 2:
				System.out.println("등록화면 입니다.");
				System.out.println("==================================");
				System.out.println("이름, 전화번호, 성별을 입력해주세요. ex)홍길동,010-2222-2321,남");
				System.out.print("==================================");
				for (int i = 0; i <= friend.length; i++) {
					if (friend[i] == null) {
						friend[i] = scn.nextLine();
						System.out.println(friend[i]);
						System.out.println("등록 완료.");
						System.out.println("==================================");
						break;
					}
				}
				break;
			case 3:
				System.out.println("조회합니다.");
				System.out.println("==================================");
				System.out.println("조회할 성별을 찾으세요");
				System.out.print("==================================");
				String searchEx = scn.nextLine();
				String ex = null;
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] == null) {
						break;
					} else {
						ex = friend[i].split(",")[2];
					}
					if (ex.equals(searchEx)) {
						System.out.println(friend[i]);
						System.out.println("==================================");
					}
				}
				break;
			case 4:
				System.out.println("삭제화면 입니다.");
				System.out.println("==================================");
				System.out.println("이름, 전화번호, 성별을 입력해주세요. ex)홍길동,010-2222-2321,남");
				System.out.print("==================================");
				String searchName = scn.nextLine();
				for (int i = 0; i <= friend.length; i++) {
					if (friend[i] == null) {
//						friend[i].split(",")[0];
						friend[i] = scn.nextLine();
						System.out.println(friend[i]);
						System.out.println("등록 완료.");
						System.out.println("==================================");
						break;
					}
				}
				break;
			case 5:
			case 9:
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.err.println("프로그램을 종료합니다.");
	}

}
