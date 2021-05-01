
package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		// Çok Boyutlu Diziler

		String[][] sehirler = new String[3][3]; // iki array parantezi koyduk. 3 bölge 3 þehirden oluþan bir liste
												// yaptýk.

		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";

		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";

		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		// bu tip çok boyutlu diziler þöyle döndürülür.

		for (int i = 0; i <= 2; i++) { // bölgeleri gezeriz

			System.out.println("--------------");

			for (int j = 0; j <= 2; j++) { // þehirleri gezeriz
				System.out.println(sehirler[i][j]);
			}

		}

	}

}
