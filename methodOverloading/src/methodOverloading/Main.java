package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		
		System.out.println(dortIslem.Topla(4, 5));
		
		// iki say� ile toplad�k, fakat 3 say�l� i�lem de istediler diyelim,
		
		// DortIslem class'�nda overloading yapal�m...
		
		//------------------------------------------------------------------
		
		// olu�turduktan sonra onu da tamamen ayn� �ekilde yazarak kullanabiliriz. yukar�da zaten new'ledik
		// tek fark 3 adet parametre yaz�yor olmam�zd�r.
		
		System.out.println(dortIslem.Topla(8, 2, 4));

	}

}
