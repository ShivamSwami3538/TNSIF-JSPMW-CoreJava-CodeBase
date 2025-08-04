package com.tnsif.daytwo;

public class PrimitiveDatatypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 byte = 8 bit's
		
		
//		1) dataype - byte    memory - 1 byte
		
//		2 ^ 8 = 256 / 2 = 128        // 126
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("Max range of Byte is: " + byteMax);
		System.out.println("Min range of Byte is: " + byteMin);
		
		
//		2) dataype - short    memory - 2 byte
		
//		2 ^ 16 = 65586 / 2 = 32767
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Max range of short is: " + shortMax);
		System.out.println("Min range of short is: " + shortMin);
		
		
//		3) dataype - integer    memory - 4 byte
		
//		2 ^ 32 = 4294967296 / 2 = 2147483648
		int intMax = 2147483647;
		int intMin = -2147483648;
		System.out.println("Max range of int is: " + intMax);
		System.out.println("Min range of int is: " + intMin);
		
		
//		4) dataype - long    memory - 8 byte
		
//		2 ^ 64 = 4294967296 / 2 = 2147483648
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		System.out.println("Max range of long is: " + longMax);
		System.out.println("Min range of long is: " + longMin);

	}

}
