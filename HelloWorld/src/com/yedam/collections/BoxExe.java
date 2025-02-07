package com.yedam.collections;

class Box<E>{
	E item;
	
	void setItem(E item) {
		this.item = item;
	}
	
	E getItem() {
		return item;
	}
} 
// 타입 선언을 미리하지않고 사용할때 <>꺽쇠 안에들어가는 타입을 제네릭이라고함.
// 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법.(제네릭)
public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setItem("오렌지");
//		box.setItem(100);
		
		String result =(String) box.getItem(); // Object -> String
		System.out.println(result);
	}
}
