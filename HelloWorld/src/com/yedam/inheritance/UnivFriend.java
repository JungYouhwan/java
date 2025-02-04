package com.yedam.inheritance;

public class UnivFriend extends Friend {

	private String UnivName;
	private String UnivMajor;

	// 생성자.
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super(friendName, phoneNumber); // super 부모.
		this.UnivName = univName;
		this.UnivMajor = univMajor;
	}

	// showInfo(재정의) -> 학교정보추가.
	// Override 컴파일 
	@Override
	public String showInfo() {
		return super.showInfo() + " |학교:" + UnivName + " |전공:" + UnivMajor;
	}

	// geter, seter.
	public String getUnivName() {
		return UnivName;
	}

	public void setUnivName(String univName) {
		UnivName = univName;
	}

	public String getUnivMajor() {
		return UnivMajor;
	}

	public void setUnivMajor(String univMajor) {
		UnivMajor = univMajor;
	}

}
