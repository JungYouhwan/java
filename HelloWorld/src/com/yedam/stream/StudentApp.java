package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생정보 관리프로그램 v.1
 * 학생이름, 키, 몸무게, 점수.
 */
public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;

	// 임시저장.
	List<Student> students = new ArrayList<>();

	public StudentApp() {
		try {
			init(); // 초기값
		}catch(NumberFormatException e){
			
		}
	}

	public void start() {
		
			while (run) {
				System.out.println("1.목록 2.추가 3.삭제 9.종료");
				System.out.println("선택>> ");
				int menu = Integer.parseInt(scn.nextLine());
				
				switch (menu) {
				case 1:
					studentList();
					break;
				case 2:
					addStudent();
					break;
				case 3:
					removeStudent();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					save();
					run = false;
					break;
				default:
					break;
				}
			}
	
		System.out.println("end of prog");
	}// start

	public void studentList() {
		// 이름 점수
		// -----------
		// 홍길동 90
		System.out.println(" 이름     점수");
		System.out.println("--------------");

		for (Student std : students) {
			System.out.println(" " + std.getName() + "    " + std.getScore() + "");
		}

	} // studentList

	public void addStudent() {
		System.out.println("학생이름 입력>> ");
		String name = scn.nextLine();
		System.out.println("학생키 입력>> ");
		Double height = Double.parseDouble(scn.nextLine());
		System.out.println("학생몸무게 입력>> ");
		Double weight = Double.parseDouble(scn.nextLine());
		System.out.println("학생 점수 입력>>");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score)); // 추가.
		System.out.println("-------------");
		System.out.println("   등록완료.");
		System.out.println("-------------");

	} // addStudent

	public void removeStudent() {
		System.out.println("학생이름 입력>> ");
		String name = scn.nextLine();

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("-------------");
				System.out.println("  삭제 완료.");
				System.out.println("-------------");
				break;
			}
		}
	} // removeStudent

	public void save() {
		// c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("C:/temp/studentList.txt");
			// 갯수만큼 반복저장.
			// write(규칙 공백 또는 , 로 구분)규칙을 정해줘야함
			for (Student std : students) {
				writer.write(std.getName() + "  " + std.getHeight() + "  " + std.getWeight() + "  " + std.getScore());
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("save");
	} // save

	public void init() {
		// C:/temp/studentList.txt
		try {
			Reader reader = new FileReader("C:/temp/studentList.txt");
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				// 한라인씩 읽어드리는 reader로 한 라인씩 읽어드리면서 str에 저장
				String str = br.readLine();
				if (str == null)
					break;
				// split로 공백을 제거
				String[] ary = str.split(" ");
				Student student = new Student(ary[0], Double.parseDouble(ary[1]), Double.parseDouble(ary[2]),
						Integer.parseInt(ary[3]));
				
				students.add(student); // 컬렉션 추가.

			}
			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}// init

}// StudentApp
