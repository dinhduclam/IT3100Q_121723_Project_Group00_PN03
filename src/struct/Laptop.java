package struct;

public class Laptop extends Device {
	private double cpu;
	private double ram;
	private double disk;

	public Laptop(String make, String name, String model, int year, String color, double price, double costPrice,
			double cpu, double ram, double disk) {
		super(make, name, model, year, color, price, costPrice);
		this.cpu = cpu;
		this.ram = ram;
		this.disk = disk;
	}
	
	public Laptop(String[] t) {
		super(t);
		cpu = Double.parseDouble(t[7]);
		ram = Double.parseDouble(t[8]);
		disk = Double.parseDouble(t[9]);
	}

	public int getType() {
		return LAPTOP_TYPE;
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

	@Override
	public String[] getStringArray() {
		// TODO Auto-generated method stub
		
		String t[] = new String[Device.LAPTOP_NUMBER_OF_STATE];
		t[0] = super.getMake();
		t[1] = super.getName();
		t[2] = super.getModel();
		t[3] = String.valueOf(super.getYear());
		t[4] = super.getColor();
		t[5] = String.valueOf(super.getPrice());
		t[6] = String.valueOf(super.getCostPrice());
		t[7] = String.valueOf(cpu);
		t[8] = String.valueOf(ram);
		t[9] = String.valueOf(disk);
		return t;
	}
	
	
	
}
