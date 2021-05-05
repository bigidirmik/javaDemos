package interfaces_Polymorphism;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		// customerManager 'ýn add metodu bir interface'i çaðýrdýðý için ve interface'ler de new'lenemediði için hata verir.
		// o yüzden þunu da ekleriz.
		// customerManager.customerDal = new OracleCustomerDal();
		
		// fakat CustomerManager'da constructor ile zorunlu hale getirdiðimiz için artýk en baþta parametre olarak new'lememiz yeterli
		
		
		customerManager.add();

	}

}
