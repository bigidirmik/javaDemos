package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.id = 1;
		employee.id = 1;

		// Person extends ettikleri i�in Person'a ait "id" gibi �zellikler de geldi
		
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.Add();
		employeeManager.Add();
		
		// Ayn� yukar�daki gibi; bu ikisi PersonManager extends etti�i i�in sadece PersonManager'da olan "Add" de kullanabilirler.
	}

}
