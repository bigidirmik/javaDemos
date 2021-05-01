package getter_setter;

public class Product {
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _code;

	// private yaptýðýmýz için okuyabilmek ve yazabilmek adýna get ve set ederiz.
	
	public int get_id() { // diðer class'lar id'yi okuyabilir demek.
		return _id;
	}
	
	public void set_id(int id) { // set ederken void yazýp, parametre olarak istenen deðeri veririz.
		// this.id = id; // this ile uðraþmak yerine yukarýda özellik olanlara alt çizgi ekleriz.
		_id = id; // böylece hangisi hangisidir kolayca ayýrt edebiliriz.
		
		// this ile de çalýþabiliriz. o zaman IDE camelCase olarak isimlendirme yapar ve this ekler.
		// ikisi de olur.
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
		// return _name.substring(0,1) + _id; // bu þekilde ürünler için bir kod oluþturabiliriz!
		
		// ben de ek olarak yukarýda _code kullanýlmadý diyerek kýrmýzý olmasýn diye þöyle refactor ettim
		// fakat üstteki de çalýþýyor
		
		_code = _name.substring(0,1) + _id;
		return _code;
	}
}