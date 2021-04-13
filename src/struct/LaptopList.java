package struct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class LaptopList{
	private List<Laptop> lt = new ArrayList();
	private int amount;
	private double profit;
	
	public void add(Laptop ltAdd) {
		lt.add(ltAdd);		
	}
	
	public void remove(int indx) {
		lt.remove(indx);
	}
	
	public void modify(Laptop ltModify, int indx) {
		lt.remove(indx);
		lt.add(indx, ltModify);
	}
	
	public void findName(String name) {
		
	}
	
	public void findMake(String make) {
		
	}
	
	public void payment(int indx) {
		// return thong tin
		profit += lt.get(indx).getPrice() - lt.get(indx).getCostPrice();
		remove(indx);
	}
	
}
