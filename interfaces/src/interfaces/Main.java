package interfaces;

public class Main {

	public static void main(String[] args) {

		// interface'ler de abstract'lar gibi new'lenemez. bu yüzden onu implemente eden
		// baþka bir sýnýfý new'ledik.
		CustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();

		// extends ile implements farký þudur!
		// bir class birden fazla interface'i implements edebilir.

	}

}
