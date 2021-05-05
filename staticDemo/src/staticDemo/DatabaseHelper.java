package staticDemo;

// inner class - best practice uygun deðildir. bir class bir iþ yapmalýdýr. o yüzden bu yapý önerilmez!

// CrudDatabaseHelper ve ConnectionDatabaseHelper diye iki ayrý class oluþturmak daha mantýklýdýr.

public class DatabaseHelper {
	
	public static class Crud{ // Create, Read, Update, Delete operasyonlarý
		
		public static void Delete() {
			
		}
		
		public static void Update() {
			
		}
		
	}
	
	
	public static class Connection{
		
		public static void createConnection() {
			
		}
		
	}

}
