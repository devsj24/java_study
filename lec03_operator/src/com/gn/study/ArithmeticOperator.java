package com.gn.study;

public class ArithmeticOperator {
	public static void main(String[] args) {
//		1. 산술 연산자
		int su1 = 10;
		int su2 = 3;
		
		System.out.println(su1 + su2); // 13
		System.out.println(su1 - su2); // 7
		System.out.println(su1 * su2); // 30
		System.out.println(su1 / su2); // 3
		System.out.println(su1 % su2); // 1
		
//		2. 복합 대입 연산자
		int a = 5;
//		a = a + 3; 
		a += 3;
		System.out.println(a); // 8
		
		int b = 10;
		b -= 4; // 6 
		b *= 4;
		System.out.println(b); // 24
		
		int c = 10;
		c /= 3; // 3
		System.out.println(c);
		
		int d = 10;
		d %= 3; // 1
		System.out.println(d);
		
//		3. 증감 연산자
//		(1) 전위 증감 연산자
		int pre = 5;
		System.out.println(pre); // 5
		System.out.println(++pre); // 6
		
//		(2) 후위 증감 연산자
		int post = 5;
		System.out.println(post); // 5
		System.out.println(post++); // 5
		System.out.println(post); // 6
		
		System.out.println("");
	}

}
