
package com.yedam.stream.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExe {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클 DB의 접속정보.
		String user = "hr";
		String password = "hr";
		try {
			// 매개값으로 사용자의 url, 유저정보, 유저 비밀번호
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공");
			// insert
			Statement stmt = conn.createStatement();
//			stmt.executeUpdate("insert into tbl_student (student_no, student_name) values ('S006', '홍길이')");
			// update
			// 박현수의 연락처 010-8787-6565
			int up = stmt.executeUpdate("updzaaaaaaaxate tbl_student set phone = '010-8787-6562', address = '대구' where student_name = '홍길이'");
			if (up >0) {
				System.out.println("수정완료.");
			}
			// tbl_student 테이블의 조회.
			ResultSet rs = stmt.executeQuery("select * from tbl_student");
			
			// 반복문 활용
			// next() = 가져올 데이터가 있을때 true. 없으면 false.
			while(rs.next()) {
				// 컬럼명.
				System.out.println(rs.getString("student_no") // 
				 + "   " + rs.getString("student_name") //
				 + "   " + rs.getString("phone") //
				 + "   " + rs.getString("address") //
				 );
			}
			System.out.println("end of data.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of prog.");
	}
}
