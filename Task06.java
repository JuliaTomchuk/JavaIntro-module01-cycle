package by.jepam.module01.cycle;

//Вывести на экран соответствие между символьными и численными значениями в компьютере
public class Task06 {
	public static void main(String args[]) {

		char c = 0;
		for (int i = 0; i <= 255; i++) {
			System.out.print(c + " ");
			System.out.print(i);
			System.out.println("");
			c++;
		}
	}

}
