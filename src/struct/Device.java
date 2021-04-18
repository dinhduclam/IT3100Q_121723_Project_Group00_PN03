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
	public final static String[] LAPTOP_COLUMN_TITLE = { "Brand", "Name", "Model", "Year", "Color", "Price", "Cost Price", "CPU", "RAM", "Disk" };
	public final static String[] PHONE_COLUMN_TITLE = { "Brand", "Name", "Model", "Year", "Color", "Price", "Cost Price", "Screen", "Battery", "Camera" };
	public final static int LAPTOP_NUMBER_OF_STATE = LAPTOP_COLUMN_TITLE.length;
	public final static int PHONE_NUMBER_OF_STATE = PHONE_COLUMN_TITLE.length;

	public final static String [][]LAPTOP_TEST_DATA = {
			{"Acer", "Aspire VX5-591G", "VX5-591G-62YZ", "2017", "Black", "890", "700", "Intel Core i5 7300HQ", "8GB", "1TB"},
			{"Dell", "Vostro 3500", "V5I3001W", "2020", "Black", "550", "434.4", "Intel Core I5 1035G1", "8GB", "256GB"} ,
			{"Acer", "Aspire A315-56-502X", "NX.HS5SV.00F", "2019", "Black", "569.99", "478.2", "Intel Core I5 1035G1", "4GB", "256GB"}, 
			{"Lenovo", "Ideapad Slim 3 ", "14ITL6 82H700DNVN ", "2018", "Grey", "549.9", "456", "Intel Core I3 1115G4", "8GB", "512GB"}, 
			{"MSI", "Modern 14 ", "B10MW-482VN ", "2020", "Blue Stone", "599.99", "443.4", "Intel Core I3 10110U", "8GB", "256GB"} ,
			{"HP", "HP 245 G8 ", "345R8PA ", "2019", "Silver", "590", "478", "Ryzen 5 3500U", "4GB", "256GB"},
			{"Dell ", "Inspiron 7490 ", "N4I5106W ", "2018", "Silver", "1110", "869.9", "Intel Core I5 10210U", "8GB", "512GB"},
			{"Acer", "Swift 3X SF314 510G 5742", "NX.A10SV.003 ", "2020", "Gold", "1109.99", "800", "Intel Core I5 1135G7", "16GB", "1TB"},
			{"LG ", "Gram 14ZD90N ", "V.AX53A5", "2019", "White", "1099.99", "869.5", "Intel Core I5 1035G7", "8GB", "256GB"},
			{"LG", "Liber V14 ", "NS14A8VNF561", "2021", "Grey", "749.9", "521.9", "Intel Core I5 10210U", "8GB", "256GB"},
			{"Apple", "Macbook Pro", "MYD82", "2020", "Space Gray", "799.9", "500", " Apple M1", "8GB", "256GB"}
	};
	
	public final static String [][]PHONE_TEST_DATA = {
			{"Apple", "Iphone 11 Pro", "A2160", "2019", "Space Gray", "809.99", "605", "5.8\" OLED" , "3190 mAh", "12MP"},
			{"SamSung", "SamSung galaxy S21+", "Exynos 2100", "2020", "Grey", "1199.99", "600", "6.7\" Flat FHD+" , "4800mAh", "64MP/10MP"},
			{"SamSung", "Samsung Galaxy A31", "A315G", "2021", "Red", "267.2", "99.3", "7.59 inches", "5000 mAh", "64MB"},
			{"Sony", "Xperia 1 II", "XQ-AT52", "2019", "White", "1179.99", "693", "6.5\" 4K HDR OLED", "5100 mAh", "128MB"},
			{"Realme", "Realme 7", "RMX2155", "2020", "White", "293.99", "100", "6.5\" 90Hz", "5000 mAh", "48MP Quad Camera"},
			{"Oppo", "OPPO Reno2 Z", "CPH1951", "2020", "Luminous Black", "494.97", "294", "6.5\" AMOLED", "5000 mAh", "48.0s8.0 MP"}
			
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
