package struct;

public class Device {
	private String make;
	private int year;
	private String color;
	private String name;
	private String model;
	private double price;
	private double costPrice;
	public final static int LAPTOP_TYPE = 0;
	public final static int PHONE_TYPE = 1;
	public final static String[] LAPTOP_COLUMN_TITLE = { "Make", "Name", "Model", "Year", "Color", "Price", "Cost Price", "CPU", "RAM", "Disk" };
	public final static String[] PHONE_COLUMN_TITLE = { "Make", "Name", "Model", "Year", "Color", "Price", "Cost Price", "Screen", "Battery", "Camera" };
	public final static int LAPTOP_NUMBER_OF_STATE = LAPTOP_COLUMN_TITLE.length;
	public final static int PHONE_NUMBER_OF_STATE = PHONE_COLUMN_TITLE.length;
	
	public Device(String make, String name, String model, int year, String color, double price, double costPrice) {
		this.make = make;
		this.name = name;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.costPrice = costPrice;
	}
	
	public Device(String[] t) {
		this.make = t[0];
		this.name = t[1];
		this.model = t[2];
		this.year = Integer.parseInt(t[3]);
		this.color = t[4];
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
	
	public String[] getStringArray() { 
		return null;
	}
	
	public void show() {
		System.out.print(make + " " + name + " " + price + " " + costPrice + " ");
	}
	
	
}
