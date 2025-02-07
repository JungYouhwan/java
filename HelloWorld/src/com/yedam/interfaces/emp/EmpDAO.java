package com.yedam.interfaces.emp;

import java.util.List;

/*
 * 등록, 수정, 삭제, 조회.
 */
public interface EmpDAO {

	// 등록.
	public boolean registerEmp(Employee emp);
	
	// 수정.
	public boolean modifyEmp(Employee emp);
	
	// 삭제. 똑같은 사원번호가 존재하면 안됨.
	// 사원번호만 전달
	public boolean removeEmp(int empNo);
	
	// 조회. 사원번호를 조건
	public List<Employee> search(Employee emp);
}
