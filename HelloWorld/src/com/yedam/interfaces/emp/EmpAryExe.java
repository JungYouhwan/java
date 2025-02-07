package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 *  배열활용.
 *  
 */
public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[10]; // 저장.

	public EmpAryExe() {
		// 초기값
		employees[0] = (new Employee(1001, "홍길동", "432-1234"));
		employees[1] = (new Employee(1012, "조길동", "621-1214"));
		employees[2] = (new Employee(1023, "최길동", "052-5684"));
		employees[3] = (new Employee(1010, "길사장", "333-5678", "2000-01-01", 500));}

	@Override
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = emp;
				return true; // 정상등록
			}
		}
		return false; // 등록 실패
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// for문으로 입력받은 값을 찾아야함. 찾으면서 사원번호가 같으면 수정진행하고
		// return true 반환
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpNo() == emp.getEmpNo()) {
				// 연락처 값이 ""이 아닐때 변경
				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}
				try {
					// 값을 변경 안할려고.. 엔터만 쳤을경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true; // 수정 성공.
			}
		}
		return false; // 수정 실패.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpNo() == empNo) {
				employees[i] = null;
				return true; // 삭제 성공.
			}
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> result = new ArrayList<Employee>();
		int idx = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) > -1) {
				result.add(emp);
				idx++;
			}
		}
		return result;
	}

}
