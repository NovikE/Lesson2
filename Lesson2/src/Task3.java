import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9.��������� � ������ ���� char ���� ������� � ��� (������ ������� �� ������
		// ��������� ���������� �������� � ������� ������ �����
		// (��������� ������������ ����� toCharArray ������ String, ������ �����
		// ������������ ����� charAt() - �.�. ������ char ����� ��������� �����������!
		// ).

		String name = "Elena Novik";
		char[] x = new char[30]; // new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			x[i] = name.charAt(i);
			System.out.println(x[i]);
		}

		// 10.����������� ���������� ��� ��� ������ 9 � ���������� (����� ������������
		// ����� Scanner). �������� � ������ �� ������� 9 ������ � ��������.

		Scanner in = new Scanner(System.in);
		System.out.println("������� ���: ");
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

		// 12. �������� ������ ������� �� ������� 9 � ������������ � ��������
		// ����������� �������� ���������

	}
}
