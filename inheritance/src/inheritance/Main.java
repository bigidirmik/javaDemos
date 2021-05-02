package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.id = 1;
		employee.id = 1;

		// Person extends ettikleri için Person'a ait "id" gibi özellikler de geldi
		
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.Add();
		employeeManager.Add();
		
		// Ayný yukarýdaki gibi; bu ikisi PersonManager extends ettiði için sadece PersonManager'da olan "Add" de kullanabilirler.
	}

}
