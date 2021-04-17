package struct;

public class Laptop extends Device {
	private String cpu;
	private String ram;
	private String disk;

	public Laptop(String make, String name, String model, int year, String color, double price, double costPrice,
			String cpu, String ram, String disk) {
		super(make, name, model, year, color, price, costPrice);
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
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
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
		t[7] = cpu;
		t[8] = ram;
		t[9] = disk;
		return t;
	}
	
	
	
}
