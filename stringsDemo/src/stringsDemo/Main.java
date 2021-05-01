package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel."; // bu bir char[] arraydir

		System.out.println(mesaj);

		System.out.println("Eleman sayýsý : " + mesaj.length());

		System.out.println("5. Eleman : " + mesaj.charAt(4));

		System.out.println(mesaj.concat(" Yaþasýn!")); // birleþtirir
		
		System.out.println(mesaj.startsWith("b")); // B ile baþlýyorsa true döndürür. küçük b ile baþlamýyor, false döner
		
		System.out.println(mesaj.endsWith(".")); // . iþareti ile bitiyorsa true döndürür.
		
		
		char[] karakterler = new char[5];
		mesaj.getChars( 0, 5, karakterler, 0 );
		// 0'dan baþla - 5'e kadar (getChar'a özel durumdur 5'i dahil etmez) - karakterler dizisine aktar - 0'dan aktarmaya baþla demektir.
		
		System.out.println(karakterler);
		
		
		System.out.println(mesaj.indexOf("a")); // ilk bulduðu a'yý verir.
		
		System.out.println(mesaj.lastIndexOf("a")); // sondan baþa doðru arar.
		
	}

}
