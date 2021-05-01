package constructors;

public class Main {

	public static void main(String[] args) {

		System.out.println("---------------Parametresiz Constructor-------------------");
		
		// parametresiz constructor'a sahip olduðumuz için þöyle yazabiliriz.

		Product product = new Product();

		product.set_id(1);
		product.set_name("MSI Latptop");
		product.set_description("32 GB RAM");
		product.set_price(10000);
		product.set_stockAmount(3);
		
		System.out.println(product.get_name());
		
		
		System.out.println("---------------Parametreli Constructor-------------------");
		

		// new'in saðý, yani new 'lenen yapýcý blok'tur. new'leyince çalýþtýrmýþ oluruz.
		Product product2 = new Product( 2, "Asus Laptop", "16 GB RAM", 5000, 5 );

		System.out.println(product2.get_name());
		
	}

}
