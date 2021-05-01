package methodOverloading;

public class DortIslem {
	
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// Bir tane daha ayný isimde metot oluþturuyoruz.
	
	// farklý parametre imzasýna sahip olacaðý için hiç bir arýza çýkarmaz.
	
	public int Topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

}
