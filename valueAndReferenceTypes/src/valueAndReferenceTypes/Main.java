package valueAndReferenceTypes;

public class Main {

	public static void main(String[] args) {
		
		// Deðer Tip - Value Type (sadece stack'te tutulurlar)
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi2 = sayi1; // sayi2 nin deðeri = sayi1'in deðeri (10)
		
		sayi1 = 30; // sayi1'i 30 yaptýk, 
		
		System.out.println(sayi2); // sayi2 ise en son ona atanan deðer olan 10'dur.
		
		// cevap 10 'dur.
		
		
		//------------------------------------------------------------------------------
		
		
		// Referans Tip - Reference Type
		// (Gösterdiði adres new'lediðimizde (öreneðini oluþturunca) Heap'te tutulur)
		
		int[] sayilar1 = new int[] {1, 2, 3}; // gösterdiði referans adresi - 101
		int[] sayilar2 = new int[] {4, 5, 6}; // gösterdiði referans adresi - 102
		
		sayilar2 = sayilar1;
		// sayilar2 'nin gösterdiði referans adresi eþittir sayilar1 'in ref adresi (yani 101)
		
		sayilar1[0] = 10; // 101 nolu referansýn ilk elemanýný 10 yaptýk.
		
		System.out.println(sayilar2[0]);
		// üstteki atamadan sonra sayilar1 gibi 101 nolu referansý gösteren sayilar2 nin ilk elemaný da 10'dur
		
		// cevap 10 'dur.
		
		// Tüm diziler türü farketmeksizin referans tiptir.
		
		// 102 nolu adresi artýk kimse tutmadýðý için garbage Collector gelip çöpe atar.

	}

}
