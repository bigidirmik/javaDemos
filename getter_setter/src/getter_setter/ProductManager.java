package getter_setter;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("Ürün eklendi " + product.get_name());
	}

}
