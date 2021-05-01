package classesWithAttributes;

public class Main {
	
	public static void main (String[] args) {
		
		// Class'lar özellik yani attribute tutabilir.
		
		// Bir class tek bir iþ yapmalý! Bu yüzden manager için ayrý class oluþturduk.
		
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
