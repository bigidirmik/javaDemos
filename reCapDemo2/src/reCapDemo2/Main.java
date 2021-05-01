package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 }; // new'leyerek yazmak arasýnda bir fark yoktur.

		double total = 0; // toplamlarý için

		double max = myList[0]; // en büyük sayý için

		
		for (double number : myList) {
			if (max < number) {
				max = number; // eðer max en büyük sayý deðil yani number'dan küçükse. o anki number'ý ata
								// dedik.
			}
			total = total + number; // toplamlarý için
			System.out.println(number);
		}

		
		System.out.println("Toplam : " + total);

		System.out.println("En büyük : " + max);

	}

}
