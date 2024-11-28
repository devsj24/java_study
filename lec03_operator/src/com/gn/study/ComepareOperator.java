package com.gn.study;

public class ComepareOperator {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
// 		1. 등호
		System.out.println(num1==num2); // false
		boolean same = num1==num2;
		
// 		2. (부)등호
		boolean diff = num1!=num2; // true
		
// 		3. 크다, 작다
		boolean big = num1 > num2; // false
 		boolean small = num1<num2; // true
		
//		4. 크거나 같다, 작거나 같다.
		boolean bigSame = num1>=num2; 
		
// 		5. char와 비교 연산자
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 < c2);
		System.out.println((int)c1+" < "+(int)c2);
		
//		6. equals
		String str1 = "apples";
		String str3 = new String ("apples");
		boolean boo1 = str1.equals(str3); // true
		boo1 = str3.equals(str1); // true
		
//		7. 논리연산자
		int a = 6;
		int b = 5;
		int c = 7;

//		(1) AND : 6은 5보다 크고, 7보다 큰가요?
		boolean andBool = a > b && a > c; // false
		System.out.println(andBool);
		
//		(2) OR : 6은 5보다 크거나, 7보다 큰가요?
		boolean orBool = a > b || a < c; // true
		System.out.println(orBool);
		
//		8.논리부정 연산자
		boolean isTrue = true;
		boolean isFalse = !isTrue; // false
		System.out.println(isFalse);
		
//		논리연산자(&&, ||)와 함께 사용
		boolean test1 = 3 < 5; // true
		boolean test2 = 6 < 5; // false
		
		System.out.println(test1 && test2); // false
		System.out.println(!(test1 && test2)); // true
		System.out.println(!test1 && test2); // false
		System.out.println(test1 && !test2); // true
		
//		9. 삼항 연산자
		int x = 5;
		int y = 10;
		
		boolean result = x > y;
		
//		x 랑 y 중에서 더 큰 값을 출력
//		조건식 ? true일 때 결과 : false일 때 결과
		int max = x > y ? x : y;
		System.out.println(x > y ? x : y);
		
//		3개의 정수 중에서 가장 큰 수 찾기
		int z = 3;
		int bigThree = x > y ? (x > z ? x : z) : (y > z ? y : z); // y
		System.out.println(bigThree);
		
	}
}
