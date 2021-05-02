package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		
		
		// Kredi UI sayesinde ��yle de yapabiliriz
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new TarimKrediManager());
		
		// BaseKrediManger parametresi oldu�u i�in onu extends eden her krediyi parametreye yazabiliriz
		
		
		// Bu inheritance sistemi ile yeni bir kredi t�r� ekledikten sonra BaseKrediManager extends etmek yeterli olacakt�r.
		// �rne�in AskerKrediManager ekleyelim, tek yapaca��m�z extends BaseKrediManager eklemek olacak.
		
		
		// T�M BUNLARA POL�MORF�ZM DEN�R

	}

}
