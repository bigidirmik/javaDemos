package staticDemo;

// C#'ta class'ý static yapýnca içindeki her þey static olur
// ancak Java'da böyle bir þey yok.

public class ProductValidator {
	
	//------------------------------------------------------------------------------------------------------------------------
	
	// uyguluma çalýþýnca static bir metot new'lense bile bu yapýcý bloðu çalýþtýrmaz.
	// birsey() metodu bizim tarafýmýzdan new'lendiðinde çalýþýr.
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}

	//------------------------------------------------------------------------------------------------------------------------
	
	// C# 'ta parametresiz yapýcý blok staticte de çalýþýr!
	// Java'da ise bunun için static yapýcý blok oluþtururuz.
	// bunlardan istediðimiz kadar oluþturabiliyoruz. ancak gerek olmadýðý için yaygýn deðildir.
	
	static {
		System.out.println("static yapýcý blok çalýþtý");
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	
	public static boolean isValid(Product product) { // static yaptýk çünkü manager metodu içinde new'lemek istemiyoruz.

		if (!product.name.isEmpty() && product.price > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public void birsey() { // buna static vermediðimiz için ProductValidator.isValid gelirken bu gelmez. Gelmesi için new'lemek gerekir.
		
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	
	// inner class - best practice uygun deðildir. bir class bir iþ yapmalýdýr. o yüzden bu yapý önerilmez!
	
	// ana class aksine bu class'a static verebiliyoruz ve içindeki her þey static olabiliyor.
	
	public static class baskaBirClass {
		
		public static void yap() {
			
		}
		
	}
	
	// inner class genelde gruplandýrmalar için kullanýlýr
	
	// DatabaseHelper class'ý buna örnek olarak oluþturulmuþtur.

	//------------------------------------------------------------------------------------------------------------------------
	
}
