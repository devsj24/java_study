package com.gn.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 사용자로부터 한 자리 숫자를 입력 받아서
		 * 
		 * 해당 숫자의 제곱을 출력하는 프로그램을 작성하세요.
		 * 
		 * 단, 문자열 형태로 값을 입력 받은 다음,
		 * 
		 * char 타입의 변수에 저장하세요.
		 */
		System.out.print("한 자리 숫자를 입력하세요: ");
		char input = scan.nextLine().charAt(0);
		int output = input - '0';
		System.out.println("입력한 숫자의 제곱은 " + (output * output) + "입니다.");
		
	}
}
