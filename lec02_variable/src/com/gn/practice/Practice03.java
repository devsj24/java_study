package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
		/*
		 * 자바의 이해를 수강하고 있는 “제갈민” 학생의 풀네임에서 이름만 추출하는 프로그램을 구성하세요. 
		 * 제갈민 학생은 성이 “제갈”이고, 이름이 “민”입니다.
		 */
		String studentName = "제갈민";
		char lastName = studentName.charAt(2);
		System.out.println(lastName + "이에요!!");
	}
}
