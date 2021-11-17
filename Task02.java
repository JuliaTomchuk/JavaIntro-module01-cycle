package by.jepam.module01.cycle;

/*Вычислите значение функции на отрезке [a,b]  с шагом h*/
public class Task02 {
	public static void main(String args[]) {
		double a = -5;
		double b = 20;
		double h = 1;
		double y;
		double x = a;
		while (x <= 2) {
			y = -x;
			x += h;
			System.out.println("если x <=2  на отрезке [-5,20], y = " + y);
		}
		while (x > 2 && x <= b) {
			y = x;
			x += h;
			System.out.println("если  x >2  на отрезке [-5,20], y = " + y);
		}
	}
}
