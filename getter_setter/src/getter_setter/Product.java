package getter_setter;

public class Product {
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _code;

	// private yapt���m�z i�in okuyabilmek ve yazabilmek ad�na get ve set ederiz.
	
	public int get_id() { // di�er class'lar id'yi okuyabilir demek.
		return _id;
	}
	
	public void set_id(int id) { // set ederken void yaz�p, parametre olarak istenen de�eri veririz.
		// this.id = id; // this ile u�ra�mak yerine yukar�da �zellik olanlara alt �izgi ekleriz.
		_id = id; // b�ylece hangisi hangisidir kolayca ay�rt edebiliriz.
		
		// this ile de �al��abiliriz. o zaman IDE camelCase olarak isimlendirme yapar ve this ekler.
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
		// return _name.substring(0,1) + _id; // bu �ekilde �r�nler i�in bir kod olu�turabiliriz!
		
		// ben de ek olarak yukar�da _code kullan�lmad� diyerek k�rm�z� olmas�n diye ��yle refactor ettim
		// fakat �stteki de �al���yor
		
		_code = _name.substring(0,1) + _id;
		return _code;
	}
}