package com.java.pattern;

import java.util.Scanner;
/**
 * 3
AAA
BBB
CCC

 * @author Ayush
 *
 */
public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		
		while(row <= n) {
			
			int j=1;
			while(j<=n) {
				char col = (char) ('A'+row-1);
				System.out.print(col);
				j++;
			}
			row++;
			System.out.println();
		}

	}

}
