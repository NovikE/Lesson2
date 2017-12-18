import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9.Сохранить в массив типа char свою фамилию и имя (размер массива не должен
		// превышать количество символов в фамилии пробел имени
		// (запрещено использовать метод toCharArray класса String, однако можно
		// использовать метод charAt() - т.е. массив char нужно заполнить посимвольно!).

		String name = "Elena Novik";
		char[] x = new char[30];

		for (int i = 0; i < x.length; i++) {
			x[i] = '*';
		}

		for (int i = 0; i < name.length(); i++) {
			x[i] = name.charAt(i);
			System.out.println(x[i]);
		}

		// 10.Реализовать считывание ФИО для задачи 9 с клавиатуры (можно использовать
		// класс Scanner). Добавить в массив из задания 9 пробел и отчество.

		Scanner in = new Scanner(System.in);
		System.out.println("Введите ФИО: ");
		String fio = in.nextLine();

		for (int i = (fio.length() - 1); i >= 0; i--) {
			x[i] = fio.charAt(i);
			if (x[i] == ' ') {
				break;
			}
		}

		int n = 0;
		for (int i = 0; i < (x.length); i++) {
			System.out.println(x[i]);
			if (i != 0) {
				if ((x[i] == '*') & (x[i - 1] == '*')) {
					n = i - 1;
					break;
				}
			}
		}

		// 12. Привести размер массива из задания 9 в соответствие с реальным
		// количеством хранимых элементов

		System.out.println("Размер нового массива:" + n);
		char[] y = new char[n];
		for (int i = 0; i < (y.length); i++) {
			y[i] = x[i];
			System.out.print(y[i]);
		}
	}
}
