package com.gn.practice;

public class Introduce {
	public static void main(String[] args) {
//		안녕하세요~
//		저는 "김철수"입니다.
//		나이는 20살이고, mbti는 istp입니다.
		// 1. print만 사용
		System.out.print("안녕하세요~\n저는 \"김철수\"입니다.\n나이는 20살이고, mbti는 istp입니다.\n");
		
//		2. println
		System.out.println("안녕하세요~");
		System.out.println("저는 \"김철수\"입니다.");
		System.out.println("나이는 20살이고, mbti는 istp입니다.");
		
//		3. printf
		System.out.printf("안녕하세요~\n저는 \"%s\"입니다.\n나이는 %d살이고, mbti는 %s입니다.\n", "김철수", 20, "istp");
	}

}
