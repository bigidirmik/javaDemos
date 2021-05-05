package staticDemo;

public class Main {

	// static genelde utility'ler i�in kullan�r�z
	
	// static verilen metotlar uygulama ba�lay�nca 1 kere newlenir ve hep heap'te kal�r, garbage collector onu ��pe atmaz.
	// bu y�zden yayg�n kullan�lmaz. kullanaca��m�z yeri iyi bilmeliyiz (utility'ler gibi)
	
	// static yap�nca ilk �a��ran kullan�c� nesneyi olu�turur, di�er �a��ranlar da ayn� nesneyi kullan�r
	// �rne�in bir kullan�c� product nesnesine int birsey = 5; tan�mlad���nda di�er kullan�c�lar�n da 5 olur.

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();

		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;

		manager.add(product);

	}
	
	//------------------------------------------

}
