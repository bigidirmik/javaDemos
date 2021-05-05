package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.databaseManager = new SqlServerDatabaseManager();
		
		// bunu yapmazsak base sınıf abstract olduğu için ortada new'lenen bir şey olmaz
		
		customerManager.getCustomers();

	}

}
