package interfaces_Polymorphism;

public class MySqlCustomerDal implements CustomerDal, Repository { // extends de etmesini istersek önce extends olaný sonra implements yazabiliriz.

	// CustomerDal metodu
	@Override
	public void add() {
		
		System.out.println("My Sql eklendi.");
		
	}

	// Repository metodu
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	
}
