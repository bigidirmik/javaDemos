package methodsVariableArguments;

public class Main {

	public static void main(String[] args) {
		
		int toplam = topla(1,5,9,7,15);
		
		System.out.println(toplam);

	}
	
	public static int topla(int... sayilar) {
		
		// int sonuna koyulan üç nokta ... variable arguments 'dir.
		// bu sayede istediðimiz kadar parametre verebiliriz
		// verilen parametreleri int array haline getirir.
		// o halde biz de bu diziyi for ile dönebiliriz
		
		int toplam = 0;
		
		for (int sayi:sayilar) {
			toplam += sayi; // toplam = toplam + sayi; ile ayný þey
		}
		
		return toplam;
		
	}

}
