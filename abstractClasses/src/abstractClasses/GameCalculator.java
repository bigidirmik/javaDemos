package abstractClasses;

public abstract class GameCalculator { // abstract s�n�flar asla new'lenemez, new'lemek i�in override �artt�r (main dahil)
	
	public abstract void calculate(); // abstract : kullanan t�m yap�lar override etmek zorunda kal�r.
	
	public final void gameOver() { // final : bunu kullanan extends eden t�m yap�lar bu �ekli ile kullanmak zorunda kal�r.
		System.out.println("Oyun bitti");
	}

}
