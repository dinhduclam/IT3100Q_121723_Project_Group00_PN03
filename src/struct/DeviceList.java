package struct;

import java.util.ArrayList;
import java.util.List;

public class DeviceList {
	private List<Device> dvList = new ArrayList<Device>();
//	private int amount;
	private static double profit;
	private static List<Device> paidList = new ArrayList<>();
	
	
	public List<Device> getList() {
		return dvList;
	}
	
	public List<Device> getPaidList() {
		return paidList;
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
	
	public List<Integer> searchByMakeAndName(String make, String name) {
		List<Integer> indxList = new ArrayList<>();
		int indx = 0;
		for (Device d : dvList) {
			if (d.getName().toUpperCase().contains(name.toUpperCase()) && d.getMake().toUpperCase().contains(make.toUpperCase())) indxList.add(indx);
			indx++;
		}
		return indxList;
	}
	
	public void pay(int indx) {
		// return thong tin
		profit += dvList.get(indx).getPrice() - dvList.get(indx).getCostPrice();
		paidList.add(dvList.get(indx));
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
		return (double) Math.round(profit*100)/100;
	}
	
}
