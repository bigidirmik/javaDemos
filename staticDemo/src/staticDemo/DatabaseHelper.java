package staticDemo;

// inner class - best practice uygun de�ildir. bir class bir i� yapmal�d�r. o y�zden bu yap� �nerilmez!

// CrudDatabaseHelper ve ConnectionDatabaseHelper diye iki ayr� class olu�turmak daha mant�kl�d�r.

public class DatabaseHelper {
	
	public static class Crud{ // Create, Read, Update, Delete operasyonlar�
		
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
