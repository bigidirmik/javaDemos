package conditionals;

public class Main {

	public static void main(String[] args) {
		
		// Conditionals - �artlar
		
		int sayi = 24;
		
		if(sayi<20) {
			System.out.println("Say� 20'den k���kt�r");
		}
		// if(sayi<15) Say� 14 oldu�unda hem �stteki hem bu if �al��acakt�r.
		// Say�y� 24 yapal�m.
		else if (sayi==20){
			System.out.println("Say� 20'ye e�ittir");
		}
		else{
			System.out.println("Say� 20'den b�y�kt�r");
		}

	}

}
