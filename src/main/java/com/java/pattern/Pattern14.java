package com.java.pattern;

import java.util.Scanner;
/**
 * 4
A
BC
CDE
DEFG

 * @author Ayush
 *
 */
public class Pattern14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int col =1;
			while(col<=row) {
				System.out.print((char) ('A'+row+col-2));
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
