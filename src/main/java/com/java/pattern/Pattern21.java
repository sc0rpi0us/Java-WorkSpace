package com.java.pattern;

import java.util.Scanner;
/*
 * 4
   1
  22
 333
4444

 */
public class Pattern21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int space = n-row;
			while(space!=0) {
				System.out.print(" ");
				space--;
			}
			int num = row;
			while(num!=0) {
				System.out.print(row);
				num--;
			}
			row++;
			System.out.println();
		}
	}

}
