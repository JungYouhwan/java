package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map
 * 
 */
public class Exe {
	public static void main(String[] args) {
		// 학생정보를 저장하는 컬렉션(ArrayList) 선언.
		// 3명
		List<String> list = new ArrayList<String>();
		List<Friend> list2 = new ArrayList<Friend>();
		List<Student> list3 = new ArrayList<Student>();
		
		list.add("홍길동");
		list.add("박길동");
		list.add("김길동");
		
		list2.add(new Friend("김길동", "010-548"));
		list2.add(new Friend("박길동", "010-564"));
		list2.add(new Friend("복길동", "010-22"));
		
		list3.add(new Student("복길동", 50, 80));
		list3.add(new Student("디길동", 70, 60));
		list3.add(new Student("자길동", 90, 20));
		
		// 삭제
		for(int i= 0 ; i<list3.size(); i++) {
			if(list3.get(i).getStudentNm().equals("복길동")) {
				System.out.println("삭제완료");
			}
		}
		
		// 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).showInfo());
		}
		for(int i=0; i<list3.size(); i++) {
			list3.get(i).printInfo();
		}
		// 이름만 출력.
		for(int i=0; i<list3.size(); i++) {
			list3.get(i).printInfo();
		}
		
		
		
	}// end of main
	
	void method() {
		String[] strAry = new String[10];
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Friend> friends = new ArrayList<Friend>();
		// List = java util의 인터페이스  ArrayList= java util의 클래스.
		
		//다른 배열의 값을 집어넣기
		// friend("", "")
		friends.add(new Friend("홍길동", "010-111"));
		// ComFriend("", "", "", "")
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신한은행"));
		
		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friends크기 " + friends.size());
		System.out.println(friends.get(1).showInfo());
		System.out.println(friends.get(1).getFriendName() + "은 친구이름");
		//추가. List이름.add
		strList.add("안녕하세요.");
		strList.add("Hello.");
		strList.add("반갑습니다.");
		strList.add("반갑다.");
		
		System.out.println("strList크기: " + strList.size());
		
		//삭제. List이름.remove
		strList.remove(0);
		strList.remove("Hello.");
		System.out.println("strList크기: " + strList.size());
		
		//가져오기. 리스트이름.get(Index)
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
	
}
