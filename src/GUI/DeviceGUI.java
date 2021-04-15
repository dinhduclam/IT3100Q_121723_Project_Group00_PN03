package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import struct.*;

class DeviceGUI extends JPanel implements ActionListener, KeyListener {
	private JPanel pnSouth, pnButtonList, pnFillInfor, pnTitle, pnLeft, pnExportAndPayment, pnRight, pnFind;
	private JButton add, update, clear, delete, export, payment, find;
	private JLabel status;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private TextField[] textFields = new TextField[10];
	private TextField makeFind, nameFind;
	
	private String deviceName;
	private int type;
	private int numberOfState;
	private String[] colTitle;
	private DeviceList deviceList = new DeviceList();
	private List indxList = new ArrayList<>();
	
	DeviceGUI(String deviceName, int type, int numberOfState, String[] colTitle) {
		this.deviceName = deviceName;
		this.type = type;
		this.numberOfState = numberOfState;
		this.colTitle = colTitle;
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		createPnLeft();
		/*************/
		JPanel separator = new JPanel();
		separator.setPreferredSize(new Dimension(15, 0));
		add(separator);
		/*************/
		createPnRight();
	}

	private void createPnLeft() {
		pnLeft = new JPanel();
		pnLeft.setLayout(new BorderLayout(0, 0));

		
		/* Set title for the Panel
		 * title is deviceName (a parameter of DeviceGUI contructor) 
		 * Title of object Laptop is LAPTOP
		 * Title of object Phone is PHONE
		 * 
		 */
		pnTitle = new JPanel();
		pnTitle.setPreferredSize(new Dimension(0, 30));
		pnLeft.add(pnTitle, BorderLayout.NORTH);
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel title = new JLabel(deviceName.toUpperCase());
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnTitle.add(title);

		/* Create JPanel to fill in information */
		pnFillInfor = new JPanel();
		pnFillInfor.setLayout(new GridLayout(0, 2, 10, 10));
		
		pnLeft.add(pnFillInfor, BorderLayout.CENTER);
		
		for (int i=0; i<numberOfState; i++) {
			pnFillInfor.add(new JLabel(colTitle[i]));
			textFields[i] = new TextField();
			pnFillInfor.add(textFields[i]);
		}

		/* Create Button */
		pnSouth = new JPanel();
		pnSouth.setLayout(new BorderLayout());
		pnSouth.setPreferredSize(new Dimension(0, 230));

		pnLeft.add(pnSouth, BorderLayout.SOUTH);

		status = new JLabel("");
		status.setPreferredSize(new Dimension(0, 50));
		pnSouth.add(status, BorderLayout.NORTH);

		/* Create 6 buttons: Add, Update, Clear, Delete, Export, Payment
		 * pnButtonList contains 4 buttons: Add, Update, Clear, Delete
		 * 
		 */
		pnButtonList = new JPanel();
		pnButtonList.setLayout(new GridLayout(2, 2, 10, 10));

		pnExportAndPayment = new JPanel();
		pnExportAndPayment.setLayout(new BorderLayout());
		
		JPanel pnExportAndPayment2 = new JPanel();
		pnExportAndPayment2.setLayout(new GridLayout(2, 1, 10, 10));
		pnExportAndPayment2.setPreferredSize(new Dimension(0, 85));
		
		add = new Button(this, "Add");
		update = new Button(this, "Update");
		clear = new Button(this, "Clear");
		delete = new Button(this, "Delete");
		payment = new Button(this, "Payment");
		export = new Button(this, "Export (Excel)", new ImageIcon("src/icon/excel.png"));
		
		pnButtonList.add(add);
		pnButtonList.add(update);
		pnButtonList.add(clear);
		pnButtonList.add(delete);
		
		pnExportAndPayment.add(new JPanel(), BorderLayout.NORTH);
		pnExportAndPayment2.add(payment);
		pnExportAndPayment2.add(export);
		pnExportAndPayment.add(pnExportAndPayment2);
		
		pnSouth.add(pnButtonList);
		pnSouth.add(pnExportAndPayment, BorderLayout.SOUTH);
		/*--------------*/

		add(pnLeft);
	}

	private void createPnRight() {
		pnRight = new JPanel();
		pnRight.setLayout(new BorderLayout());
		
		pnFind = new JPanel();
		pnFind.setLayout(new FlowLayout(FlowLayout.LEADING, 70, 0));
		pnFind.setPreferredSize(new Dimension(0, 40));
		
		pnFind.add(new JLabel("Make:"));
		makeFind = new TextField();
		makeFind.addKeyListener(this);
		pnFind.add(makeFind);
		
		pnFind.add(new JLabel("Name:"));
		nameFind = new TextField();
		nameFind.addKeyListener(this);
		pnFind.add(nameFind);
		pnRight.add(pnFind, BorderLayout.NORTH);
		

		table = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(colTitle);
		table.setModel(tableModel);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(600, 0));
		pnRight.add(scrollPane);

		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				int rowIndx = table.getSelectedRow();
				for (int i=0; i<numberOfState; i++) textFields[i].setText(table.getValueAt(rowIndx, i).toString());
			}
		});
		add(pnRight);
	}
	
	
	// clear all text in the textfield (make, manufacturing year, price, color,...)
	private void clear() {
		for (int i=0; i<numberOfState; i++)
			textFields[i].setText("");
		status.setText("");
	}

	// check
	private boolean check() {
		String noti = "Please fill all the form!";
		for (int i=0; i<numberOfState; i++)
			if (textFields[i].getText().equals("")) {
				textFields[i].requestFocus();
				status.setText(noti);
				return false;
			}
		return true;
	}

	private Device getInfo() {
		String t[] = getInfoReturnString();
		if (type == Device.LAPTOP_TYPE) return new struct.Laptop(t);
		else if (type == Device.PHONE_TYPE) return new struct.Phone(t);
		else return null;
	}
	
	private String[] getInfoReturnString() {
		String t[] = new String[numberOfState];
		for (int i=0; i<numberOfState; i++)
			t[i] = textFields[i].getText();
		return t;
	}
	
	private void load(List indxList) {
		this.indxList = indxList;
		tableModel.setNumRows(0);

		for (Object indx : indxList) {
			tableModel.addRow(deviceList.getDevice((int)indx).getStringArray());
		}
	}
	
//	private void load() {
//		tableModel.setNumRows(0);
//		List<Device> dvList = deviceList.getList(); 
//		for (Device dv : dvList) {
//			tableModel.addRow(dv.getStringArray());
//		}
//	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == add) {
			if (check()) {
				deviceList.add(getInfo());
				tableModel.addRow(getInfoReturnString());
				indxList.add(deviceList.size());
				clear();
			}
			
		}
		else if (arg0.getSource() == clear) {
			clear();
		}
		else if (arg0.getSource() == update) {
			int rowIndx = table.getSelectedRow();
			if (rowIndx < 0) status.setText("Please select the row first!");
			else if (check()) {
				deviceList.modify((int) indxList.get(rowIndx), getInfo());
				for (int i=0; i<numberOfState; i++) table.setValueAt(textFields[i].getText(), (int) indxList.get(rowIndx), i);
			}
		}
		else if (arg0.getSource() == delete) {
			int rowIndx = table.getSelectedRow();
			while (rowIndx >= 0) {
				deviceList.rm((int) indxList.get(rowIndx));
				tableModel.removeRow(rowIndx);
//				indxList.remove(indxList.size()-1);
				rowIndx = table.getSelectedRow();
			}
		}
		else if (arg0.getSource() == export) {
			deviceList.show();
			System.out.println("--------");
			status.setText(String.valueOf(deviceList.getProfit()));
		}
		else if (arg0.getSource() == payment) {
//			int rowIndx = table.getSelectedRow();
//			deviceList.payment(rowIndx);
//			tableModel.removeRow(rowIndx);
//			load(deviceList.findMakeandName("1", ""));
//			load();
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		load(deviceList.findMakeandName(makeFind.getText(), nameFind.getText()));
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
