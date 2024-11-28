package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		/* 
		 * 이니셜 "Cheolsu" 맞으신가요?
		 * 아니요 "Chulsu" 입니다.
		 * 혹시 "30"대 이신가요?
		 * "23"살입니다.
		 * 
		 * 철수가 여권을 만들려고 합니다.
		 * 영어 이름: Chulsu
		 * 20대 이신가요?
		 * 
		 * 1. 철수의 영어 이름과 나이 정보를 입력받습니다.
		 * 2. 3가지 논리형 데이터 출력
		 * (1) 영어 이름이 일치하나요? true/false
		 * (2) 20대 인가요? 
		 * (3) 영어 이름이 일치하면서 동시에 20대 인가요? 
		 */
		Scanner scan = new Scanner(System.in);
		String targetName = new String("Chulsu");
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		boolean isMatchName = name.equals(targetName);
		boolean isMatchAge = (age >= 20) && (age <= 29);
		
		System.out.println("영어 이름이 일치하나요? " + isMatchName);
		System.out.println("20대 인가요? " + isMatchAge);
		System.out.println("영어 이름이 일치하면서 20대 인가요? " + (isMatchName && isMatchAge));
	}
}
