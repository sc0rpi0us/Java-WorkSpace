package com.java.pattern;

import java.util.Scanner;
/**
 * 5
    *
   **
  ***
 ****
*****
 * @author Ayush
 *
 */
public class Pattern17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int col1 =1;
			int space = n-row;
			while(col1<=space) {
				System.out.print(" ");
				col1++;
			}
			int col2=1;
			int star = row;
			while(col2<=star) {
				System.out.print("*");
				col2++;
			}
			System.out.println();
			row++;
			
		}
	}

}
