package com.yedam;

import java.util.Scanner;

// 학생점수 입력 받아서 배열저장.
// 최고점수, 평균, 합계점수 출력.
public class ForloopExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] studentAry = new String[100];
		// 원하는이름.equals(찾을대상의변수);
//		System.out.println("박우식".equals(searchName)); 같은값이면 true 틀리면 false
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김민수,90";
		studentAry[2] = "동다자,50";
		
		boolean run = true;
		while (run) {
			System.out.println("1.학생이름, 점수 2.최고점수 3.학생입력(단건) 4.조회(이름) 9.종료");
			System.out.println("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 학생이름, 점수
				for (int i = 0; i < studentAry.length; i++) {
					System.out.println("이름, 점수 값을 입력하세요>> ex)홍길동, 85");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("정상적으로 입력되었습니다.");
				break;
			case 2:
				int max = 0;
				String maxStu = null;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						break;
					}
					int score = Integer.parseInt(studentAry[i].split(",")[1]);
					String name = studentAry[i].split(",")[0];
					if (max < score) {
						max = score;
						maxStu = name;

					}
				}
				System.out.println();
				System.out.println("최고점수자는 " + maxStu + "의" + max + "점 입니다.");
				break;
			case 3: // 단건 등록(이름) 반복문 종료.
				System.out.println("이름, 점수 값을 입력하세요>> ex)홍길동, 85");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = scn.nextLine();
						System.out.println("정상적으로 입력되었습니다.");
						break;
					}
				}
				break;
			case 4:// 이름을 입력받아 같은 대상 조회
				System.out.print("조회할 이름을 입력해주세요.");
				String SearchName = scn.nextLine(); // 이름을 입력받고 name에 저장
				String name = null;
				for (int i = 0; i < studentAry.length; i++) {
					name = studentAry[i].split(",")[0];  
					if (SearchName.equals(name)) {
						System.out.println("찾으시는" + SearchName +"은(는) 있습니다.");
						break;
					}else if(studentAry[i] == null) {
						System.out.println("찾으시는" + SearchName +"은(는) 없습니다.");
						break;
					}
				}
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.err.println("프로그램을 종료합니다.");
	}
}
