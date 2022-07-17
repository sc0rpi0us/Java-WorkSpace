package com.java.pattern;

import java.util.Scanner;
/**
 * 3
A
BB
CCC 
 * @author Ayush
 *
 */
public class Pattern12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		
		while(row<=n) {
			int col = 1;
			while(col<=row) {
			//	char ch =(char) ('A'+ row - 1);
				System.out.print((char) ('A'+ row - 1));
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
