package com.jse.app;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int a=scanner.nextInt();// 첫번째 수 입력
		System.out.println("두번째 수 입력");
		int b=scanner.nextInt();// 두번째 수 입력
		int c=a+b;
		System.out.println("두 수의 합은? "+c);// 두 수의 합은?
	}
}
