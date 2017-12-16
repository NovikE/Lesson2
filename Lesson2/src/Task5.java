import java.util.Random;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 14. Найти в массиве и вывести на экран все элементы в заданном диапазоне
		// (например от 20 до 23)

		int N = 10;
		int[] x;
		x = new int[N + 1];

		// Заполнить массив случайными целыми числами

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Элементы массива:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.print(x[i] + " ");
		}
		System.out.println(" ");

		Scanner in = new Scanner(System.in);

		System.out.println("Введите нижнюю границу: ");
		int low = in.nextInt();

		System.out.println("Введите верхнюю границу: ");
		int max = in.nextInt();

		for (int i = 0; i < x.length; i++) {
			if ((x[i] >= low) & (x[i] <= max)) {
				System.out.print(x[i] + " ");
			}
		}

	}

}
