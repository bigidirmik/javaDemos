package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// overridable yani �zerine yaz�labilir olmas�n� engellemek i�in metot ��yle yaz�l�r:
	
	// public double hesapla(double tutar)

}
