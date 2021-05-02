package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		// �OK B���ML�L�K - POL�MORF�ZM
		
		
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.Log("Log mesaj�");
		
		
		
		// bu �ekilde Array de yapabiliriz
		
		BaseLogger[] loggers = new BaseLogger[] {
				new FileLogger(),
				new DatabaseLogger(),
				new EmailLogger(),
				new ConsoleLogger() // yeni ekledi�imiz logger'� da diziye ald�k
		};
		
		
		// ve for d�ng�s� ile t�m loglama i�lemlerini kolayca yapabiliriz
		
		for(BaseLogger logger:loggers) {
			logger.log("Log mesaj�");
		}
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		// CustomerManger i�inde field belirledik ve constructor ile o field'a istenecek logger'� aktard�k.
		// CustomerManager �al��t�r�ld���nda bize BaseLogger'� da kendisi verecek ve parametreye istedi�imiz log t�r�n� yaz�p
		// log i�lemini de yapm�� olaca��z
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
