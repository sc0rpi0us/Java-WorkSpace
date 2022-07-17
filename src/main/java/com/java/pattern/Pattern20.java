package com.java.pattern;

import java.util.Scanner;
/**
 * 4
1111
 222
  33
   4
 * @author Ayush
 *
 */
public class Pattern20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int space = row-1;
			while(space!=0) {
				System.out.print(" ");
				space--;
			}
			int star = n -row + 1;
			while(star!=0) {
				System.out.print(row);
				star--;
			}
			System.out.println();
			row++;
		}
	}

}
