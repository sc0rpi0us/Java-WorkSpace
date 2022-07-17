package com.java.pattern;

import java.util.Scanner;
/**
 * 4
****
***
**
*
 * @author Ayush
 *
 */
public class Pattern18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int col =1;
			while(col<=n-row+1) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
