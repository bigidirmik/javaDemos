package miniProject_AsalSayi;

public class Main {

	public static void main(String[] args) { // asal sayý hesaplatma
		
		int number = 25;
		
		//int remainder = number % 2; // remainder kalan demektir. yüzde iþareti de mod (kalan) operatörüdür.
		//System.out.println(remainder);
		
		boolean isPrime = true; // isPrime asal mý demektir.
		
		if(number==1) {
			System.out.println("Sayý asal deðildir.");
			return; // diðer bloklara geçmesini engeller.
		}
		
		if(number<2) {
			System.out.println("Geçersiz sayý");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		// bug olduðu için 1'e de asal sayý diyorç çünkü 1 for'a hiç girmiyor. bu yüzden ilk iki if bloðu yazýldý.
		
		if(isPrime) { // isPrime == true iel ayný þey
			System.out.println("Sayý asal.");
		}else {
			System.out.println("Sayý asal deðil.");
		}
		

	}

}
