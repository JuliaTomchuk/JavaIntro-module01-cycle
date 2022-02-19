package by.jepam.module01.cycle;

/*Найти сумму квадратов первых ста чисел*/

public class Task03 {
	public static void main(String[] args) {
		long result = 0L;
		for (int i = 1; i <= 100; i++) {
			result = result + (i * i);

		}
		System.out.println(result);
	}

}

