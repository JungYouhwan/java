package com.yedam.interfaces.emp;
/*
 *  배열활용.
 *  
 */
public class EmpAryExe implements EmpDAO{
	
//	Employee[] employees = new Employee[10]; // 저장.
	Employee[] employees = {
		// 초기값
		new Employee(1001, "홍길동", "432-1234"),
		new Employee(1012, "조길동", "621-1214"),
		new Employee(1023, "최길동", "052-5684"),
		new Employee(1010, "박사장", "333-5678", "2000-01-01", 500)
	};
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
		Employee[] result = new Employee[10];
		int idx = 0;
		for (int i = 0; i<employees.length; i++) {
			if(employees[i].getEmpName().indexOf(emp.getEmpName()) > -1) {
				System.out.println(employees[idx]);
				idx++;
			}
		}
		return null;
	}

}
