package interfaces_Polymorphism;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	// main'de new'ledi�imiz customerManager'a customerDal t�r�n� belirtmesek de �al��t�rana kadar hata g�stermez.
	// kullan�c� unutabilir, bu y�zden unutamayaca�� bir yap�ya �ekmek i�in constructor ile zorunlu hale getirelim
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	
	public void add() {
		// i� kodlar� yaz�l�r
		customerDal.add();
	}

}
