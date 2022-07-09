package com.java.pattern;

import java.util.Scanner;
/**
 * 5

1
22
333
4444
55555
 * @author Ayush
 *
 */
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int i=0;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
