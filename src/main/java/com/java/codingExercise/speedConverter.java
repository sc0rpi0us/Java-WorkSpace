package com.java.codingExercise;

public class speedConverter {

	public static void main(String[] args) {

		System.out.println(toMilesPerHour(75.114));
	}
	
	public static long toMilesPerHour(double kmps) {
		
		long result;
		if(kmps<0) {
			result = -1;
		}else {
			result = Math.round(kmps / 1.60934);
			
		}
		return result;
	}

}
