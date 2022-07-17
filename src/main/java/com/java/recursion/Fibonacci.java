package com.java.recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fib(n));
	}

	static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fib(n-1)+ fib(n-2);
	}
}
