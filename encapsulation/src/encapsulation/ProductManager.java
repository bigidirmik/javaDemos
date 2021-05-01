package encapsulation;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Ürün eklendi " + product.name);
	}
	
	
	//method overloading (Add2 yazsaydýk overload olmazdý)
	public void Add(int id, String name, String description, double price, int stockAmount) {
		// bu þekidle kullanýrsak main kýsmýnda bir sürü yerde yazdýðýmýzý düþünelim,
		// kdv gibi yeni bir özellik eklediðimiz zaman main kýsmýnda tüm yazdýðýmýz yerler hata verir,
		// tek tek düzeltmemiz gerekir!
		
	}

}
