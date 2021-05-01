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
		
		// ilerleyiþ
		
		//---------------------------------------
		
		// product içindeki özellikler c# aksine default olarak public'tir
		// her özelliði private olarak iþaretledik
		// ardýndan ise burada ve diðer class'larda ulaþabilmek için de get ve set etmemiz gerekir.
		
		// þimdi yukarýdaki özelliklere deðer atadýðýmýz kýsmý þu þekilde refactor ediyoruz.
		
		product.set_id(1);
		product.set_name("Asus Laptop");
		product.set_description("16 GB RAM");
		product.set_price(5000);
		product.set_stockAmount(3);
		
		
		System.out.println( product.get_name() ); // Bu þekilde de okuyoruz.
		
		System.out.println( product.get_code() ); // product class'ýnda getter metodunda oluþturduk.
	}

}