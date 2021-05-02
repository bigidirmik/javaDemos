package overriding;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(1000));
		
		System.out.println("------------------------");
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new OgretmenKrediManager(),
				new TarimKrediManager(),
				new OgrenciKrediManager()
				};
		
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
		
		
		// Ogrenciler i�in 1.10 faizli kredi ��kt� ve onu ekliyoruz diyelim, onu da yukar�da Array'e ekleyelim
		// OgrenciKrediManager'da ayn� imzal� yani ayn� "hesapla" metodu ile 1.10 i�lemi yapan metot yazar�z, override etmi� oluruz
		
		// e�er BaseKrediManager '�n metodunun override edilmesini engellemek istiyorsak
		// Basedeki bu metodun public ifadesinin yan�na final ekleriz ( public final void metot() �eklinde )
		
		
		// OVERRIDING B�R �OK TASARIM DESEN� ���N TEMEL ALTYAPIDIR, �OK �NEML�D�R
		

	}

}
