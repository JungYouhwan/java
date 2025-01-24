package com.yedam.reference;

public class Book {
	
	// 접근제한자 public, default, private
	// public은 다른 패키지에서도 사용가능.  
	// default는 패키지 내에서만 사용가능. 아무것도 입력안하면 = default 
	// private는 같은 클래스내에서만 사용가능.
	// 필드를 사용하는 이유 = 잘못된 값을 입력을 방지할 수 있다.
	// 필드
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
	
	// 
	// public, default, private => 접근지시자(access modifier)
	// 생성자
	Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}
	
	// 제목, 저자, 출판사, 가격
	String showBookInfo() {
		return bookTitle + "    " + bookAuthor + "    " + bookPress +"    " + bookPrice;
	}
	void showDetailInfo() {
		// 도서명: 이것이 자바다		출판사: 한빛미디어
		// 저  자: 신용권			가  격: 25000 원
		String strFormat = "도서명: %5s\t출판사: %5s\n저 자: %3s\t가 격: %5d 원\n"; 
		System.out.printf(strFormat, bookTitle, bookPress, bookAuthor, bookPrice);
		System.out.println("============================");
	}
	// setter. set
	// 도서 가격을 채우기
	void setBookPrice(int bookPrice) {
		if(bookPrice < 0) {
			this.bookPrice = 0; 
			return;
		}
		this.bookPrice = bookPrice; 
	}
	void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	
	//getter. get은 값을 가져오는거라 매개변수를 안적어도됨.
	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}

}
