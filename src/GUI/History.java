package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import struct.Device;
import struct.DeviceList;

public class History extends JPanel{

	private JTable tableLaptop, tablePhone;
	private DefaultTableModel tableModelLaptop, tableModelPhone;
	DeviceList dvList = new DeviceList();
	private List<Device> paidList = dvList.getPaidList();
	
	public History() {
		// TODO Auto-generated constructor stub
		
		setLayout(new BorderLayout(0, 10));
		
		JLabel title = new JLabel("HISTORY");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setPreferredSize(new Dimension(0, 40));
		add(title, BorderLayout.NORTH);
		
		JPanel pn2Table = new JPanel();
		add(pn2Table, BorderLayout.CENTER);
		pn2Table.setLayout(new BoxLayout(pn2Table, BoxLayout.X_AXIS));
		
		/* 
		 * Table Laptop 
		 */
		
		JPanel pnLaptop = new JPanel();
		pnLaptop.setLayout(new BorderLayout());
		
		JLabel titleLaptop = new JLabel("LAPTOP");
		titleLaptop.setHorizontalAlignment(SwingConstants.CENTER);
		titleLaptop.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleLaptop.setPreferredSize(new Dimension(0, 30));
		pnLaptop.add(titleLaptop, BorderLayout.NORTH);
		
		JScrollPane scrollPaneLaptop = new JScrollPane();
		pnLaptop.add(scrollPaneLaptop);
		pn2Table.add(pnLaptop);
		
		String t[] = {"Make", "Name", "Model", "Price", "Cost Price", "PROFIT"};
		tableModelLaptop = new DefaultTableModel();
		tableModelLaptop.setColumnIdentifiers(t);
		
		tableLaptop = new JTable();
		tableLaptop.setModel(tableModelLaptop);
		scrollPaneLaptop.setViewportView(tableLaptop);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(20, 0));
		pn2Table.add(separator);
		
		/*  
		 * Table Phone
		 */
		
		JPanel pnPhone = new JPanel();
		pnPhone.setLayout(new BorderLayout());
		
		JLabel titlePhone = new JLabel("SMART PHONE");
		titlePhone.setHorizontalAlignment(SwingConstants.CENTER);
		titlePhone.setFont(new Font("Tahoma", Font.BOLD, 16));
		titlePhone.setPreferredSize(new Dimension(0, 30));
		pnPhone.add(titlePhone, BorderLayout.NORTH);
		
		JScrollPane scrollPanePhone = new JScrollPane();
		pnPhone.add(scrollPanePhone);
		pn2Table.add(pnPhone);
		
		tableModelPhone = new DefaultTableModel();
		tableModelPhone.setColumnIdentifiers(t);
		
		tablePhone = new JTable();
		tablePhone.setModel(tableModelPhone);
		scrollPanePhone.setViewportView(tablePhone);	
		
		/*
		 * "Load" button and profit notification 
		 */
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(0, 60));
		pnSouth.setLayout(new BorderLayout(0, 10));
		add(pnSouth, BorderLayout.SOUTH);
		
		JLabel status = new JLabel("  ");
		pnSouth.add(status, BorderLayout.NORTH);		
		
		Button btLoad = new Button(Button.NOMAL_BUTTON, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				load();
				status.setText("Total Profit: " + String.valueOf(dvList.getProfit()) + " VND");
			}
		}, "Load");
		pnSouth.add(btLoad);
	}
	
	private void load() {
		tableModelLaptop.setNumRows(0);
		tableModelPhone.setNumRows(0);

		for (Device dv : paidList) {
			String s[] = dv.getStringArray();
			double profit = Double.parseDouble(s[5]) - Double.parseDouble(s[6]);
			String t[] = {s[0], s[1], s[2] , s[5], s[6], String.valueOf(profit)};
			if (dv.getType() == Device.LAPTOP_TYPE) {
				tableModelLaptop.addRow(t);
			}
			else {
				tableModelPhone.addRow(t);
			}
		}
	}

}
