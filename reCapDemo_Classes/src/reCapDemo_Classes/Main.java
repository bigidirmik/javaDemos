package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		
		int toplam = dortIslem.Topla(4,7,4,9,65);
		System.out.println("Toplama : " + toplam);
		
		int kalanCikar = dortIslem.Cikar(576,346);
		System.out.println("��karma : " + kalanCikar);
		
		int carpim = dortIslem.Carp(2,7);
		System.out.println("�arpma : " + carpim);
		
		int kalanBol = dortIslem.Bol(78473465,456);
		System.out.println("B�lme : " + kalanBol);
	}

}
