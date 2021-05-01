package methods2;

public class Main {

	public static void main(String[] args) {
		
		// String mesaj = "Bugün hava çok güzel.";

		// String yeniMesaj = mesaj.substring(0,2); // yeniMesaj'a atamaz isek hiçbir þey geri döndürmez.
		// çünkü onu oluþturmuþ ama kullanmammýþ, hiçbir þeye atamamaýþ oluruz.
		
		// String ekleMesaj = ekle(); // String türü isterken void gönderemeyiz, o yüzden bu çalýþmaz.
		
		// String sehirVer = sehirVer(); // bu þekilde olmalýdýr. int topla olaný da veremeyiz. çünkü string istiyor.
		
		// aþaðýdaki metotlara bakýp anlayabilirsin.
		
		int toplam = topla(5,7);
		
		System.out.println(toplam);
		
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	// datayý geri ver demek istediðimizde void yazmayýz. void sadece yap demektir. Ekrana yazdýrmak return anlamýna gelmez.
	
	// return edenler ise þöyle
	
	public static int topla(int sayi1, int sayi2) { // bu fonksiyon int türünde deðer döndürür demek.
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}
