package conditionals;

public class Main {

	public static void main(String[] args) {
		
		// Conditionals - Þartlar
		
		int sayi = 24;
		
		if(sayi<20) {
			System.out.println("Sayý 20'den küçüktür");
		}
		// if(sayi<15) Sayý 14 olduðunda hem üstteki hem bu if çalýþacaktýr.
		// Sayýyý 24 yapalým.
		else if (sayi==20){
			System.out.println("Sayý 20'ye eþittir");
		}
		else{
			System.out.println("Sayý 20'den büyüktür");
		}

	}

}
