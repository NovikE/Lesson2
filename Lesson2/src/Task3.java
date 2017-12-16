import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9.Сохранить в массив типа char свою фамилию и имя (размер массива не должен
		// превышать количество символов в фамилии пробел имени
		// (запрещено использовать метод toCharArray класса String, однако можно
		// использовать метод charAt() - т.е. массив char нужно заполнить посимвольно!
		// ).

		String name = "Elena Novik";
		char[] x = new char[30]; // new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			x[i] = name.charAt(i);
			System.out.println(x[i]);
		}

		// 10.Реализовать считывание ФИО для задачи 9 с клавиатуры (можно использовать
		// класс Scanner). Добавить в массив из задания 9 пробел и отчество.

		Scanner in = new Scanner(System.in);
		System.out.println("Введите ФИО: ");
		String fio = in.nextLine();
		System.out.println(fio);

		for (int i = (fio.length() - 1); i >= 0; i--) {
			x[i] = fio.charAt(i);
			if (x[i] == ' ') {
				break;
			}
		}

		for (int i = 0; i < (x.length); i++) {
			System.out.println(x[i]);
			if (i != 0) {
				if ((x[i] == ' ') & (x[i - 1] == ' ')) {
					break;
				}
			}
		}

		// 12. Привести размер массива из задания 9 в соответствие с реальным
		// количеством хранимых элементов

	}
}
