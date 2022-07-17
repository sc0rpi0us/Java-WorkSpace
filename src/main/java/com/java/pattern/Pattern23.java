package com.java.pattern;

import java.util.Scanner;
/**
 * 5
1234554321
1234**4321
123****321
12******21
1********1
 * @author Ayush
 *
 */
public class Pattern23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		while (row <= n) {
			int num1 = 1;
			while (num1 <= n - row + 1) {
				System.out.print(num1);
				num1++;
			}

			int star = 1;
			while (star <= row - 1) {
				System.out.print("**");
				star++;
			}

			int num2 = n-row+1;
			while (num2>=1) {
				System.out.print(num2);
				num2--;
			}

			System.out.println();
			row++;
		}
	}

}
