package struct;

public class Phone extends Device{
	private double screen;
	private double battery;
	private double camera;
	private final int TYPE_OF_PHONE = 1;
	
	public Phone(String make, int year, String color, String name, String model, double price, double costPrice,
			double screen, double battery, double camera) {
		super(make, year, color, name, model, price, costPrice);
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
		return TYPE_OF_PHONE;
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
	
}
