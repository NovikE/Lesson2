
public class Task1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("for github");
		// TODO Auto-generated method stub

		// 1a. ��������� ������ � ������ ������� �
		// � ������� ���������� �� �����

		// 1b. ��������� ������ � ������ ������� �
		// � ������� ���������� �� ����� � �������� �������

		int[] x = new int[10];
		char y[] = new char[10];// a���� �������

		for (int i = 0; i < x.length; i++) {
			x[i] = i + 7;
			System.out.println(x[i]);
		}
		System.out.println("� �������� �������:");
		for (int i = x.length - 1; i >= 0; i--) {
			x[i] = i + 5;
			System.out.println(x[i]);
		}
	}

}
