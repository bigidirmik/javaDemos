package arraysDemo;

public class Main {

	public static void main(String[] args) {

		// Diziler

		String ogrenci1 = "Bilal";
		String ogrenci2 = "Sevgi";
		String ogrenci3 = "Ru�en";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		// ��renci eklendik�e tek tek yazd�rmak gerekecek.
		
		System.out.println("-------------------------");
		
		// �u �ekilde yapabiliriz.
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Bilal";
		ogrenciler[1] = "Sevgi";
		ogrenciler[2] = "Ru�en";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		// Burada ise eleman say�s�n� 1 artt�r�p ��renciyi eklemek yeterlidir.
		
		System.out.println("-------------------------");
		
		// for ��yle de yaz�labilir.
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
