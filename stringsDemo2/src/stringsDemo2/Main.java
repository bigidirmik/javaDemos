package stringsDemo2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel."; // bu bir char[] arraydir

		System.out.println(mesaj);
		
		
		String yeniMesaj = mesaj.replace(' ','-'); // örneðin urlde boþluk yerine tire atamak için kullanýlabilir.
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5)); // belirlerdiðimiz indexler arasýný yazdýrýr.
		
		
		for(String kelime : mesaj.split(" ")) { // boþluða göre ayýr dedik.
			System.out.println(kelime);
		};
		
		System.out.println(mesaj.toLowerCase()); // küçük harflere çevirir
		System.out.println(mesaj.toUpperCase()); // büyük harflere çevirir
		
		System.out.println(mesaj.trim()); // baþýndaki ve sonundaki gereksiz boþluklarý atar
		
	}

}
