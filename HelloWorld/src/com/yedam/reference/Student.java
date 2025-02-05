package com.yedam.reference;

// gender => MEN, WOMEN 으로 한정
public class Student {
	// 필드(속성)
	String studentNm; // 학생이름
	int enScore; // 영어성적
	int mathScore; // 수학성적
	Gender gender; // 남, 여, 남자, man

	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성.
	Student() { // 기본 생성자: 매개값이 없는 생성자.
	}

	Student(String studentNm) {
		this.studentNm = studentNm;

	}

	Student(String studentNm, int enScore) {
		this.studentNm = studentNm;
		this.enScore = enScore;

	}

	public Student(String studentNm, int enScore, int mathScore) {
		this.studentNm = studentNm;
		this.enScore = enScore;
		this.mathScore = mathScore;
	}

	// 메소드 (기능)
	public void printInfo() { // 클래스내부의 정보 출력
		System.out.printf("이름은 %s, 영어점수는 %d, 수학점수는 %d \n", studentNm, enScore, mathScore);
	}

	double getAvg(Student std) {
		return (std.enScore + std.mathScore) / 2;

	}

	// get, set

	public void setStudentNm(String studentNm) {
		this.studentNm = studentNm;
	}

	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getStudentNm() {
		return studentNm;
	}

	public int getEnScore() {
		return enScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public Gender getGender() {
		return gender;
	}

}
