package arraysDemo;

public class Main {

	public static void main(String[] args) {

		// Diziler

		String ogrenci1 = "Bilal";
		String ogrenci2 = "Sevgi";
		String ogrenci3 = "Ruþen";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		// Öðrenci eklendikçe tek tek yazdýrmak gerekecek.
		
		System.out.println("-------------------------");
		
		// Þu þekilde yapabiliriz.
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Bilal";
		ogrenciler[1] = "Sevgi";
		ogrenciler[2] = "Ruþen";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		// Burada ise eleman sayýsýný 1 arttýrýp öðrenciyi eklemek yeterlidir.
		
		System.out.println("-------------------------");
		
		// for þöyle de yazýlabilir.
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
