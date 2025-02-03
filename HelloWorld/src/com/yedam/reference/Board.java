package com.yedam.reference;
/*
 * 복합형태의 데이터타입 클래스.
 * 
 * 게시글제목, 내용, 작성자, 작성일시(2025-02-01). 
 * 
 * */
public class Board {
	
	// 필드선언
	private String title;
	private String content;
	private String writer;
	private String writeDate;
	
	
	// 생성자.
	public Board(String title, String content, String writer, String writeDate) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
	// getter, setter. get와 set를 하지않으면 다른클래스에서 필드를 사용할수없음.
	// private는 다른클래스에서 사용하지못함.
	
	// setter 매개변수 지정.
	public void setTitle(String title) {
		this.title = title;
	}
	// getter. 리턴값지정
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	// 게시글
	// showBoard()
	public String showBoard() {
		return title + " " + content + " " + writer + " " + writeDate;
	}
	
}
