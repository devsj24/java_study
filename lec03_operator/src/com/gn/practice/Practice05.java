package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 boolean값을 입력받으세요. 입력받은 값과 반대되는 boolean 값을 출력하는 프로그램을 만드세요. 
		 * boolean 값을 반대로 만들 때는 논리 부정 연산자를 사용하세요.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("true 또는 false 입력: ");
		boolean input = scan.nextBoolean();
		boolean output = !input;
		System.out.println(output);
	}
}
