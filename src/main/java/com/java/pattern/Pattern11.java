package com.java.pattern;

import java.util.Scanner;
/**
 *3
A B C 
B C D 
C D E 

 * @author Ayush
 *
 */
public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		//char ch = 'A';
		while(row<=n) {
			int col = 1;
			
			while(col<=n) {
				char ch = (char) ('A'+ row +col-2);
				System.out.print(ch+" ");
				col++;
				//ch++;
			}
			System.out.println();
			row++;
		}
	}

}
