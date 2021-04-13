package struct;

public class Device {
	private String make;
	private int year;
	private String color;
	private String name;
	private String model;
	private double price;
	private double costPrice;
	
	public Device(String make, int year, String color, String name, String model, double price, double costPrice) {
		this.make = make;
		this.year = year;
		this.color = color;
		this.name = name;
		this.model = model;
		this.price = price;
		this.costPrice = costPrice;
	}
	
	public Device(String[] t) {
		this.make = t[0];
		this.year = Integer.parseInt(t[1]);
		this.color = t[2];
		this.name = t[3];
		this.model = t[4];
		this.price = Double.parseDouble(t[5]);
		this.costPrice = Double.parseDouble(t[6]);
	}
	
	public int getType() {
		return -1;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	
	public void show() {
		System.out.print(make + " " + year + " " + name + " " + price + " " + costPrice + " ");
	}
	
	
}
