package struct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeviceList {
	private List<Device> dvList = new ArrayList<Device>();
//	private int amount;
	private double profit;
	
	public void add(Device dvAdd) {
		dvList.add(dvAdd);
	}

	public void add(int type, int indx, Device dvAdd) {
		Iterator<Device> itr;
		itr = dvList.iterator();
		int count = 0;
		
		while (itr.hasNext() && indx > 0) {
			Device dvTmp = itr.next();
			if (dvTmp.getType() == type) indx--;
			count++;
		}		
		if (indx==0) dvList.add(count-1, dvAdd);
	}
	
	public void rm(int type, int indx) {
		Iterator<Device> itr;
		itr = dvList.iterator();
		int count = 0;
		
		while (itr.hasNext() && indx > 0) {
			Device dvTmp = itr.next();
			if (dvTmp.getType() == type) indx--;
			count++;
		}		
		if (indx==0) dvList.remove(count-1);
	}
	
	public void modify(int type, int indx, Device dvModify) {
		rm(type, indx);
		add(type, indx, dvModify);
	}
	
	public List findName(String name) {
		List<Device> list = new ArrayList<>();
		for (Device d : dvList) {
			if (d.getName().equals(name)) list.add(d);
		}
		return list;
	}
	
	public List findMake(String make) {
		List<Device> list = new ArrayList<>();
		for (Device d : dvList) {
			if (d.getMake().equals(make)) list.add(d);
		}
		return list;
	}
	
	public void payment(int type, int indx) {
		// return thong tin
		profit += dvList.get(indx).getPrice() - dvList.get(indx).getCostPrice();
		rm(type, indx);
	}
	
	public void show() {
		for ( Device dv : dvList) {
			dv.show();
		}
	}
	
	public static void main(String[] args) {
		DeviceList a = new DeviceList();
		Device l1 = new Laptop("A1", 2016, "Black", "AS", "MNPQ123A", 32.1, 30, 2.5, 8, 100);
		Device p1 = new Phone("B1", 2016, "Black", "AS", "MNPQ123A", 32.3, 30, 6.1, 8, 31);
		Device l2 = new Laptop("A2", 2016, "Black", "AS", "MNPQ123A", 32.5, 30, 2.5, 8, 100);
		Device p2 = new Phone("B2", 2016, "Black", "AS", "MNPQ123A", 32.7, 30, 6.1, 8, 31);
		Device l3 = new Laptop("A3", 2016, "Black", "AS", "MNPQ123A", 32.9, 30, 2.5, 8, 100);
		Device p3 = new Phone("B3", 2016, "Black", "AS", "MNPQ123A", 33, 30, 6.1, 8, 31);
		Device l4 = new Laptop("A4", 2016, "Black", "AS", "MNPQ123A", 34, 30, 2.5, 8, 100);
		Device p4 = new Phone("B4", 2016, "Black", "AS", "MNPQ123A", 35, 30, 6.1, 8, 31);
		a.add(l1);
		a.add(p1);
		a.add(l2);
		a.add(p2);
		a.add(l3);
		a.add(p3);
		a.add(l4);
		a.add(p4);
		a.show();
		System.out.println("---------");
	//	a.rm(1, 2);
//		a.add(1, 2, p3);
		a.payment(0, 2);
		a.payment(0, 1);
		a.payment(1, 4);
		System.out.println(a.profit);
		a.show();
	}
	
	
}
