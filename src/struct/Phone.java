package struct;

public class Phone extends Device{
	private double screen;
	private double battery;
	private double camera;
	
	public Phone(String make, String name, String model, int year, String color, double price, double costPrice,
			double screen, double battery, double camera) {
		super(make, name, model, year, color, price, costPrice);
		this.screen = screen;
		this.battery = battery;
		this.camera = camera;
	}

	public Phone(String[] t) {
		super(t);
		screen = Double.parseDouble(t[7]);
		battery = Double.parseDouble(t[8]);
		camera = Double.parseDouble(t[9]);
	}
	
	public int getType() {
		return PHONE_TYPE;
	}

	public double getScreen() {
		return screen;
	}

	public void setScreen(double screen) {
		this.screen = screen;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public double getCamera() {
		return camera;
	}

	public void setCamera(double camera) {
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
		t[7] = String.valueOf(screen);
		t[8] = String.valueOf(battery);
		t[9] = String.valueOf(camera);
		return t;
	}
	
}
