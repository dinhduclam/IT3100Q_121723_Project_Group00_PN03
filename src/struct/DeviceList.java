package struct;

import java.util.ArrayList;
import java.util.List;

public class DeviceList {
	private List<Device> dvList = new ArrayList<Device>();
	
	public List<Device> getList() {
		return dvList;
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
	
	public List<Integer> searchByBrandAndName(String make, String name) {
		List<Integer> indxList = new ArrayList<>();
		int indx = 0;
		for (Device d : dvList) {
			if (d.name.toUpperCase().contains(name.toUpperCase()) && d.brand.toUpperCase().contains(make.toUpperCase())) indxList.add(indx);
			indx++;
		}
		return indxList;
	}
	
	public void pay(int indx) {
		// return thong tin
		History.add(dvList.get(indx));
		rm(indx);
	}
	
	public Device getDevice(int indx) {
		return dvList.get(indx);
	}
	
}
