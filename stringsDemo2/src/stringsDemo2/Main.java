package stringsDemo2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel."; // bu bir char[] arraydir

		System.out.println(mesaj);
		
		
		String yeniMesaj = mesaj.replace(' ','-'); // �rne�in urlde bo�luk yerine tire atamak i�in kullan�labilir.
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5)); // belirlerdi�imiz indexler aras�n� yazd�r�r.
		
		
		for(String kelime : mesaj.split(" ")) { // bo�lu�a g�re ay�r dedik.
			System.out.println(kelime);
		};
		
		System.out.println(mesaj.toLowerCase()); // k���k harflere �evirir
		System.out.println(mesaj.toUpperCase()); // b�y�k harflere �evirir
		
		System.out.println(mesaj.trim()); // ba��ndaki ve sonundaki gereksiz bo�luklar� atar
		
	}

}
