package by.jepam.module01.cycle;

/* Составить программу нахождения произведения первых двухсот чисел*/

public class Task04 {
	public static void main(String[] args) {
		long result = 1L;
		for (int i = 1; i <= 200; i++) {
			result *= i;

		}
		System.out.println(result);
		System.out.println("результат выходит за границы long");
	}

}
