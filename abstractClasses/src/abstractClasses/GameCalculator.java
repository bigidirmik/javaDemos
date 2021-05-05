package abstractClasses;

public abstract class GameCalculator { // abstract sýnýflar asla new'lenemez, new'lemek için override þarttýr (main dahil)
	
	public abstract void calculate(); // abstract : kullanan tüm yapýlar override etmek zorunda kalýr.
	
	public final void gameOver() { // final : bunu kullanan extends eden tüm yapýlar bu þekli ile kullanmak zorunda kalýr.
		System.out.println("Oyun bitti");
	}

}
