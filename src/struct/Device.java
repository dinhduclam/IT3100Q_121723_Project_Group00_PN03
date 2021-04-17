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

	public final static String [][]LAPTOP_TEST_DATA = {
			{"Acer", "Aspire VX5-591G", "VX5-591G-62YZ", "2017", "Black", "2100000", "1850000", "Intel Core i5 7300HQ", "8GB", "1TB"},
			{"Dell","Vostro 3500","V5I3001W", "2020","Black","12690000","10000000","Intel Core I5 1035G1","8GB","256GB"} ,
			{"Acer"," Aspire A315-56-502X","NX.HS5SV.00F","2019","Black","12990000","11000000","Intel Core I5 1035G1","4GB","256GB"}, 
			{"Lenovo","Ideapad Slim 3 ","14ITL6 82H700DNVN ","2018","Grey","13290000","10500000","Intel Core I3 1115G4","8GB","512GB"}, 
			{"MSI","Modern 14 ","B10MW-482VN ","2020","Blue Stone","13790000","10000000","Intel Core I3 10110U","8GB","256GB"} ,
			{"HP","HP 245 G8 ","345R8PA ","2019","Silver","13590000","11000000","Ryzen 5 3500U","4GB","256GB"},
			{"Dell ","Inspiron 7490 ","N4I5106W ","2018","Silver","25490000","20000000","Intel Core I5 10210U","8GB","512GB"},
			{"Acer","Swift 3X SF314 510G 5742","NX.A10SV.003 ","2020","Gold","25490000","20000000","Intel Core I5 1135G7","16GB","1TB"},
			{"LG ","Gram 14ZD90N ","V.AX53A5","2019","White","25290000","20000000","Intel Core I5 1035G7","8GB","256GB"},
			{"LG","Liber V14 ","NS14A8VNF561","2021","Grey","16990000","12000000","Intel Core I5 10210U","8GB","256GB"},
			{"Apple","Macbook Pro","MYD82","2020","Space Gray","16990000","12000000"," Apple M1","8GB","256GB"}
	};
	
	public final static String [][]PHONE_TEST_DATA = {
			{"Apple","Iphone 12","Apple A14 Bionic","2020","Gold","21999999999","15000000000","6.1inch" ,"2815mAh", "12MP"},
			{"SamSung","SamSung galaxy S21","Exynos 2100","2020","Sliver","28999999999","22500000000","6.7inch" ,"4800mAh", "64MP"},
			{"SamSung","SamSung galaxy Z Fold2 5G","Snapdragon 865+","2021","Red","48999999999","40000000000", "7.59inch", "4500mAh", "64MB"}
	};
	
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
