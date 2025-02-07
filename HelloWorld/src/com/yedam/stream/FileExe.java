package com.yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExe {
	public static void main(String[] args) {
		// ListExe.java 파일 읽기.
		try {
			Reader reader = new FileReader("C:/temp/ListExe.java");
			while(true) {
				int chr = reader.read(); // char(2byte)
				System.out.print((char) chr); // 65 -> A
				if(chr == -1) {
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

	// 문자기반 파일출력.
	void write() {
		try {
			Writer wr = new FileWriter("C:/temp/test2.txt");
			wr.write(65);
			wr.write(new char[] { 'B', 'C' });
			wr.write("DEFGHI", 2, 3);

			wr.flush();
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일 복사.
	void copy() {
		// c:/temp/sample.PNG -> C:/temp/copy.PNG 생성
		// 1byte읽고 1byte쓰기.
		try {
			InputStream is = new FileInputStream("C:/temp/sample.PNG");
			OutputStream os = new FileOutputStream("C:/temp/copy2.PNG");

			int data = -1;
			// byte단위로 읽어드리는게 너무느려서 배열만큼 읽어드리게함.
			// 입력할때 buf배열에 담아서 출력할때는 buf타입에있는걸 읽어서 빠르게 읽음.
			byte[] buf = new byte[100];
			// outputStream의 메소드 read() = 1byte를 읽고 int타입으로 4byte타입으로 리턴.
			// intputStream의 메소드 write() = 4byte
			while (true) {

				data = is.read(buf); // -1 반환.

				os.write(data); // 출력(바이트 쓰기)

				if (data == -1) {
					break;
				}
			}
			is.close();
			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of main.

	void input() {
		// 읽어드리기 위해서 입력스트림 예제.
		try {
			InputStream is = new FileInputStream("C:/temp/test1.dat");
			while (true) {
				int data = is.read(); // 바이트를 읽고 반환. -1값 반환.
				System.out.println(data);
				if (data == -1) {
					break;
				}
				is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}

	void output() {
		// 출력스트림(바이트기반) OutputStream(파일만들위치).
		try {
			OutputStream os = new FileOutputStream("C:/temp/test1.dat");
			os.write(10);
			os.write(20);
			os.write(30); // 쓰기
			os.flush(); // 버퍼비우기.
			os.close(); // 리소스 반환.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
