package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 키보드로 문자 하나를 입력 받습니다.
		 * 
		 * 그리고, 해당 문자의 유니코드를 출력합니다.
		 */
		String input;
		System.out.print("문자를 입력하세요 : ");
		input = scan.nextLine();
		char alph = input.charAt(0);
		System.out.println(alph + "의 유니코드 : " + ((int)alph));
		
		
	}
}
