package methods;

public class Main {

	
	
	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma(); // metotlar� main i�inde istedi�imiz kadar �a��r�r�z.
	}
	
	
	
	
	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 5;

		int sayi;

		for (int i = 0; i < sayilar.length; i++) {
			sayi = sayilar[i];
			if (aranacak == sayi) {
				System.out.println("say� bulundu");
				return;
			}
		}
		System.out.println("say� yok");

		// ya da

		boolean varMi = false;

		for (int sayii : sayilar) {
			if (sayii == aranacak) {
				varMi = true;
				break; // art�k aramas�na gerek yok o y�zden durdurur.
			}
		}

		if (varMi) {
			mesajVer("Say� mevcuttur" + aranacak);
			// bunu yerine mesajVer() �a��rd�k -> System.out.println("say� bulundu" + aranacak);
			// string mesaj olarak parametre verince int aranacak da kabul olur, ��nk� bunlar� string olarak toplar
		} else {
			System.out.println("say� yok");
		}
	}
	
	
	
	public static void mesajVer(String mesaj) { // yukardaki aranacak de�i�kenini bu metot bulamaz, o y�zden parametreli metot yapar�z.
		System.out.println(mesaj); 
	}

}
