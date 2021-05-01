package reCapDemo_Classes;

public class DortIslem {

	public int Topla(int... sayilar) {

		int toplam = 0;

		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;
	}

	public int Cikar(int sayi1, int sayi2) { // args ile yapmanýn yolunu bul

		int kalan = sayi1 - sayi2;

		return kalan;
	}

	public int Carp(int sayi1, int sayi2) { // args ile yapmanýn yolunu bul

		int carpim = sayi1 * sayi2;

		return carpim;

	}

	public int Bol(int sayi1, int sayi2) { // args ile yapmanýn yolunu bul

		int kalan = sayi1 / sayi2;

		return kalan;
	}

}
