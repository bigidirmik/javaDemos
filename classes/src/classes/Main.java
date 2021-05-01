package classes;

public class Main {

	public static void main(String[] args) {
		
		// Reference Types - classs'lar referans tiptir!
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		CustomerManager customerManager2 = new CustomerManager();
		
		// ayný türde yeni takma adda bir CustomerManager new'ledik.
		// Heap'te ikisi de kendi ayrý adresini tuttu.
		
		customerManager = customerManager2; // customer 1'in ref numarasý eþittir 2'nin ref numarasý.
		// yani customer 1'in new Customer'ý artýk gerekli deðildir.
		// customer 1'in new 'inin oluþturduðu 101 nuamralý new birazdan Garbage Collector tarafýndan çöpe atýlýr.
		// çünkü new pahalýdýr!
		
		
	}
}


// class 'larýn ana amacý gruplama yapmaktýr.
// altýn kural budur.
// alýþveriþ için ekleme silme gibi, hesap makinesi için toplama,çýkarma,çarpma,bölme iþlemleri gibi

// proje içindeki class 'lar da buna örnektir.