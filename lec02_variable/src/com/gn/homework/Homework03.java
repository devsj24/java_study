package com.gn.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Scanner로 문자열을 입력 받으세요.
		 * 
		 * 그 다음, 해당 문자열의 첫번째, 두번째, 세번째 문자를 출력해주는 시스템을 만들어주세요.
		 */
		System.out.print("문자열을 입력하세요 : ");
		String str = scan.nextLine();
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
