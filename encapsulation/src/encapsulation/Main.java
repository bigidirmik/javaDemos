package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id=1;
		product.name="Asus Laptop";
		product.description="16 GB RAM";
		product.price=5000;
		product.stockAmount=3;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add(1, "", "", 200, 2);
		productManager.Add(2, "", "", 200, 2);
		productManager.Add(3, "", "", 200, 2);
		productManager.Add(4, "", "", 200, 2);
		// Manager 'da yeni özellik eklediðimizde yukarýdaki gibi yazdýðýmýz her yerde
		// tek tek elle deðiþtirmek zorunda kalýrýz
		
		
		// Fakat overload olarak parametreli yazdýðýmýz metot yerine (manager'daki) ilk metodu kullanýrsak
		// product classýna özellik eklememiz yeterli
		// sonrasýnda manager add yaparken ister o yeni özelliði belirtiriz ister belirtmeyiz.
		
		// Ayrýca ürün fiyatý eksi olamaz, id zorunludur gibi kurallarý belirtebiliriz.
		
		// Bu Encapsulation'dan yararlanmak anlamýna geliyor.
		
		// (product içindeki özellikler c# aksine default olarak public'tir)
		
		

	}

}
