package com.yedam.inheritance;

/*
 * 친구목록, 등록, 수정, 삭제.
 * 수정: 이름, 연락처 입력.
 */

import java.util.Scanner;

public class FriendExe {
	// 싱글톤방식으로.
	// 1.필드선언.
	private static FriendExe instance = new FriendExe();
	// 2.생성자 은닉
	private FriendExe() {
	}
	// 3.인스턴스를 반환하는 메소드.
	public static FriendExe getInstance() {
		return instance;
	}
	Friend[] friends = new Friend[100];
	Scanner scn = new Scanner(System.in);

	public void init() {
		friends[0] = new Friend("홍길동", "010-1111-2222");
		friends[1] = new UnivFriend("김민식", "010-3333-4444", "예담", "컴공");
		friends[2] = new ComFriend("박민규", "010-5555-6666", "예담(주)", "개발");
	}

	// 시작 메소드
	public void run() {
		init();
		boolean run = true;
		while (run) {
			System.out.println("1.친구목록 2.등록 3.수정 4.삭제 9.종료");
			System.out.println("메뉴선택>> ");
			int menu = scn.nextInt();
			switch (menu) {
			case 1: // 목록.
				friendList();
				break;
			case 2: // 등록.
				addFriend();
				break;
			case 3: // 수정.
				editFriend();
				break;
			case 4: // 삭제.
				delFriend();
				break;
			case 9: // 종료.
				System.out.println("종료합니다.");
				run = false;
			default:
				System.out.println("메뉴를 확인하세요");
			} // switch
		}
	} // end of run
		// 추가 메소드.

	// 목록
	void friendList() {
		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showInfo());
			}
		}
	}// end

	// 등록 친구타입 선택
	// 친구: 이름, 연락처
	// 학교: 친구 + 학교명, 전공.
	// 회사: 친구 + 회사명, 부서.
	void addFriend() {
		System.out.println("1.친구등록 2.학교친구 3.회사친구 4.종료");
		System.out.println("선택>> ");
		int choice = scn.nextInt();
		scn.nextLine();

		// 이름, 연락처.
		String name = "";
		while (true) {
			System.out.println("이름입력>>");
			name = scn.nextLine();
			// 이름의 정상값의 범위
			if (name.length() >= 2 && name.length() <= 10) {
				break;
			} else {
				System.out.println("이름은 2글자 이상 10글자 이하...");
			}
			System.out.println("연락처입력>>");
			String phone = scn.nextLine();

			Friend friend = null;
			// 종료처리.

			if (choice == 4) {
				return;
			}
			if (choice == 1) {
				friend = new Friend(name, phone);

			} else if (choice == 2) { // 학교, 전공
				System.out.println("학교입력>>");
				String univ = scn.nextLine();
				System.out.println("전공입력>>");
				String major = scn.nextLine();
				friend = new UnivFriend(name, phone, univ, major);

			} else if (choice == 3) { // 회사, 부서.
				System.out.println("회사입력>>");
				String univ = scn.nextLine();
				System.out.println("부서입력>>");
				String major = scn.nextLine();
				friend = new ComFriend(name, phone, univ, major);

			} else {

			}
			// 빈공간에 저장.
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("등록에 성공하였습니다.");
					return;
				}
			}
		}

	}// end

	// 수정
	void editFriend() {
		System.out.println("친구수정");
		System.out.println("수정하고싶은 친구의 이름을 입력하세요");
		String name = scn.nextLine();
		System.out.print("수정하고싶은 친구의 번호를 입력하세요");
		String phone = scn.nextLine();
		System.out.println(name + "왜 안떠");
		for (int i=0; i< friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i].setPhoneNumber(phone);
				System.out.println("수정에 성공하였습니다.");
				return;
			} else {
				System.out.println("찾으시는 친구가 없습니다.");
				return;
			}
		}
	}// end

	// 삭제
	void delFriend() {
		System.out.println("친구삭제");
	}// end

} // end of FriendExe
