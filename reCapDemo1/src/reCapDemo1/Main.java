package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		// En b�y�k say� nedir algoritmas�.
		
		if(sayi1>sayi2&&sayi1>sayi3) {
			System.out.println(sayi1);
		}else if(sayi2>sayi1&&sayi2>sayi3) {
			System.out.println(sayi2);
		}else {
			System.out.println(sayi3);
		}
		
		// ya da hocan�n y�ntemi ile araya de�i�ken sokarak en b�y�k olan say�y� bu de�i�kene aktarabiliriz.
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k = " + enBuyuk);
	}

}
