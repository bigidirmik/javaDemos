package miniProject_MukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		// M�kemmel say�lar �unlard�r.
		// 6 --> 1, 2, 3 'e b�l�n�r. toplamlar� 6 'd�r.
		// 28 -> 1, 2, 4, 7, 14 'e b�l�n�r. Toplamlar� 28 'dir.
		
		int number = 27;
		
		int total = 0;
		
		for(int i=1;i<number;i++)
			if(number % i == 0) {
				total = total + i;
			}
		
		if(total == number) {
			System.out.println("M�kemmel say�d�r");
		}else {
			System.out.println("M�kemmel say� de�ildir");
		}
		
		// sge�ersiz say�lar i�in for �zerinde return ile biten if bloklar� yaz�labilir.
		
	}

}
