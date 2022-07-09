package com.java.pattern;

import java.util.Scanner;
/**
 * 4
1
23
456
78910

 * @author Ayush
 *
 */
public class Pattern6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		int i = 1;
		while(i <= n) {
			int j =1;
			while(j <= i) {
				System.out.print(num);
				j++;
				num++;
			}
			System.out.println();
			i++;
			
		}
	}

}
