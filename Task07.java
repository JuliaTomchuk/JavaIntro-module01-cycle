package by.jepam.module01.cycle;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m  до n вывести все делители.Кроме единицы и самого числа. m и n вводиться с клавиатуры
public class Task07 {

	public static void main(String args[]) {

		int m = readFromConsoleM();
		int n = readFromConsoleN();
		isLess(m, n);

		while (m <= n) {

			System.out.print(m + ":");
			for (int i = 2; i < m; i++) {
				if (m % i == 0) {
					System.out.print(i + " ");
				}
			}
			m++;
			System.out.println();
		}

	}

	public static int readFromConsoleM() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите  число m:");

		while (!scan.hasNextInt()) {
			scan.next();

			System.out.println("Введите число m :");
		}
		int a = scan.nextInt();
		return a;
	}

	public static int readFromConsoleN() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите  число n, n должно быть больше m");

		while (!scan.hasNextInt()) {
			scan.next();

			System.out.println("Введите  число n, n должно быть больше m");
		}
		int a = scan.nextInt();
		return a;
	}

	public static void isLess(int a, int b) {
		if (b > a) {
			System.out.println(" Выбран промежуток от " + a + " до " + b);
		} else {
			System.out.println(" m должно быть меньше n");
		}
	}
}
