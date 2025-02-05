package com.yedam.inheritance;
/*
 *  Data Access Object. = DAO
 *  추상클래스 규칙. 지정한대로 만들어줘야함.
 *  MysqlDao -> register, remove, search
 *  OracleDao -> register, remove, search
 *  실행클래스의 코드수정 최소화 가능.
 */
public abstract class Dao {
	// 등록.
	public abstract void register();
	public abstract void remove();
	public abstract void search();
}
