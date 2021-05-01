package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		// En büyük sayý nedir algoritmasý.
		
		if(sayi1>sayi2&&sayi1>sayi3) {
			System.out.println(sayi1);
		}else if(sayi2>sayi1&&sayi2>sayi3) {
			System.out.println(sayi2);
		}else {
			System.out.println(sayi3);
		}
		
		// ya da hocanýn yöntemi ile araya deðiþken sokarak en büyük olan sayýyý bu deðiþkene aktarabiliriz.
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);
	}

}
