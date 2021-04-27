package struct;

import java.util.ArrayList;
import java.util.List;

public class History {
	private static List<Customer> customers = new ArrayList<Customer>();
	private static List<Device> paidList = new ArrayList<Device>();
	private static double profit;
	
	public static void add(Device dv) {
		paidList.add(dv);
		profit += dv.price - dv.costPrice;
	}
	
	public static void add(Customer customer) {
		customers.add(customer);
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static List<Device> getPaidList() {
		return paidList;
	}
	
	public static double getProfit() {
		return Math.round(profit*100)/100;
	}
	
}
