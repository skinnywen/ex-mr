package huyuwen;

import java.io.InputStream;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {
	public static void main(String[] args) throws Exception {
		try {
			Scanner sca = new Scanner(System.in);
			boolean flag=false;
			System.out.println("��������Ҫʲôͼ�Σ�");
			String aString = sca.nextLine();
			switch (aString) {
			case "��������":
				System.out.println("������߶ȣ�");
				int n = sca.nextInt();
				OutSan(n);
				break;

			default:
				System.out.println("����ľ�и�ͼ��");
				break;
			}
		} catch (Exception e) {
			throw new Exception("��֪��");
		}
	}

	// ��������
	public static void OutSan(int a) {
		for (int i = a; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	// ��������
	public static void bOutSan(int a) {
		{

			for (int i = a; i > 0; i--) { // ��������
				for (int j = 1; j < a - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k < i * 2; k++) {
					System.out.print("*");
				}
				
				int s=1;
				String test="������"+s+"��";
				System.out.println();

			}
		}
	}

	// ����������
	public static void zOutSan(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				if (k != 0 && k != i * 2 && i != 4) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}
	}

	// ��������
	public static void aOutSan(int a) {
		for (int i = 0; i < a; i++) { // ��������
			for (int j = 0; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	// ��������
	public static void hOutSan(int a) {
		for (int i = 1; i <= a / 2 + 1; i++) {
			for (int k = 1; k <= a / 2 + 1 - i; k++)
				System.out.print("  ");
			for (int j = 1; j <= i * 2 - 1; j++) {
				if (i == 1)
					System.out.print(" *");
				else {
					if (j == 1 || j == i * 2 - 1) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for (int i = a / 2; i >= 1; i--) {
			for (int k = 1; k <= a / 2 + 1 - i; k++)
				System.out.print("  ");
			for (int j = 1; j <= i * 2 - 1; j++) {
				if (i == 1 || i == a / 2 + 1)
					System.out.print(" *");
				else {
					if (j == 1 || j == i * 2 - 1) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void loutstand(int a) {
		for (int i = a; i >= 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > 2 * i; k--) {
				if (i == 1 && k == 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void fOutSan(int a) {
		for (int i = 6; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (i == 1 || i == 6)
					System.out.print("*");
				else {
					if (j == 0 || j == i - 1)
						System.out.print("*");
					else {
						System.out.print(" ");
					}

				}
			}
			System.out.println();
		}
	}

	// a�ǳ���
	public static void fZheng(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i == 0 || i == a - 1) {
					System.out.print(" *");
				} else {
					if (j == a || j == 1)
						System.out.print(" *");
					else
						System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	 // ����ƽ���ı���
	 public static void soutsan() {
	 for (int i = 0; i < 5; i++) {
	 for (int k = 0; k < 4 - i; k++) {
	 if(i==0||i==4)
	 if(k==0||k==4)
	 System.out.print("*");
	 else{
	 }
	 for (int j = 1; j <= 5; j++) {
	 if(j==1||j==5){
	 }
	 System.out.print("*");
	 }
	 System.out.println();
	 }
}
	 }
}
