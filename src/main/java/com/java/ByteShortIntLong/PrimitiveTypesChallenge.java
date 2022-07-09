package com.java.ByteShortIntLong;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {

		byte myByte = (byte) 10;
		short myShort = (short) 20;
		int myInt = 50;
		long myLong = 50000l + 10l * (myByte + myShort + myInt);
		System.out.println(myLong);

		// floating challenge

		double pound = 10;
		double result = pound * 0.45;
		System.out.println("Poouns " + pound + " in KiloGrams: = " + result);
	}

}
