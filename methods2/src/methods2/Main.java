package methods2;

public class Main {

	public static void main(String[] args) {
		
		// String mesaj = "Bug�n hava �ok g�zel.";

		// String yeniMesaj = mesaj.substring(0,2); // yeniMesaj'a atamaz isek hi�bir �ey geri d�nd�rmez.
		// ��nk� onu olu�turmu� ama kullanmamm��, hi�bir �eye atamama�� oluruz.
		
		// String ekleMesaj = ekle(); // String t�r� isterken void g�nderemeyiz, o y�zden bu �al��maz.
		
		// String sehirVer = sehirVer(); // bu �ekilde olmal�d�r. int topla olan� da veremeyiz. ��nk� string istiyor.
		
		// a�a��daki metotlara bak�p anlayabilirsin.
		
		int toplam = topla(5,7);
		
		System.out.println(toplam);
		
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	
	// datay� geri ver demek istedi�imizde void yazmay�z. void sadece yap demektir. Ekrana yazd�rmak return anlam�na gelmez.
	
	// return edenler ise ��yle
	
	public static int topla(int sayi1, int sayi2) { // bu fonksiyon int t�r�nde de�er d�nd�r�r demek.
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}
