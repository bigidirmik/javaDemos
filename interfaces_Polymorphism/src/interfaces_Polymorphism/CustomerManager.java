package interfaces_Polymorphism;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	// main'de new'lediðimiz customerManager'a customerDal türünü belirtmesek de çalýþtýrana kadar hata göstermez.
	// kullanýcý unutabilir, bu yüzden unutamayacaðý bir yapýya çekmek için constructor ile zorunlu hale getirelim
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	
	public void add() {
		// iþ kodlarý yazýlýr
		customerDal.add();
	}

}
