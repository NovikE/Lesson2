import java.util.Random;

public class Task4 {

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

		// ����� �������� �� �����������
		int c;
		boolean f = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < ((x.length - 1) - i); j++) {
				if (x[j] > x[j + 1]) {
					c = x[j];
					x[j] = x[j + 1];
					x[j + 1] = c;
					f = true;
				} else {
					f = false;
				}

			}
			if (f == false) {
				break;
			}
		}
		System.out.println("��������������� �������� ������� �� �����������:");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		System.out.println("�������� �������:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.println(x[i]);
		}
		f = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < ((x.length - 1) - i); j++) {
				if (x[j] < x[j + 1]) {
					c = x[j];
					x[j] = x[j + 1];
					x[j + 1] = c;
					f = true;
				} else {
					f = false;
				}

			}
			if (f == false) {
				break;
			}
		}
		System.out.println("��������������� �������� ������� �� ��������:");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		// ����� �������
		System.out.println("�������� �������:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.println(x[i]);
		}

		c = 0;
		int k = 0;
		for (int j = 1; j < x.length; j++) {
			c = x[j];
			k = j - 1;
			while ((k >= 0) && (x[k] > c)) {
				x[k + 1] = x[k];
				k--;
			}
			x[k + 1] = c;
		}

		System.out.println("��������������� �������� ������� �� �����������(����� �������):");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		c = 0;
		k = 0;
		for (int j = 1; j < x.length; j++) {
			c = x[j];
			k = j - 1;
			while ((k >= 0) && (x[k] < c)) {
				x[k + 1] = x[k];
				k--;
			}
			x[k + 1] = c;
		}

		System.out.println("��������������� �������� ������� �� ��������(����� �������):");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		// ����� ������
		System.out.println("�������� �������:");
		for (int i = 0; i < x.length; i++) {
			r = ran.nextInt(160);
			x[i] = r;
			System.out.println(x[i]);
		}

		for (int min = 0; min < x.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < x.length; j++) {
				if (x[j] < x[least]) {
					least = j;
				}
			}

			int tmp = x[min];
			x[min] = x[least];
			x[least] = tmp;
		}

		System.out.println("��������������� �������� ������� �� �����������(����� ������):");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		for (int min = 0; min < x.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < x.length; j++) {
				if (x[j] > x[least]) {
					least = j;
				}
			}
			int tmp = x[min];
			x[min] = x[least];
			x[least] = tmp;
		}

		System.out.println("��������������� �������� ������� �� ��������(����� ������):");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
