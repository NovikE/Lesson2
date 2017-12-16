import java.util.Collections;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[10];

		// 3. Заполнить массив размером из 100 элементов случайными целыми числами

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("Элементы массива:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.println(x[i]);
		}
		// 4. Вывести из массива (задание 1) все чётные элементы на экран
		System.out.println("Четные числа массива:");

		for (int i = 0; i < x.length; i++) {
			if ((x[i]) % 2 == 0) {
				System.out.println(x[i]);
			}
		}

		// 5. Посчитать разность всех нечётных элементов массива из задания 3

		System.out.println("Разность нечетных чисел:");

		int diff = 0;
		int j = 0;

		for (int i = 0; i < x.length; i++) {
			if ((x[i]) % 2 != 0) {
				if (j == 0) {
					j = i;
					diff = x[j];
				}
				if (j != i) {
					diff = diff - x[i];
				}
			}

		}
		System.out.println(diff);

		// 6.Подсчитать количество чётных и нечётных элементов в массиве из задания 3.
		// Количество чётных и количество нечётных вывести на экран
		int even = 0;
		int odd = 0;
		for (int i = 0; i < x.length; i++) {
			if ((x[i]) % 2 == 0) {
				even = even + 1;
			}
			if ((x[i]) % 2 != 0) {
				odd = odd + 1;
			}
		}
		System.out.println("Количество четных чисел: " + even);
		System.out.println("Количество нечетных чисел: " + odd);

		// 7. Найти и вывести на экран максимальный / минимальный элемент из задания 3
		int max = x[0];
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		}
		System.out.println("Максимальное значение массива:" + max);
		System.out.println("Минимальное значение массива:" + min);

		// 8.Найти максимальный и минимальный элемент среди чётных/нечётных элементов
		// массива задания 3

		int max_ev = x[0];
		int min_ev = x[0];

		int max_odd = x[0];
		int min_odd = x[0];

		for (int i = 0; i < x.length; i++) {
			if ((x[i] % 2 == 0) & (x[i] > max_ev)) {
				max_ev = x[i];
			}
			if ((x[i] % 2 == 0) & (x[i] < min_ev)) {
				min_ev = x[i];
			}
			if ((x[i] % 2 != 0) & (x[i] > max_odd)) {
				max_odd = x[i];
			}
			if ((x[i] % 2 != 0) & (x[i] < min_odd)) {
				min_odd = x[i];
			}
		}

		System.out.println("Максимальный элемент среди четных чисел: " + max_ev);
		System.out.println("Минимальный элемент среди четных чисел: " + min_ev);
		System.out.println("Максимальный элемент среди нечетных чисел: " + max_odd);
		System.out.println("Минимальный элемент среди нечетных чисел: " + min_odd);

		// 11. Удалить из массива (1е задание) все элементы, кратные 3

		int dl = x.length;

		// x[0] = 33;
		// x[1] = 99;

		for (int i = 0; i < dl; i++) {

			if ((x[i]) % 3 == 0) {
				for (int k = i; k < dl; k++) {
					if (k != (dl - 1)) {
						x[k] = x[k + 1];

					} else {
						x[k] = 0;
						dl = dl - 1;
					}
				}

				if (i != 0) {
					i = i - 1;

				}
			}
		}

		System.out.println("Элементы массива(без элементов кратных трем):");

		for (int l = 0; l < dl; l++) {
			System.out.println(x[l]);
		}
	}
}