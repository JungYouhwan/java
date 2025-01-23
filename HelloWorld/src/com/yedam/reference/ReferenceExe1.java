package com.yedam.reference;

public class ReferenceExe1 {
	
	
	public static void main(String[] args) {
		// 배열선언.
		double[] dblAry = new double[5];
		// 만들어진 배열에 값변경
		dblAry[0] = 171.3;
		System.out.println(dblAry.length);
		for(int i=0; i<dblAry.length;i++) {
			
		}
		
		dblAry = new double []{160.5, 174.6 };
		System.out.println(dblAry.length);
		
		// 배열[][] => 다차원배열.  배열안에 배열을 만들 수 있음.
		int[][] intAry = new int[2][3];   // 2 * 3 배열선언.
		intAry[0][0] = 10;
		intAry[0][1] = 20;
		intAry[1][0] = 20;
		intAry[1][1] = 30;
		intAry[1][2] = 40;
		
		// 다차원 배열의 모든값을 확인 할수있음.
		for(int j = 0;j<intAry.length;j++) {
			for(int i = 0;i<intAry[j].length;i++) {
				System.out.println("intAry[" + j +"]["+ i +"] =>" + intAry[j][i]);
			}
		}
		
	}
	
	public int sum(int num1, int num2) {	// 인트타입으로 최초반환값이 필수로 있어야함
		return num1 + num2;
	}
	
	public void method1() { 
		System.out.println("method1()이 호출되었습니다.");
	}
	private void method2() {
		System.out.println("method2()이 호출되었습니다.");
	}
	
}
