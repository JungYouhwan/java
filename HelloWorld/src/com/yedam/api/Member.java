package com.yedam.api;

public class Member {
	
	String memberId;
	int memPoint;
//	Member String id
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}

	Member() {
	}
	
	public Member(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return super.hashCode();// Object의 hashvode는 주소값.
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// MemberId가 같을경우 .. 논리적으로 같은객체.
		if (obj instanceof Member) {
			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId && this.memPoint == m2.memPoint) { 				
				return true;
			}
		}
		return false;
	}
}
