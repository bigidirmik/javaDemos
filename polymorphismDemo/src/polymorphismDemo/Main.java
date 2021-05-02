package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		// ÇOK BÝÇÝMLÝLÝK - POLÝMORFÝZM
		
		
		//EmailLogger emailLogger = new EmailLogger();
		//emailLogger.Log("Log mesajý");
		
		
		
		// bu þekilde Array de yapabiliriz
		
		BaseLogger[] loggers = new BaseLogger[] {
				new FileLogger(),
				new DatabaseLogger(),
				new EmailLogger(),
				new ConsoleLogger() // yeni eklediðimiz logger'ý da diziye aldýk
		};
		
		
		// ve for döngüsü ile tüm loglama iþlemlerini kolayca yapabiliriz
		
		for(BaseLogger logger:loggers) {
			logger.log("Log mesajý");
		}
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		// CustomerManger içinde field belirledik ve constructor ile o field'a istenecek logger'ý aktardýk.
		// CustomerManager çalýþtýrýldýðýnda bize BaseLogger'ý da kendisi verecek ve parametreye istediðimiz log türünü yazýp
		// log iþlemini de yapmýþ olacaðýz
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
