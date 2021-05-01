package miniProject_SayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 5;
		
		int sayi;
		
		for(int i=0;i<sayilar.length;i++) {
			sayi = sayilar[i];
			if(aranacak==sayi) {
				System.out.println("sayý bulundu");
				return;
			}
		}
		System.out.println("sayý yok");
		
		// ya da
		
		boolean varMi = false;
		
		for(int sayii:sayilar) {
			if(sayii==aranacak) {
				varMi = true;
				break; // artýk aramasýna gerek yok o yüzden durdurur.
			}
		}
		
		if(varMi) {
			System.out.println("sayý bulundu");
		}
		else {
			System.out.println("sayý yok");
		}
	}

}
