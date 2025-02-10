package com.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDBExe implements EmpDAO {
	
	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클 DB의 접속정보.
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		try {
			conn = //
			// 매개값으로 사용자의 url, 유저정보, 유저 비밀번호
			DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	} // end of getConnect().
	
	

	@Override
	public boolean registerEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		String query = "insert into tbl_employees ";
		// 너무길어서 +=로 뒤에 이어붙임.
		query += "values (" + emp.getEmpNo() // 
		+ ", "+ emp.getEmpName() //
		+ ", " + emp.getTelNo() //
		+ ", " + emp.getHireDate() // 
		+ ", " + emp.getSalary() + ")";
		try {
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(query);
			if(r > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		
		try {
			// Connect() 안에 DB정보를 넣어서 불러왔음.
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbl_employees");
			// 조회결과.
			while(rs.next()) {
				Employee empl = new Employee();
				empl.setEmpNo(rs.getInt("emp_no"));
				empl.setEmpName(rs.getString("emp_name"));
				empl.setHireDate(rs.getDate("hire_date"));
				empl.setSalary(rs.getInt("salary"));
				empl.setTelNo(rs.getString("tel_no"));
				
				empList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

}
