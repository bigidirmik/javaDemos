package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new KidGameCalculator(); // extends eden sýnýflarýn referansýný tutabiliyor.

	}

}
