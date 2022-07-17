package com.java.pattern;

import java.util.Scanner;
/**
 * 3
ABC
BCD
CDE

 * @author Ayush
 *
 */
public class Pattern16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row <= n) {
			int col = 1;
			while(col <= n) {
				System.out.print((char)('A'+col+row-2));
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
