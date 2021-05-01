package methodsVariableArguments;

public class Main {

	public static void main(String[] args) {
		
		int toplam = topla(1,5,9,7,15);
		
		System.out.println(toplam);

	}
	
	public static int topla(int... sayilar) {
		
		// int sonuna koyulan �� nokta ... variable arguments 'dir.
		// bu sayede istedi�imiz kadar parametre verebiliriz
		// verilen parametreleri int array haline getirir.
		// o halde biz de bu diziyi for ile d�nebiliriz
		
		int toplam = 0;
		
		for (int sayi:sayilar) {
			toplam += sayi; // toplam = toplam + sayi; ile ayn� �ey
		}
		
		return toplam;
		
	}

}
