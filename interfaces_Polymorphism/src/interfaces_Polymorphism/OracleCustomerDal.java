package interfaces_Polymorphism;

public class OracleCustomerDal implements CustomerDal {

	@Override
	public void add() {
		
		System.out.println("Oracle eklendi.");
		
	}
	
}
