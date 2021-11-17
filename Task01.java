package by.jepam.module01.cycle;

/*Напишите программу, где пользователь вводит любое положительное число, 
 * а программа суммирует все числа от 1 до введённого пользователем числа*/
import java.util.Scanner;

public class Task01 {
	public static void main(String args[]) {
		int a = hasPositiveInt();
		int result = 0;

		for (int i = 1; i <= a; i++) {
			result += i;
		}

		System.out.println(result);

	}

	public static int hasPositiveInt() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите положительное число:");

		while (!scan.hasNextInt()) {
			scan.next();

			System.out.println("Введите положительное число:");
		}
		int a = scan.nextInt();
		if (a <= 0) {
			System.out.println("Перезапустите программу и введите положительное число");
		}
		return a;

	}
}


