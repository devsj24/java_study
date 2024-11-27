package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 인테리어의 신 철수는 안방을 꾸미는 일을 의뢰 받았습니다.
		 * 
		 * 방의 가로, 세로 값을 키보드로 입력하면
		 * 
		 * 방의 면적과 둘레를 계산하여 출력해주는 시스템을 만들어주세요.
		 * 
		 * - 면적 : 가로 * 세로 
		 * - 둘레 : (가로+세로)*2
		 */
		double width, length, area, round;
		System.out.print("가로: ");
		width = scan.nextDouble();
		System.out.print("세로: ");
		length = scan.nextDouble();
		
		area = width * length;
		round = (width+length) * 2;
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
	}
	
}
