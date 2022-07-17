package com.java.pattern;

import java.util.Scanner;
/*
 * 4=input
   1
  121
 12321
1234321

 */
public class Pattern22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while(row<=n) {
			int space1 = n-row;
			while(space1!=0) {
				System.out.print(" ");
				space1--;
			}
			int num1 = 1;
			while(num1<=row) {
				System.out.print(num1);
				num1++;
			}
			int num2 =1;
			while(num2<=row-1) {
				System.out.print(row-num2);
				num2++;
			}
			/*
			 * int space2 = n-row; while(space2!=0) { System.out.print(" "); space2--; }
			 */
			System.out.println();
			row++;
		}
	}

}
