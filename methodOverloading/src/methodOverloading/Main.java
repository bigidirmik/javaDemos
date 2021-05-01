package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		
		System.out.println(dortIslem.Topla(4, 5));
		
		// iki sayý ile topladýk, fakat 3 sayýlý iþlem de istediler diyelim,
		
		// DortIslem class'ýnda overloading yapalým...
		
		//------------------------------------------------------------------
		
		// oluþturduktan sonra onu da tamamen ayný þekilde yazarak kullanabiliriz. yukarýda zaten new'ledik
		// tek fark 3 adet parametre yazýyor olmamýzdýr.
		
		System.out.println(dortIslem.Topla(8, 2, 4));

	}

}
