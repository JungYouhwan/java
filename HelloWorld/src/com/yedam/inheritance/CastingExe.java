package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long
		// 자동타입변환(promotion)
		// 타입이 달라도 내부적으로 프로모션이라는 작업을통해 작은범위의 값은 큰값에 넣을 경우늘려줌. 
		// 큰범위의 값이 작은범위의 값에 넣을경우 변환시켜서 집어넣어야함.
		// 작은범위의 값이 큰범위의 값에 넣을때는 자동변환가능.
		int n1 = 100;
		long n2 = 0;
		n1 = (int) n2; // casting
		n2 = n1; // promotion
		
		Friend f1 = new ComFriend("", "", "", "");
		
//		ComFriend f2 = new Friend("", "");
//		ComFriend f2 = (ComFriend)new Friend("", ""); // 변환한것. casting.
		
		// Object <- Friend <- ComFriend, UnivFriend
		
		// instanceof = 객체 타입확인
		// ComFriend("","","","") Friend("", "")
		f1 = new Friend("", "");
		if(f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		}else {
			System.out.println("타입이 다릅니다.");
		}
		// 추상클래스
		// 상속받는 애들이 각자의 규칙을 정하기위한 클래스??  
		
		
		
		
		
	}
}
