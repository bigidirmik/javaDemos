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
		// Manager 'da yeni �zellik ekledi�imizde yukar�daki gibi yazd���m�z her yerde
		// tek tek elle de�i�tirmek zorunda kal�r�z
		
		
		// Fakat overload olarak parametreli yazd���m�z metot yerine (manager'daki) ilk metodu kullan�rsak
		// product class�na �zellik eklememiz yeterli
		// sonras�nda manager add yaparken ister o yeni �zelli�i belirtiriz ister belirtmeyiz.
		
		// Ayr�ca �r�n fiyat� eksi olamaz, id zorunludur gibi kurallar� belirtebiliriz.
		
		// Bu Encapsulation'dan yararlanmak anlam�na geliyor.
		
		// (product i�indeki �zellikler c# aksine default olarak public'tir)
		
		

	}

}
