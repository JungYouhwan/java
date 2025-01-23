package com.yedam.reference;

public class Reference2 {
	public static void main(String[] args) {
		String[][] mb = new String[5][2];
		mb[0][0] = "홍길동";
		mb[0][1] = "80";
		mb[1][0] = "김민수";
		mb[1][1] = "85";
		mb[2][0] = "박헌수";
		mb[2][1] = "88";
		mb[3][0] = "심상헌";
		mb[3][1] = "90";
		mb[4][0] = "최기동";
		mb[4][1] = "75";

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < mb[i].length; j++) {
				System.out.println("mb[" + i + "][" + j + "] =>" + mb[i][j]);
			}
		}

		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(mb[i][1]);
		}
		System.out.println("점수의 합계는" + sum);
		// 제일 점수가 높은사람의 이름
		int max = 0;
		String name = "";
		for (int i = 0; i < mb.length; i++) {
			if (max < Integer.parseInt(mb[i][1])) {
				max = Integer.parseInt(mb[i][1]);
				name = mb[i][0];
			}
		}
		System.out.println(name + max);
	}
}
