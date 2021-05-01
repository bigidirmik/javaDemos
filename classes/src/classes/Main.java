package classes;

public class Main {

	public static void main(String[] args) {
		
		// Reference Types - classs'lar referans tiptir!
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		CustomerManager customerManager2 = new CustomerManager();
		
		// ayn� t�rde yeni takma adda bir CustomerManager new'ledik.
		// Heap'te ikisi de kendi ayr� adresini tuttu.
		
		customerManager = customerManager2; // customer 1'in ref numaras� e�ittir 2'nin ref numaras�.
		// yani customer 1'in new Customer'� art�k gerekli de�ildir.
		// customer 1'in new 'inin olu�turdu�u 101 nuamral� new birazdan Garbage Collector taraf�ndan ��pe at�l�r.
		// ��nk� new pahal�d�r!
		
		
	}
}


// class 'lar�n ana amac� gruplama yapmakt�r.
// alt�n kural budur.
// al��veri� i�in ekleme silme gibi, hesap makinesi i�in toplama,��karma,�arpma,b�lme i�lemleri gibi

// proje i�indeki class 'lar da buna �rnektir.