package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		/*아래 코드에 복합 대입 연산자를 빈칸에 채워주세요.
		이클립스 콘솔창에 출력되는 값은 우측 주석과 같아야 합니다.*/
		Scanner scan = new Scanner(System.in);
		int result = 100; 
		result += 3;
		System.out.println(result); //103
		result -= 10;
		System.out.println(result); //93
		result *= 2;
		System.out.println(result); //186
		result /= 3;
		System.out.println(result); //62
		result %= 3;
		System.out.println(result); //2
		
//		입력값을 받은 경우
		int input = scan.nextInt();
		input += 3;
		System.out.println(input);
		input -= 10;
		System.out.println(input);
		input *= 2;
		System.out.println(input);
		input /= 3;
		System.out.println(input);
		input %= 3;
		System.out.println(input);
		
	}
}
