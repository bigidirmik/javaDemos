package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new KidGameCalculator(); // extends eden s�n�flar�n referans�n� tutabiliyor.

	}

}
