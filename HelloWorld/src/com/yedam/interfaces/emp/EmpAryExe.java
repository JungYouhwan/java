package com.yedam.interfaces.emp;
/*
 *  배열활용.
 *  
 */
public class EmpAryExe implements EmpDAO{
	
	Employee[] employees = new Employee[10]; // 저장.
	
	@Override
	public boolean registerEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
