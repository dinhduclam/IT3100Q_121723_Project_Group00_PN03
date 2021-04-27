package struct;

public class Laptop extends Device {
	protected String cpu;
	protected String ram;
	protected String disk;

	public Laptop(String brand, String name, String model, int year, String color, double price, double costPrice,
			String cpu, String ram, String disk) {
		super(brand, name, model, year, color, price, costPrice);
		this.cpu = cpu;
		this.ram = ram;
		this.disk = disk;
	}
	
	public Laptop(String[] t) {
		super(t);
		cpu = t[7];
		ram = t[8];
		disk = t[9];
	}

	public int getType() {
		return LAPTOP_TYPE;
	}
	@Override
	public String[] getStringArray() {
		// TODO Auto-generated method stub
		
		String t[] = new String[Device.LAPTOP_NUMBER_OF_STATE];
		t[0] = super.brand;
		t[1] = super.name;
		t[2] = super.model;
		t[3] = String.valueOf(super.year);
		t[4] = super.color;
		t[5] = String.valueOf(super.price);
		t[6] = String.valueOf(super.costPrice);
		t[7] = cpu;
		t[8] = ram;
		t[9] = disk;
		return t;
	}
	
	
	
}
