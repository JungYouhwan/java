package com.yedam.reference;

import java.util.Scanner;

/*
 * Board의 실행 클래스.
 * 1.글목록 2.글등록 3.삭제 9.종료
 * 
 * */
public class BoardExe {
	// 클래스를 불러올떄 static은 같이 한번에 준비됨.
	// 필드도 같이 불러오기위해서 static선언.
	static Board[] boardRepo = new Board[100]; // 게시글을 등록하는 배열.
	static Scanner scn = new Scanner(System.in);

	public static void initData() {
		// 배열의 샘플데이터.
		boardRepo[0] = new Board("게시글제목1", "내용입니다.1", "user01", "2025-01-27");
		boardRepo[1] = new Board("게시글제목2", "내용입니다.2", "user01", "2025-01-29");
		boardRepo[2] = new Board("게시글제목3", "내용입니다.3", "user01", "2025-01-30");
		boardRepo[3] = new Board("게시글제목4", "내용입니다.4", "user01", "2025-01-30");
		boardRepo[4] = new Board("게시글제목5", "내용입니다.5", "user01", "2025-01-30");

		boardRepo[5] = new Board("게시글제목6", "내용입니다.6", "user02", "2025-01-30");
		boardRepo[6] = new Board("게시글제목7", "내용입니다.7", "user02", "2025-01-30");
		boardRepo[7] = new Board("게시글제목8", "내용입니다.8", "user02", "2025-01-30");
		boardRepo[8] = new Board("게시글제목9", "내용입니다.9", "user02", "2025-01-30");
		boardRepo[9] = new Board("게시글제목10", "내용입니다.10", "user02", "2025-01-30");

		boardRepo[10] = new Board("게시글제목11", "내용입니다.11", "user03", "2025-01-30");
		boardRepo[11] = new Board("게시글제목12", "내용입니다.12", "user03", "2025-01-30");
		boardRepo[12] = new Board("게시글제목13", "내용입니다.13", "user03", "2025-01-30");
	}

	public static void boardList() {
		// 글 목록을 보여주는 메서드.
		// 1페이지: 0~4, 2페이지: 5~9,
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0); // 13/5 = > 2.6;
		while (true) {
			int firstIdx = (page - 1) * 5; // page:2 =>5
			int lastIdx = (page * 5) - 1; // page:2 =>9
			for (int i = firstIdx; i <= lastIdx; i++) {
				if (boardRepo[i] != null) {
					System.out.println(boardRepo[i].showBoard());
				}
			}
			System.out.println("이전페이지:p, 이후페이지:n, 종료:q");
			String paging = scn.nextLine();
			if (paging.equals("n")) {
				// 마지막페이지보다는 작은값.
				if (page <= lastPage) {
					page++;
				}
			} else if (paging.equals("p")) {
				if (page > 1) {
					// 1보다는 큰값.
					page--;
				}
			} else if (paging.equals("q")) {
				return;
			}
		} // end of while.
	}

	// 배열을 매개값으로 전달하면 건수가 몇건 반환 메소드.
	public static int getMaxCount() {
		int count = 0; // 전체 건수
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}
		return count; // 건수반환.
	}

	public static void addBoard() {
		// 글 등록 메서드.
		System.out.print("제목을 입력>>");
		String title = scn.nextLine();
		System.out.print("내용을 입력>>");
		String content = scn.nextLine();
		System.out.print("아이디를 입력>>");
		String writer = scn.nextLine();
		System.out.print("날짜를 입력>>");
		String writeDate = scn.nextLine();
		// 배열의 빈공간에 입력한 데이터를 입력.
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, writer, writeDate);
				System.out.println("등록완료.");
				break; // 한건만 등록.
			}
		}
	}

	public static void removeBoard() {
		// 글 삭제 메서드. 글 제목을 입력받고 한건삭제
		System.out.print("삭제하고싶은 제목을 입력>>");
		String title = scn.nextLine();

		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				boardRepo[i] = null;
				System.out.println("삭제완료.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		boolean run = true;
		initData(); // 초기데이터 생성.

		while (run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 목록.
				boardList();
				break;
			case 2: // 등록.
				addBoard();
				break;
			case 3: // 삭제.
				removeBoard();
				break;
			case 9: // 종료.
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default: // 1, 2, 3, 9 외의 경우.
				System.out.println("메뉴를 확인하세요.");
			} // end of switch

		} // end of while.
		System.out.println("end of prog.");

	} // end of main.
}
