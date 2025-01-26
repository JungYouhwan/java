package com.yedam.reference;

// Book.java와 같이 실습
import java.util.Scanner;

/*
 *<< 도서명, 저자, 출판사, 판매가격>>
 */
public class BookExe {
// static 선언된 클래스들은 static변수를 사용가능.(밖에있어도)
	static Book[] bookRepository = new Book[100]; // 책 배열
	static Scanner scn = new Scanner(System.in); // 스캐너
	public static void init() {
		// 초기데이터
		bookRepository[0] = new Book("이것이자바다", "신용권", "한빛미디어", 30000);
		bookRepository[1] = new Book("자바스크립트기초", "김기초", "자바출판사", 15000);
		bookRepository[2] = new Book("혼자공부하는자바", "김자바", "자바출판사", 20000);
	}// end of init()

	// 목록출력.
	public static void printList() {
		System.out.println("============================");
		System.out.println("도서명    저자    출판사   판매가격");
		System.out.println("============================");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo()); // Book.java에 정의
			} else {
				break;
			}
		}
	}// end of init()

	// 도서등록.
	public static void addBook() {
		System.out.println("책을 등록합니다.");
		System.out.println("============================");
		System.out.println("이름을 입력해주세요");
		String title = scn.nextLine();
		System.out.println("저자를 입력해주세요");
		String author = scn.nextLine();
		System.out.println("출판사를 입력해주세요");
	    String press = scn.nextLine();
		System.out.println("가격을 입력해주세요");
		int price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				bookRepository[i] = new Book(title, author, press, price);
			} else {
				break;
			}
		}
	}// end of addBook()

	// 조회(출판사)
	public static void searchList() {
		System.out.println("조회할 출판사를 알려주세요.");
		String press = scn.nextLine();
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookPress().equals(press)) {
				System.out.println(bookRepository[i].showBookInfo());
			} else {
				break;
			}
		}
	}// end of searchList()
	
	// 수정(도서명)
	public static void modifyBook() {
		System.out.println("수정 화면입니다.");
		System.out.println("수정하고싶은 도서명을 입력해주세요.");
		String search = scn.nextLine();
		System.out.println("이름을 입력해주세요");
		String title = scn.nextLine();
		System.out.println("저자를 입력해주세요");
		String author = scn.nextLine();
		System.out.println("출판사를 입력해주세요");
		String press = scn.nextLine();
		System.out.println("가격을 입력해주세요");
		int price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookTitle().equals(search)) {
				bookRepository[i] = new Book(title, author, press, price);
				System.out.println("수정 완료");
			} else {
				break;
			}
		}
	} // end of modifyBook()
	
	//상세조회
	public static void showDetail() {
		System.out.println("상세 조회화면입니다.");
		System.out.println("조회하고싶은 도서명을 입력해주세요.");
		System.out.println("=================================");
		String title = scn.nextLine();
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookTitle().equals(title)) {
				bookRepository[i].showDetailInfo();
			} else {
				break;
			}
		}
	} // end of showDetail()
	

	public static void main(String[] args) {
		// 밖에 선언된 static 데이터임. 호출해야만 사용가능.
		init();
		// 1.전체목록 2.도서등록 3.조회(출판사) 4.수정 5.상세 조회 9.종료
		boolean run = true;
		while (run) {
			System.out.println("1.도서목록 2.도서등록 3.조회(출판사) 4.수정 5.상세조회 9.종료");
			System.out.println("실행할 기능을 선택하세요.>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 목록출력.
				printList(); break;
			case 2: // 등록.
				addBook(); break;
			case 3: // 단건 조회.
				searchList(); break;
			case 4: // 수정.
				modifyBook(); break;
			case 5: // 상세 조회.
				showDetail(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}// end of main
}
