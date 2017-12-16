
import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
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

		int low = 0;
		int high = N;
		qSort(x, low, high);

		System.out.println("После сортировки по возрастанию:");
		for (int i = 0; i <= N; i++)
			System.out.print(x[i] + " ");

		System.out.println(" ");

		low = 0;
		high = N;
		qSort_decrease(x, low, high);

		System.out.println("После сортировки по убыванию:");
		for (int i = 0; i <= N; i++)
			System.out.print(x[i] + " ");

	}

	// описание функции qSort
	public static void qSort(int[] A, int low, int high) {
		int i = low;
		int j = high;
		int x = A[low + (high - low) / 2];
		do {
			while (A[i] < x)
				++i;
			while (A[j] > x)
				--j;
			if (i <= j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		} while (i <= j);
		// рекурсивные вызовы функции qSort
		if (low < j)
			qSort(A, low, j);
		if (i < high)
			qSort(A, i, high);
	}

	// описание функции qSort_decrease
	public static void qSort_decrease(int[] A, int low, int high) {
		int i = low;
		int j = high;
		int x = A[low + (high - low) / 2];
		do {
			while (A[i] > x)
				++i;
			while (A[j] < x)
				--j;
			if (i <= j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		} while (i <= j);
		// рекурсивные вызовы функции qSort
		if (low < j)
			qSort_decrease(A, low, j);
		if (i < high)
			qSort_decrease(A, i, high);
	}

}