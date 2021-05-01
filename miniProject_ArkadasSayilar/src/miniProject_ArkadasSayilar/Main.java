package miniProject_ArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		// 220 - 284
		
		// 220 nin kendisi hariç tüm pozitif bölenleri toplamý 284'tür
		// 284 ün kendisi hariç tüm pozitif bölenleri toplamý 220'dir
		// bunlara arkadaþ sayýlar denir.
		
		int sayi1 = 220;
		int sayi2 = 284;
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayi1;i++) { // sayi1 in bölenlerini toplama
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int i=1; i<sayi2;i++) { // sayi2 nin bölenlerini toplama
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}
		
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Arkadaþ sayýlardýr");
		}else {
			System.out.println("Arkadaþ sayý deðillerdir");
		}

	}

}
