package com.java.pattern;

import java.util.Scanner;
/**
 * 3
ABC
ABC
ABC

 * @author Ayush
 *
 */
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		
		while (row<=n) {
			int col =1;
			while(col<=n) {
				char ch = (char) ('A'+col-1);
				System.out.print(ch);
				col++;
			}
			row++;
			System.out.println();
		}

	}

}
