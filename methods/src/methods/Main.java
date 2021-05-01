package methods;

public class Main {

	
	
	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma(); // metotlarý main içinde istediðimiz kadar çaðýrýrýz.
	}
	
	
	
	
	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 5;

		int sayi;

		for (int i = 0; i < sayilar.length; i++) {
			sayi = sayilar[i];
			if (aranacak == sayi) {
				System.out.println("sayý bulundu");
				return;
			}
		}
		System.out.println("sayý yok");

		// ya da

		boolean varMi = false;

		for (int sayii : sayilar) {
			if (sayii == aranacak) {
				varMi = true;
				break; // artýk aramasýna gerek yok o yüzden durdurur.
			}
		}

		if (varMi) {
			mesajVer("Sayý mevcuttur" + aranacak);
			// bunu yerine mesajVer() çaðýrdýk -> System.out.println("sayý bulundu" + aranacak);
			// string mesaj olarak parametre verince int aranacak da kabul olur, çünkü bunlarý string olarak toplar
		} else {
			System.out.println("sayý yok");
		}
	}
	
	
	
	public static void mesajVer(String mesaj) { // yukardaki aranacak deðiþkenini bu metot bulamaz, o yüzden parametreli metot yaparýz.
		System.out.println(mesaj); 
	}

}
