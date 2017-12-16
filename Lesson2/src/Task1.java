
public class Task1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("for github");
		// TODO Auto-generated method stub

		// 1a. Заполнить массив х целыми числами и
		// и вывести содержимое на экран

		// 1b. Заполнить массив х целыми числами и
		// и вывести содержимое на экран в обратном порядке

		int[] x = new int[10];
		char y[] = new char[10];// aдрес массива

		for (int i = 0; i < x.length; i++) {
			x[i] = i + 7;
			System.out.println(x[i]);
		}
		System.out.println("В обратном порядке:");
		for (int i = x.length - 1; i >= 0; i--) {
			x[i] = i + 5;
			System.out.println(x[i]);
		}
	}

}
