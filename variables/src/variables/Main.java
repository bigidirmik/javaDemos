package variables;

public class Main {

	public static void main(String[] args) {
		
		// Deðiþkenler
		
		// Java case Sensitive - büyük küçük harf duyarlýdýr!
		
		System.out.println("öðrenci sayýsý : 10");
		System.out.println("öðrenci sayýsý : 10");
		System.out.println("öðrenci sayým : 10");
		System.out.println("öðrenci sayým : 9"); // Hepsini elle deðiþtirmek zorunda kalýrýz.
		
		// Bunun yerine
		
		int ogrenciSayisi = 10; // camelCase deðiþken ismi yazýlýr.
		String mesaj = "Öðrenci sayýsý : "; // String Java'da büyük S ile yazýlýr. (C#'da class olaný büyük yazýlýr)
		
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi); // artýk sadece deðiþkenlere yeni deðer atamak yeterlidir.
		
		// Reusability - üstteki örnek tekrar kullanýlabilirliðe örnektir. (Bir kere yaz, her yerde kullan!)

		// Code Refactoring - Kodlarý temizleme, düzene sokma.
	}

}
