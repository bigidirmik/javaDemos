package classesWithAttributes;

public class Main {
	
	public static void main (String[] args) {
		
		// Class'lar �zellik yani attribute tutabilir.
		
		// Bir class tek bir i� yapmal�! Bu y�zden manager i�in ayr� class olu�turduk.
		
		Product product = new Product();
		
		product.id = 1;
		product.name = "Asus Laptop";
		product.description = "16 GB RAM";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
