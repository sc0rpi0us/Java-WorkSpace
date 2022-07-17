package com.java.recursion;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		getCounting(n);
	}
	 
	static void getCounting (int n) {
		if(n<=0) {
			return;
		}
		getCounting(n-1);
		
		System.out.println(n);
	}

}
