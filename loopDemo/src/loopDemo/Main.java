package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//D�ng�ler
		
		
		//for
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		};
		System.out.println("for D�ng�s� Bitti");
		
		
		//while
		
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while D�ng�s� Bitti");
		
		
		//do while // �art sa�lanmad��� zaman bile �art sat�r�na gelene kadar 1 kere �al���r.
		// �ar sa�lanmasa da d�ng�ye girildi�ine dair log'lama yapmak istersek kullan�labilir.
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("do while D�ng�s� Bitti");

	}

}
