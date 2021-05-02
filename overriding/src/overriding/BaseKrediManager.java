package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// overridable yani üzerine yazılabilir olmasını engellemek için metot şöyle yazılır:
	
	// public double hesapla(double tutar)

}
