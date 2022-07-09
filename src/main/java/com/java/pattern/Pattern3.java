package com.java.pattern;

import java.util.Scanner;
/**
 * 5
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
 * @author Ayush
 *
 */

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int i = 1;
		int num = 1;
		while(i <= n) {
			
			int j = 1;
			while(j<=n) {
				System.out.print(num+" ");
				j++;
				num++;
			}
			
			System.out.println();
			i++;
		}
	}

}
