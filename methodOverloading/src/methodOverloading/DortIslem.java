package methodOverloading;

public class DortIslem {
	
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// Bir tane daha ayn� isimde metot olu�turuyoruz.
	
	// farkl� parametre imzas�na sahip olaca�� i�in hi� bir ar�za ��karmaz.
	
	public int Topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

}
