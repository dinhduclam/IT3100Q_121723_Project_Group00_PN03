package struct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeviceList {
	private List<Device> dvList = new ArrayList<Device>();
//	private int amount;
	private double profit;
	
	public List getList() {
		return dvList;
	}
	
	public int size() {
		return dvList.size();
	}
	
	public void add(Device dvAdd) {
		dvList.add(dvAdd);
	}

	public void add(int indx, Device dvAdd) {
		dvList.add(indx, dvAdd);
	}
	
	public void rm(int indx) {
		dvList.remove(indx);
	}
	
	public void modify(int indx, Device dvModify) {
		rm(indx);
		add(indx, dvModify);
	}
	
	public List findMakeandName(String make, String name) {
		List indxList = new ArrayList<>();
		int indx = 0;
		for (Device d : dvList) {
			if (d.getName().contains(name) && d.getMake().contains(make)) indxList.add(indx);
			indx++;
		}
		return indxList;
	}
	
	public void payment(int indx) {
		// return thong tin
		profit += dvList.get(indx).getPrice() - dvList.get(indx).getCostPrice();
		rm(indx);
	}
	
	public void show() {
		for ( Device dv : dvList) {
			dv.show();
		}
	}
	
	public Device getDevice(int indx) {
		return dvList.get(indx);
	}
	
	public double getProfit() {
		return profit;
	}
	
}
