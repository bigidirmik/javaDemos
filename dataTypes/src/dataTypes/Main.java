package dataTypes;

public class Main {

	public static void main(String[] args) {
		
		// Deðiþken tanýmlarken tipini tanýmlarýz.
		
		// Java, C# gibi diller tip güvenlidir.
		
		
		
		int sayi = 12; // int : Primitive Types - Ýlkel tipler bir dilin en temel veri tipleri
		
		// sayi = "Ankara"; // Uyumsuz tipler hatasý verir.
		
		sayi = 13; // bu hata vermez.
		
		// sayi = 20000000000; (yirmi milyar) int'in alabileceði deðerlerin dýþýna çýktýðýmýz için hata verir.
		
		// ondalýklý sayý yazmaya çalýþýrsak da hata verir. Ondalýklý sayýlarýn default veri tipi double 'dýr.
		
		// En fazla kullanýlan sayýsal veri tipleri int ve double 'dýr.
		
		System.out.println(sayi);
		
		
		
		char karakter = 'A';
		
		// Karakter veri tipi olan char tek týrnak ile tutulur.
		
		System.out.println(karakter);
		
		
		
		String sehir = "Ankara";
		
		// bu String 'A','n','k','a','r','a' þeklinde char listesi olarak tutulur.
		
		System.out.println(sehir);
		
		
		
		boolean dogruMu = true; // ya da false; olarak 1 veya 0 olarak tutulur.
		
		System.out.println(dogruMu);
		
	}

}
