package miniProject_SayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 5;
		
		int sayi;
		
		for(int i=0;i<sayilar.length;i++) {
			sayi = sayilar[i];
			if(aranacak==sayi) {
				System.out.println("say� bulundu");
				return;
			}
		}
		System.out.println("say� yok");
		
		// ya da
		
		boolean varMi = false;
		
		for(int sayii:sayilar) {
			if(sayii==aranacak) {
				varMi = true;
				break; // art�k aramas�na gerek yok o y�zden durdurur.
			}
		}
		
		if(varMi) {
			System.out.println("say� bulundu");
		}
		else {
			System.out.println("say� yok");
		}
	}

}
