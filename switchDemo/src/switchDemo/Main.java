package switchDemo;

public class Main {

	public static void main(String[] args) {

		// if bloklarýna göre switch bloklarý çok daha az kullanýlýr! genellikle
		// suistimal edilir.

		// switch bloklarý ile dallandýrma yapýlýr!

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz!");
			break;
		case 'B': // hem b hem c için tek çýktý alabiliriz.
		case 'C':
			System.out.println("Ýyi : Geçtiniz!");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz!");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldýnýz!");
			break;
		default:
			System.out.println("Geçersiz not girdiniz!");
		}

	}

}
