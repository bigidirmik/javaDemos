package switchDemo;

public class Main {

	public static void main(String[] args) {

		// if bloklar�na g�re switch bloklar� �ok daha az kullan�l�r! genellikle
		// suistimal edilir.

		// switch bloklar� ile dalland�rma yap�l�r!

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz!");
			break;
		case 'B': // hem b hem c i�in tek ��kt� alabiliriz.
		case 'C':
			System.out.println("�yi : Ge�tiniz!");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz!");
			break;
		case 'F':
			System.out.println("Maalesef : Kald�n�z!");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz!");
		}

	}

}
