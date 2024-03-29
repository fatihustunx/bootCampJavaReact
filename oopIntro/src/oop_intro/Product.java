package oop_intro;

public class Product {

	//encapsulation..
	//final --> Sadece contructor da set edilebilir !
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product() {
		System.out.println("Default constructor �al���yor..");
	}

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		//super(); Basedeki class'i calistirir..
		// this(); Bu class'taki parametresiz constructor �al���r..
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name+"!";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
}
	