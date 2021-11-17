package by.jepam.module01.cycle;

import java.util.Scanner;

//Даны два числа.Определить цифры входящие как в запись одного так в запись второго числа
public class Task08 {
	public static void main(String args[]) {
		int a = readFromConsole();
		int b = readFromConsole();

		int[] arr = new int[10];
		while (a != 0) {
			arr[a % 10]++;
			a /= 10;
		}
		while (b != 0) {
			if (arr[b % 10] != 0)
				System.out.print(b % 10 + " ");
			b /= 10;
		}
	}

	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите  число:");

		while (!scan.hasNextInt()) {

			scan.nextLine();

			System.out.println("Введите  число:");
		}
		int a = scan.nextInt();
		return a;
	}

}