package encapsulation;

public class ProductManager {
	
	public void Add(Product product) {
		System.out.println("�r�n eklendi " + product.name);
	}
	
	
	//method overloading (Add2 yazsayd�k overload olmazd�)
	public void Add(int id, String name, String description, double price, int stockAmount) {
		// bu �ekidle kullan�rsak main k�sm�nda bir s�r� yerde yazd���m�z� d���nelim,
		// kdv gibi yeni bir �zellik ekledi�imiz zaman main k�sm�nda t�m yazd���m�z yerler hata verir,
		// tek tek d�zeltmemiz gerekir!
		
	}

}
