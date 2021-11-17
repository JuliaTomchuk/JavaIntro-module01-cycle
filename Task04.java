package by.jepam.module01.cycle;

import java.math.BigInteger;
/* Составить программу нахождения произведения первых двухсот чисел*/

public class Task04 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf((long) i * i));

		}
		System.out.println(result);
	}

}
