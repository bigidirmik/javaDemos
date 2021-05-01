package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		
		int toplam = dortIslem.Topla(4,7,4,9,65);
		System.out.println("Toplama : " + toplam);
		
		int kalanCikar = dortIslem.Cikar(576,346);
		System.out.println("Çýkarma : " + kalanCikar);
		
		int carpim = dortIslem.Carp(2,7);
		System.out.println("Çarpma : " + carpim);
		
		int kalanBol = dortIslem.Bol(78473465,456);
		System.out.println("Bölme : " + kalanBol);
	}

}
