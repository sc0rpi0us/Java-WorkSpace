package com.java.pattern;

import java.util.Scanner;

public class Pattern_star_sqr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i<=n) { //row
			
			int j = 1;
			while(j<=n) { //Column 
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
