package miniProject_AsalSayi;

public class Main {

	public static void main(String[] args) { // asal say� hesaplatma
		
		int number = 25;
		
		//int remainder = number % 2; // remainder kalan demektir. y�zde i�areti de mod (kalan) operat�r�d�r.
		//System.out.println(remainder);
		
		boolean isPrime = true; // isPrime asal m� demektir.
		
		if(number==1) {
			System.out.println("Say� asal de�ildir.");
			return; // di�er bloklara ge�mesini engeller.
		}
		
		if(number<2) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		// bug oldu�u i�in 1'e de asal say� diyor� ��nk� 1 for'a hi� girmiyor. bu y�zden ilk iki if blo�u yaz�ld�.
		
		if(isPrime) { // isPrime == true iel ayn� �ey
			System.out.println("Say� asal.");
		}else {
			System.out.println("Say� asal de�il.");
		}
		

	}

}
