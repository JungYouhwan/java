package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용.
 * 
 */

public class EmpListExe implements EmpDAO {

	// 필드
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간
	// add는 boolean 타입으로 값이 입력되면 true, 입력안되면 false

	// 생성자.
	public EmpListExe() {
		// 초기값
		empList.add(new Employee(1001, "홍길동", "432-1234"));
		empList.add(new Employee(1012, "조길동", "621-1214"));
		empList.add(new Employee(1023, "최길동", "052-5684"));
		empList.add(new Employee(1010, "박사장", "333-5678", "2000-01-01", 500));

	}

	// 메소드
	@Override
	public boolean registerEmp(Employee emp) {
		return empList.add(emp); // 등록
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// for문으로 입력받은 값을 찾아야함. 찾으면서 사원번호가 같으면 수정진행하고
		// return true 반환
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) {
				// 연락처 값이 ""이 아닐때 변경
				if (!emp.getTelNo().equals("")) {
					empList.get(i).setTelNo(emp.getTelNo());
				}
				try {
					// 값을 변경 안할려고.. 엔터만 쳤을경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary());
				}
				return true; // 수정 성공.
			}
		}
		return false; // 수정 실패.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNo) {
				empList.remove(i);
				return true; // 삭제 성공.
			}
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) { // sal 기준
		List<Employee> result = new ArrayList<Employee>();
		// 몇번 위치의 배열에 담을지 index번호로 사용할 변수선언
		
		String name = emp.getEmpName();
		int idx = 0;
		int salary = emp.getSalary(); // salary 필드
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).getEmpName().indexOf(name) > -1) {
				result.add(emp);
				idx++; // 출력 될떄마다 인덱스값이 증가.
			}
		}
		return result;
	}

}
