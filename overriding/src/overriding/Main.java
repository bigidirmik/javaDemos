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
		
		
		// Ogrenciler için 1.10 faizli kredi çýktý ve onu ekliyoruz diyelim, onu da yukarýda Array'e ekleyelim
		// OgrenciKrediManager'da ayný imzalý yani ayný "hesapla" metodu ile 1.10 iþlemi yapan metot yazarýz, override etmiþ oluruz
		
		// eðer BaseKrediManager 'ýn metodunun override edilmesini engellemek istiyorsak
		// Basedeki bu metodun public ifadesinin yanýna final ekleriz ( public final void metot() þeklinde )
		
		
		// OVERRIDING BÝR ÇOK TASARIM DESENÝ ÝÇÝN TEMEL ALTYAPIDIR, ÇOK ÖNEMLÝDÝR
		

	}

}
