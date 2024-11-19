package ro.emanuel.order.pojo;

public class Order {
	private int id;
	private String customer_name;
	private int total_price;
	
	public Order (){
		
	}

	public Order(int id, String customer_name, int total_price) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.total_price = total_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

}
