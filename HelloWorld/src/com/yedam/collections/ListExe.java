package com.yedam.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		// List의 특징: 인덱스값을 기준으로 순서대로 저장되고 인덱스를 활용해서
		// 원하는 값을 관리할수있다.
		
		List<String> strList = new ArrayList<String>(); // List에 여러가지를 담는건 위험이있음.
		strList.add(null);
		strList.add("Hong");
		strList.add(new String("kildong"));
		strList.add(new String(new byte[] {77, 108, 108, 111, 96}));
		
		// 인덱스값을 기준으로 값 제거
		strList.remove(0);
		strList.remove(1);
		strList.size(); // 컬렉션 크기확인.
		
		strList.add(0,"Hello");
		
//		System.out.println(strList);
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
//		System.out.println(strList.contains("Hong")); // 특정값 포함 확인 true false
	}
}
