package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		
		
		// Kredi UI sayesinde þöyle de yapabiliriz
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new TarimKrediManager());
		
		// BaseKrediManger parametresi olduðu için onu extends eden her krediyi parametreye yazabiliriz
		
		
		// Bu inheritance sistemi ile yeni bir kredi türü ekledikten sonra BaseKrediManager extends etmek yeterli olacaktýr.
		// örneðin AskerKrediManager ekleyelim, tek yapacaðýmýz extends BaseKrediManager eklemek olacak.
		
		
		// TÜM BUNLARA POLÝMORFÝZM DENÝR

	}

}
