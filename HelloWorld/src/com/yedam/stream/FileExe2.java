package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExe2 {
	public static void main(String[] args) {
		// 보조스트림 (입출력스트림)
		// BufferedReader
		try {
			Reader reader = new FileReader("C:/temp/students.txt");
			BufferedReader br = new BufferedReader(reader);
			
			// read는 한 문자씩 읽어옴.
			while(true) {
				String str = br.readLine(); // 한라인씩 읽어오기.
				if(str == null) { // 읽을게 없으면 null 반환됨.
					break; // 반복문 종료
				}
				String[] strAry = str.split(" "); // 구분자(공백)
				System.out.println("이름:" + strAry[0] + ", 영어:" + strAry[1] + ", 수학:" + strAry[2]);
			}
			
			br.close();
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
