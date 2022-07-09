package com.java.pattern;

import java.util.Scanner;
/**
 * 4
1
23
345
4567
 * @author Ayush
 *
 */
public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			//int num = i;
			while(j<=i) {
				System.out.print(i+j-1);
				//num++;
				j++;
				
			}
			System.out.println();
			i++;
			
		}
		
	}

}
