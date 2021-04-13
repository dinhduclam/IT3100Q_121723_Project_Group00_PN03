package struct;

class Laptop extends Device {
	private double cpu;
	private double ram;
	private double disk;
	private final int TYPE_OF_LAPTOP = 0;

	public Laptop(String make, int year, String color, String name, String model, double price, double costPrice,
			double cpu, double ram, double disk) {
		super(make, year, color, name, model, price, costPrice);
		this.cpu = cpu;
		this.ram = ram;
		this.disk = disk;
	}

	public int getType() {
		return TYPE_OF_LAPTOP;
	}
	
	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getDisk() {
		return disk;
	}

	public void setDisk(double disk) {
		this.disk = disk;
	}

	public void show() {
		super.show();
		System.out.println(cpu + " " + ram + " LAP");
	}
	
}
