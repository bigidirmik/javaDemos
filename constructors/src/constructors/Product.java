package constructors;

public class Product {
	
	
	
	// Bu parametresiz blok, (biz yazmasak da) zaten default olarak vard�r.
	
	public Product() { // CONSTRUCTOR - Yap�c� (olu�turucu) blok/metot
		System.out.println("Yap�c� blok �al��t�");
	}
	
	
	
	// parametreli olan� ise ��yledir. Bu ayn� zamanda method overloading yapmak oluyor.
	
	// kullanacak ki�iye new'ledi�imizde bu parametreleri yazamak zorundas�n demi� oluyoruz.
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		_id = id;
		_name = name;
		_description = description;
		_price = price;
		_stockAmount = stockAmount;
		
		// Bu �ekilde e�itlememiz �artt�r.
	}
	
	
	
	
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _code;
	
	public int get_id() {
		return _id;
	}
	
	public void set_id(int id) {
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		_name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		_description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		_price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String get_code() {
		_code = _name.substring(0,1) + _id;
		return _code;
	}
}