package com.java.pattern;

import java.util.Scanner;
/**
 * 4
D
CD
BCD
ABCD``
 * @author Ayush
 *
 */
public class Pattern15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int col =1;
			while(col<=row) {
				System.out.print((char)('A'+n+col-row-1));
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
