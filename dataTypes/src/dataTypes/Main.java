package dataTypes;

public class Main {

	public static void main(String[] args) {
		
		// De�i�ken tan�mlarken tipini tan�mlar�z.
		
		// Java, C# gibi diller tip g�venlidir.
		
		
		
		int sayi = 12; // int : Primitive Types - �lkel tipler bir dilin en temel veri tipleri
		
		// sayi = "Ankara"; // Uyumsuz tipler hatas� verir.
		
		sayi = 13; // bu hata vermez.
		
		// sayi = 20000000000; (yirmi milyar) int'in alabilece�i de�erlerin d���na ��kt���m�z i�in hata verir.
		
		// ondal�kl� say� yazmaya �al���rsak da hata verir. Ondal�kl� say�lar�n default veri tipi double 'd�r.
		
		// En fazla kullan�lan say�sal veri tipleri int ve double 'd�r.
		
		System.out.println(sayi);
		
		
		
		char karakter = 'A';
		
		// Karakter veri tipi olan char tek t�rnak ile tutulur.
		
		System.out.println(karakter);
		
		
		
		String sehir = "Ankara";
		
		// bu String 'A','n','k','a','r','a' �eklinde char listesi olarak tutulur.
		
		System.out.println(sehir);
		
		
		
		boolean dogruMu = true; // ya da false; olarak 1 veya 0 olarak tutulur.
		
		System.out.println(dogruMu);
		
	}

}
