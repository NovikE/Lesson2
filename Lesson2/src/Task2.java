import java.util.Collections;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[10];

		// 3. ��������� ������ �������� �� 100 ��������� ���������� ������ �������

		Random ran = new Random();

		int r = ran.nextInt();
		System.out.println("�������� �������:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.println(x[i]);
		}
		// 4. ������� �� ������� (������� 1) ��� ������ �������� �� �����
		System.out.println("������ ����� �������:");

		for (int i = 0; i < x.length; i++) {
			if ((x[i]) % 2 == 0) {
				System.out.println(x[i]);
			}
		}

		// 5. ��������� �������� ���� �������� ��������� ������� �� ������� 3

		System.out.println("�������� �������� �����:");

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

		// 6.���������� ���������� ������ � �������� ��������� � ������� �� ������� 3.
		// ���������� ������ � ���������� �������� ������� �� �����
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
		System.out.println("���������� ������ �����: " + even);
		System.out.println("���������� �������� �����: " + odd);

		// 7. ����� � ������� �� ����� ������������ / ����������� ������� �� ������� 3
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
		System.out.println("������������ �������� �������:" + max);
		System.out.println("����������� �������� �������:" + min);

		// 8.����� ������������ � ����������� ������� ����� ������/�������� ���������
		// ������� ������� 3

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

		System.out.println("������������ ������� ����� ������ �����: " + max_ev);
		System.out.println("����������� ������� ����� ������ �����: " + min_ev);
		System.out.println("������������ ������� ����� �������� �����: " + max_odd);
		System.out.println("����������� ������� ����� �������� �����: " + min_odd);

		// 11. ������� �� ������� (1� �������) ��� ��������, ������� 3

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

		System.out.println("�������� �������(��� ��������� ������� ����):");

		for (int l = 0; l < dl; l++) {
			System.out.println(x[l]);
		}
	}
}