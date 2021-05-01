package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//Döngüler
		
		
		//for
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		};
		System.out.println("for Döngüsü Bitti");
		
		
		//while
		
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while Döngüsü Bitti");
		
		
		//do while // þart saðlanmadýðý zaman bile þart satýrýna gelene kadar 1 kere çalýþýr.
		// þar saðlanmasa da döngüye girildiðine dair log'lama yapmak istersek kullanýlabilir.
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("do while Döngüsü Bitti");

	}

}
