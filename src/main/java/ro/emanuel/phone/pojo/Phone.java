package ro.emanuel.phone.pojo;

public class Phone {

	private int id;
	private String model;
	private String brand;
	private int price;
	
	public Phone (){
		
	}

	public Phone(int id, String model, String brand, int price) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
