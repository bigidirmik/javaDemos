package interfaces_Polymorphism;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		// customerManager '�n add metodu bir interface'i �a��rd��� i�in ve interface'ler de new'lenemedi�i i�in hata verir.
		// o y�zden �unu da ekleriz.
		// customerManager.customerDal = new OracleCustomerDal();
		
		// fakat CustomerManager'da constructor ile zorunlu hale getirdi�imiz i�in art�k en ba�ta parametre olarak new'lememiz yeterli
		
		
		customerManager.add();

	}

}
