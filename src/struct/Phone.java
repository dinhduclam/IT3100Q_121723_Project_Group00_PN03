package struct;

public class Phone extends Device{
	protected String screen;
	protected String battery;
	protected String camera;
	
	public Phone(String brand, String name, String model, int year, String color, double price, double costPrice,
			String screen, String battery, String camera) {
		super(brand, name, model, year, color, price, costPrice);
		this.screen = screen;
		this.battery = battery;
		this.camera = camera;
	}

	public Phone(String[] t) {
		super(t);
		screen = t[7];
		battery = t[8];
		camera = t[9];
	}
	
	public int getType() {
		return PHONE_TYPE;
	}
	
	@Override
	public String[] getStringArray() {
		// TODO Auto-generated method stub
		
		String t[] = new String[Device.PHONE_NUMBER_OF_STATE];
		t[0] = super.brand;
		t[1] = super.name;
		t[2] = super.model;
		t[3] = String.valueOf(super.year);
		t[4] = super.color;
		t[5] = String.valueOf(super.price);
		t[6] = String.valueOf(super.costPrice);
		t[7] = screen;
		t[8] = battery;
		t[9] = camera;
		return t;
	}
	
}
