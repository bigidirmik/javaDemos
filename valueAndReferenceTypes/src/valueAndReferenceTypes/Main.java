package valueAndReferenceTypes;

public class Main {

	public static void main(String[] args) {
		
		// De�er Tip - Value Type (sadece stack'te tutulurlar)
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi2 = sayi1; // sayi2 nin de�eri = sayi1'in de�eri (10)
		
		sayi1 = 30; // sayi1'i 30 yapt�k, 
		
		System.out.println(sayi2); // sayi2 ise en son ona atanan de�er olan 10'dur.
		
		// cevap 10 'dur.
		
		
		//------------------------------------------------------------------------------
		
		
		// Referans Tip - Reference Type
		// (G�sterdi�i adres new'ledi�imizde (�rene�ini olu�turunca) Heap'te tutulur)
		
		int[] sayilar1 = new int[] {1, 2, 3}; // g�sterdi�i referans adresi - 101
		int[] sayilar2 = new int[] {4, 5, 6}; // g�sterdi�i referans adresi - 102
		
		sayilar2 = sayilar1;
		// sayilar2 'nin g�sterdi�i referans adresi e�ittir sayilar1 'in ref adresi (yani 101)
		
		sayilar1[0] = 10; // 101 nolu referans�n ilk eleman�n� 10 yapt�k.
		
		System.out.println(sayilar2[0]);
		// �stteki atamadan sonra sayilar1 gibi 101 nolu referans� g�steren sayilar2 nin ilk eleman� da 10'dur
		
		// cevap 10 'dur.
		
		// T�m diziler t�r� farketmeksizin referans tiptir.
		
		// 102 nolu adresi art�k kimse tutmad��� i�in garbage Collector gelip ��pe atar.

	}

}
