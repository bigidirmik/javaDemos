
package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		// �ok Boyutlu Diziler

		String[][] sehirler = new String[3][3]; // iki array parantezi koyduk. 3 b�lge 3 �ehirden olu�an bir liste
												// yapt�k.

		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";

		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";

		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";

		// bu tip �ok boyutlu diziler ��yle d�nd�r�l�r.

		for (int i = 0; i <= 2; i++) { // b�lgeleri gezeriz

			System.out.println("--------------");

			for (int j = 0; j <= 2; j++) { // �ehirleri gezeriz
				System.out.println(sehirler[i][j]);
			}

		}

	}

}
