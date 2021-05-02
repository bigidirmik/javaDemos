package overriding;

public class OgrenciKrediManager extends OgretmenKrediManager {
	
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

}
