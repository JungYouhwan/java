package com.yedam;

public class Variable2 {
	public static void main(String[] args) {
//		int num = 4;
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
				// `${num} * ${i} = ${num*i}`
//			System.out.println(num + " * " + i + " = " + num * i);
				// 변수위치를 미리 지정하고 ,로 들어갈 변수명을 차례대로 입력 변수위치를 $를 통해서 임의로 선택가능
//			System.out.printf("%1$d * %3$d = %2$d \n", num, i, num * i);
			}
			System.out.print("\n"); 
		}
		System.out.println("end of prog");
	}
}
