package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel."; // bu bir char[] arraydir

		System.out.println(mesaj);

		System.out.println("Eleman say�s� : " + mesaj.length());

		System.out.println("5. Eleman : " + mesaj.charAt(4));

		System.out.println(mesaj.concat(" Ya�as�n!")); // birle�tirir
		
		System.out.println(mesaj.startsWith("b")); // B ile ba�l�yorsa true d�nd�r�r. k���k b ile ba�lam�yor, false d�ner
		
		System.out.println(mesaj.endsWith(".")); // . i�areti ile bitiyorsa true d�nd�r�r.
		
		
		char[] karakterler = new char[5];
		mesaj.getChars( 0, 5, karakterler, 0 );
		// 0'dan ba�la - 5'e kadar (getChar'a �zel durumdur 5'i dahil etmez) - karakterler dizisine aktar - 0'dan aktarmaya ba�la demektir.
		
		System.out.println(karakterler);
		
		
		System.out.println(mesaj.indexOf("a")); // ilk buldu�u a'y� verir.
		
		System.out.println(mesaj.lastIndexOf("a")); // sondan ba�a do�ru arar.
		
	}

}
