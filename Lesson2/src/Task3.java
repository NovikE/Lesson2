import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9.��������� � ������ ���� char ���� ������� � ��� (������ ������� �� ������
		// ��������� ���������� �������� � ������� ������ �����
		// (��������� ������������ ����� toCharArray ������ String, ������ �����
		// ������������ ����� charAt() - �.�. ������ char ����� ��������� �����������!).

		String name = "Elena Novik";
		char[] x = new char[30];

		for (int i = 0; i < x.length; i++) {
			x[i] = '*';
		}

		for (int i = 0; i < name.length(); i++) {
			x[i] = name.charAt(i);
			System.out.println(x[i]);
		}

		// 10.����������� ���������� ��� ��� ������ 9 � ���������� (����� ������������
		// ����� Scanner). �������� � ������ �� ������� 9 ������ � ��������.

		Scanner in = new Scanner(System.in);
		System.out.println("������� ���: ");
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

		// 12. �������� ������ ������� �� ������� 9 � ������������ � ��������
		// ����������� �������� ���������

		System.out.println("������ ������ �������:" + n);
		char[] y = new char[n];
		for (int i = 0; i < (y.length); i++) {
			y[i] = x[i];
			System.out.print(y[i]);
		}
	}
}
