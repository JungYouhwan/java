package com.yedam;

public class Variable1 {
	public static void main(String[] args) {
		// int (4byt)
		int num1 = 1101111;
		
		byte num2 = 27; // bute1byte)
		short num3 = 128;
		long num4 = 9223372036854775807L;
		System.out.println(Long.MAX_VALUE);
		
		byte num5 = 20;
		
		byte result = (byte) (num2 + num5); // 강제형변환(casting)
		int intResult = num1 + num5;
		System.out.println(intResult);
		
		// 데이터타입 변수이름 = 값
		int[] intAry = { 10, 25, 82, 11 };
		
		// 배열을 만들시 처음정해진 공간만큼만 사용가능 (배열크기가 늘어나지않음.)
		String[] strAry = {"Hong", "Park", "Choid"};
		strAry[2] = "Kim";
		
		int[] anotherAry = new int[10]; // 크기 10을 생성.
		System.out.println(anotherAry);
		for(int i =0; i< anotherAry.length; i++) {
			anotherAry[i] = (int)(Math.random() * 100); // 34.32423 앞의 34만 꺼내고 나머지는 버림.
		}
		// 배열값을 출력.
		for(int num : anotherAry) {
			System.out.println(num);
		}
		
		int sum = 0;
		for(int i=0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("sum의 값은" + sum);
	}
}
