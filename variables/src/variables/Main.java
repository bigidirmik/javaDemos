package variables;

public class Main {

	public static void main(String[] args) {
		
		// De�i�kenler
		
		// Java case Sensitive - b�y�k k���k harf duyarl�d�r!
		
		System.out.println("��renci say�s� : 10");
		System.out.println("��renci say�s� : 10");
		System.out.println("��renci say�m : 10");
		System.out.println("��renci say�m : 9"); // Hepsini elle de�i�tirmek zorunda kal�r�z.
		
		// Bunun yerine
		
		int ogrenciSayisi = 10; // camelCase de�i�ken ismi yaz�l�r.
		String mesaj = "��renci say�s� : "; // String Java'da b�y�k S ile yaz�l�r. (C#'da class olan� b�y�k yaz�l�r)
		
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi); // art�k sadece de�i�kenlere yeni de�er atamak yeterlidir.
		
		// Reusability - �stteki �rnek tekrar kullan�labilirli�e �rnektir. (Bir kere yaz, her yerde kullan!)

		// Code Refactoring - Kodlar� temizleme, d�zene sokma.
	}

}
