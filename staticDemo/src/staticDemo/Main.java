package staticDemo;

public class Main {

	// static genelde utility'ler için kullanýrýz
	
	// static verilen metotlar uygulama baþlayýnca 1 kere newlenir ve hep heap'te kalýr, garbage collector onu çöpe atmaz.
	// bu yüzden yaygýn kullanýlmaz. kullanacaðýmýz yeri iyi bilmeliyiz (utility'ler gibi)
	
	// static yapýnca ilk çaðýran kullanýcý nesneyi oluþturur, diðer çaðýranlar da ayný nesneyi kullanýr
	// örneðin bir kullanýcý product nesnesine int birsey = 5; tanýmladýðýnda diðer kullanýcýlarýn da 5 olur.

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();

		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;

		manager.add(product);

	}
	
	//------------------------------------------

}
