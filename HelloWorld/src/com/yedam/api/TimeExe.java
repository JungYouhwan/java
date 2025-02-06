package com.yedam.api;


public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력
		// 1부터 100000000 까지 짝수합을 구하는 시간.
		
		long start = System.nanoTime();
		long sum = 0;
		for (long i=0; i <= 10000000000L; i++) {
			if(i % 250 == 0) {
				sum = sum + i;
			}
		}
		long end = System.nanoTime();
		System.out.println(sum);
		System.out.println("실행시간: " + (end - start)/1000000000L + "초");
		
	}
}
