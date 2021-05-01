package miniProject_ArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		// 220 - 284
		
		// 220 nin kendisi hari� t�m pozitif b�lenleri toplam� 284't�r
		// 284 �n kendisi hari� t�m pozitif b�lenleri toplam� 220'dir
		// bunlara arkada� say�lar denir.
		
		int sayi1 = 220;
		int sayi2 = 284;
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayi1;i++) { // sayi1 in b�lenlerini toplama
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int i=1; i<sayi2;i++) { // sayi2 nin b�lenlerini toplama
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}
		
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Arkada� say�lard�r");
		}else {
			System.out.println("Arkada� say� de�illerdir");
		}

	}

}
