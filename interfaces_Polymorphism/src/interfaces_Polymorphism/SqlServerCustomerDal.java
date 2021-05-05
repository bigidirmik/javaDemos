package interfaces_Polymorphism;

public class SqlServerCustomerDal implements CustomerDal {

	@Override
	public void add() {
		
		System.out.println("Sql Server eklendi.");
		
	}

}
