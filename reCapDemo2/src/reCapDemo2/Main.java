package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 }; // new'leyerek yazmak aras�nda bir fark yoktur.

		double total = 0; // toplamlar� i�in

		double max = myList[0]; // en b�y�k say� i�in

		
		for (double number : myList) {
			if (max < number) {
				max = number; // e�er max en b�y�k say� de�il yani number'dan k���kse. o anki number'� ata
								// dedik.
			}
			total = total + number; // toplamlar� i�in
			System.out.println(number);
		}

		
		System.out.println("Toplam : " + total);

		System.out.println("En b�y�k : " + max);

	}

}
