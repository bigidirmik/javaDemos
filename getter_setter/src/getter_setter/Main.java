package getter_setter;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		//product.id=1;
		//product.name="Asus Laptop";
		//product.description="16 GB RAM";
		//product.price=5000;
		//product.stockAmount=3;
		
		//---------------------------------------
		
		// ilerleyi�
		
		//---------------------------------------
		
		// product i�indeki �zellikler c# aksine default olarak public'tir
		// her �zelli�i private olarak i�aretledik
		// ard�ndan ise burada ve di�er class'larda ula�abilmek i�in de get ve set etmemiz gerekir.
		
		// �imdi yukar�daki �zelliklere de�er atad���m�z k�sm� �u �ekilde refactor ediyoruz.
		
		product.set_id(1);
		product.set_name("Asus Laptop");
		product.set_description("16 GB RAM");
		product.set_price(5000);
		product.set_stockAmount(3);
		
		
		System.out.println( product.get_name() ); // Bu �ekilde de okuyoruz.
		
		System.out.println( product.get_code() ); // product class'�nda getter metodunda olu�turduk.
	}

}