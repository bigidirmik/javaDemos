package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.databaseManager = new SqlServerDatabaseManager();
		
		// bunu yapmazsak base s�n�f abstract oldu�u i�in ortada new'lenen bir �ey olmaz
		
		customerManager.getCustomers();

	}

}
