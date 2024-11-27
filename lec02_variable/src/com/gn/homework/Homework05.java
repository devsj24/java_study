package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받으세요.
		 * 
		 * 그 다음, 총점과 평균을 출력하세요.
		 * 
		 * 이때, 총점과 평균은 정수형으로 처리하세요.
		 */
		double ko, eng, math, sum, avrg;
		
		System.out.print("국어 : ");
		ko = scan.nextDouble();
		System.out.print("영어 : ");
		eng = scan.nextDouble();
		System.out.print("수학 : ");
		math = scan.nextDouble();
		
		sum = ko + eng + math;
		avrg = sum / 3;
		
		System.out.println("총점 : " + (int)sum);
		System.out.println("평균 : " + (int)avrg);
	}
}
