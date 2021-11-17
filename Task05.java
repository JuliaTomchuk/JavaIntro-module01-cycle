package by.jepam.module01.cycle;

/*Даны числовой ряд и некоторое число е.Найти сумму тех членов ряда, модуль которых больше или равен заданному e*/

public class Task05 {
	public static void main(String[] args) {

		double e = 1;
		double sum = 0;
		int n = 100;
		for (int i = 0; i < n; i++) {

			double a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));

			if (Math.abs(a) >= e) {
				sum += a;

			}
		}
		System.out.println(sum);
	}
}
