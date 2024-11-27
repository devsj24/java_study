package com.gn.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		/*
		 * 철수는 오늘 학교에서 산술 연산자 +, -, *, /, %에 대해서 배웠습니다. 두 개의 정수를 키보드로 입력 받고,
		 * 다섯가지 산술 연산을 하여 결과를 출력해주는 계산기를 만들어주세요.
		 */
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		int ans1, ans2, ans3, ans4, ans5;
		
		System.out.print("첫 번째 숫자: ");
		num1 = scan.nextInt();
		System.out.print("두 번째 숫자: ");
		num2 = scan.nextInt();
		
		ans1 = num1 + num2;
		ans2 = num1 - num2;
		ans3 = num1 * num2;
		ans4 = num1 / num2;
		ans5 = num1 % num2;
				
		System.out.println("덧셈: " + ans1);
		System.out.println("뺄셈: " + ans2);
		System.out.println("곱셈: " + ans3);
		System.out.println("몫: " + ans4);
		System.out.println("나머지: " + ans5);
		
		
	}
}
