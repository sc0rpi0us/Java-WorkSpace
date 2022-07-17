package com.java.pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		char ch = 'A';
		while(row<=n) {
			int col =1;
			
			while(col<=row) {
				
				System.out.print(ch);
				col++;
				ch++;
			}
			row++;
			System.out.println();
		}
	}

}
