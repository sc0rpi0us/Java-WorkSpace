package com.java.pattern;

import java.util.Scanner;
/**
 * 4
1
21
321
4321

 * @author Ayush
 *
 */
public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int row = 1;
		
		while(row<=n) {
			int col =1;
			int num = row;
			while(col<=row){
				System.out.print(row-col+1);
				num--;
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
