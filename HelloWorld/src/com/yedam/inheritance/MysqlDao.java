package com.yedam.inheritance;

public abstract class MysqlDao extends Dao {
	@Override
	public void register() {
		System.out.println("등록기능");
	}
	@Override
	public void remove() {
		System.out.println("삭제기능");
	}
	@Override
	public void search() {
		System.out.println("조회기능");
	}
}
