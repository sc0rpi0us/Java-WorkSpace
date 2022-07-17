package com.java.codingExercise;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double number = sc.nextDouble();
		checkNumber(number);
	}

	public static void checkNumber(double number) {

		if (number > 0) {
			System.out.println("Positive Number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}
	}

}
