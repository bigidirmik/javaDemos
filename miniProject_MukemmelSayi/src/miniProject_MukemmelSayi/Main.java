package miniProject_MukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		// Mükemmel sayýlar þunlardýr.
		// 6 --> 1, 2, 3 'e bölünür. toplamlarý 6 'dýr.
		// 28 -> 1, 2, 4, 7, 14 'e bölünür. Toplamlarý 28 'dir.
		
		int number = 27;
		
		int total = 0;
		
		for(int i=1;i<number;i++)
			if(number % i == 0) {
				total = total + i;
			}
		
		if(total == number) {
			System.out.println("Mükemmel sayýdýr");
		}else {
			System.out.println("Mükemmel sayý deðildir");
		}
		
		// sgeçersiz sayýlar için for üzerinde return ile biten if bloklarý yazýlabilir.
		
	}

}
