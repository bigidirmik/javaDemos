package staticDemo;

// C#'ta class'� static yap�nca i�indeki her �ey static olur
// ancak Java'da b�yle bir �ey yok.

public class ProductValidator {
	
	//------------------------------------------------------------------------------------------------------------------------
	
	// uyguluma �al���nca static bir metot new'lense bile bu yap�c� blo�u �al��t�rmaz.
	// birsey() metodu bizim taraf�m�zdan new'lendi�inde �al���r.
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}

	//------------------------------------------------------------------------------------------------------------------------
	
	// C# 'ta parametresiz yap�c� blok staticte de �al���r!
	// Java'da ise bunun i�in static yap�c� blok olu�tururuz.
	// bunlardan istedi�imiz kadar olu�turabiliyoruz. ancak gerek olmad��� i�in yayg�n de�ildir.
	
	static {
		System.out.println("static yap�c� blok �al��t�");
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	
	public static boolean isValid(Product product) { // static yapt�k ��nk� manager metodu i�inde new'lemek istemiyoruz.

		if (!product.name.isEmpty() && product.price > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public void birsey() { // buna static vermedi�imiz i�in ProductValidator.isValid gelirken bu gelmez. Gelmesi i�in new'lemek gerekir.
		
	}
	
	//------------------------------------------------------------------------------------------------------------------------
	
	// inner class - best practice uygun de�ildir. bir class bir i� yapmal�d�r. o y�zden bu yap� �nerilmez!
	
	// ana class aksine bu class'a static verebiliyoruz ve i�indeki her �ey static olabiliyor.
	
	public static class baskaBirClass {
		
		public static void yap() {
			
		}
		
	}
	
	// inner class genelde grupland�rmalar i�in kullan�l�r
	
	// DatabaseHelper class'� buna �rnek olarak olu�turulmu�tur.

	//------------------------------------------------------------------------------------------------------------------------
	
}
