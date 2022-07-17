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
public class Pattern19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while (row <= n) {
			int space = row - 1;
			while (space != 0) {
				System.out.print(" ");
				space--;
			}
			int star = n - row + 1;
			while (star != 0) {
				System.out.print("*");
				star--;
			}
			System.out.println();
			row++;
		}
	}

}
