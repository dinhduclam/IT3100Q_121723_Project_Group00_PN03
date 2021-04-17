package struct;

public class Phone extends Device{
	private String screen;
	private String battery;
	private String camera;
	
	public Phone(String make, String name, String model, int year, String color, double price, double costPrice,
			String screen, String battery, String camera) {
		super(make, name, model, year, color, price, costPrice);
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

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	public void show() {
		super.show();
		System.out.println(screen + " " + battery + " PHONE");
	}
	
	@Override
	public String[] getStringArray() {
		// TODO Auto-generated method stub
		
		String t[] = new String[Device.PHONE_NUMBER_OF_STATE];
		t[0] = super.getMake();
		t[1] = super.getName();
		t[2] = super.getModel();
		t[3] = String.valueOf(super.getYear());
		t[4] = super.getColor();
		t[5] = String.valueOf(super.getPrice());
		t[6] = String.valueOf(super.getCostPrice());
		t[7] = screen;
		t[8] = battery;
		t[9] = camera;
		return t;
	}
	
}
