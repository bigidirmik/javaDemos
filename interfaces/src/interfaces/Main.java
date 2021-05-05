package interfaces;

public class Main {

	public static void main(String[] args) {

		// interface'ler de abstract'lar gibi new'lenemez. bu y�zden onu implemente eden
		// ba�ka bir s�n�f� new'ledik.
		CustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();

		// extends ile implements fark� �udur!
		// bir class birden fazla interface'i implements edebilir.

	}

}
