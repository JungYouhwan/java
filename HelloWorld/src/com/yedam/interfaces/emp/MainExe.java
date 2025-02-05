package com.yedam.interfaces.emp;

import java.util.Scanner;

/*
 * 사원관리 App v.1
 * 실행클래스: MainExe
 * 인터페이스 활용.(배열, 컬렉션)
 * Employee, EmpAryExe, EmpListExe, EmpDAO(인터페이스)
 */
public class MainExe {
	public static void main(String[] args) {
		// 스캐너, run,
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		// 배열, 컬렉션
		EmpDAO dao = new EmpListExe();
		
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 9.종료");
			System.out.println("선택>> ");
			// 엔터키를 먹이기위해
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu){
			
			case 1: // 추가| 사원번호,이름,전화번호.
				System.out.println("사원번호 >>");
				int empNo = Integer.parseInt(scn.nextLine());
				System.out.println("이름>>");
				String eName = scn.nextLine();
				System.out.println("전화번호>>");
				String telNo = scn.nextLine();
				// 위에서 입력한 값을 매개변수로 dao.registerEmp에 전달
				if(dao.registerEmp(new Employee(empNo, eName, telNo))) {
					System.out.println("등록성공");
				}
				break;
				
			case 2: // 수정|사원번호 입력받아서 전화번호, 입사일자, 급여를 수정
				// 사원번호 입력
				System.out.println("사원번호 >>");
				empNo = Integer.parseInt(scn.nextLine());
				// 수정사항
				System.out.println("수정을 시작합니다.");
				System.out.println("전화번호>>");
				String tel = scn.nextLine();
				
				if (tel.equals("")) {
					tel = "";
				}
				
				System.out.println("입사일자>>");
				String hdate = scn.nextLine();
				
				if (hdate.equals("")) {
					hdate = "1900-01-01";// 엔터치고 넘어가면..
				}
				System.out.println("급여>>");
				String salString = scn.nextLine();
				if(salString.equals("")) { // 값을 안넣었을 경우. 0으로 인식.
					salString = "0";
				}
				
				int sal = Integer.parseInt(salString);

				// emp값을 넘겨줘야함 넘겨받으면 boolean값 넘겨받기
				if(dao.modifyEmp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정실패");
				}
				break;
			case 3: // 삭제| 사원번호를 입력받아 삭제.
				// 사원번호 입력
				System.out.println("사원번호 >>");
				empNo = Integer.parseInt(scn.nextLine());
				// 입력한 사원번호값 넘기기.
				if(dao.removeEmp(empNo)) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제실패");
				}
				break;
			case 4: // 조회| 여러 조건들을 선택해서 입력. 조회 이름을 치면 유사한 이름 출력
				System.out.println("조회 이름조건 >> ");
				String name = scn.nextLine();
				
				Employee emp = new Employee();
				emp.setEmpName(name);
				// 조회결과.
				Employee[] result = dao.search(emp);
				// 출력.
				System.out.println("사번     이름       연락처     급여     입사날짜");
				System.out.println("------------------------------------------");
				for(Employee empl : result) {
					if(empl != null) {
//						System.out.println(empl.getEmpName());
						System.out.println(empl.empInfo());
					}
				}
				break;
			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요.");
			}
		}
		System.out.println("end of prog.");
		
	} // end of main
} // end of mainExe
