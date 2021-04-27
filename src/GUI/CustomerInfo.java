package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import struct.Customer;
import struct.History;

public class CustomerInfo extends JFrame{
	TextField fullName, address, phoneNumber;
	
	public CustomerInfo(String a[], String []b){
		setLayout(new BorderLayout(0, 10));
		
		JPanel pnWest = new JPanel();
		add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		add(pnEast, BorderLayout.EAST);
		
		JLabel title = new JLabel("INFOMATION");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setPreferredSize(new Dimension(0, 40));
		add(title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		fullName = new TextField();
		address = new TextField();
		phoneNumber = new TextField();
		
		panel.add(new JLabel("Full Name"));
		panel.add(fullName);
		panel.add(new JLabel("Address"));
		panel.add(address);
		panel.add(new JLabel("Phone Number"));
		panel.add(phoneNumber);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(0, 50));
		add(pnSouth, BorderLayout.SOUTH);
		pnSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
		Button ok = new Button(Button.NOMAL_BUTTON, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				History.add(new Customer(fullName.getText(), address.getText(), phoneNumber.getText()));
				new Bill(a, b, fullName.getText(), address.getText(), phoneNumber.getText());
				dispose();
			}
		}, "OK");
		ok.setPreferredSize(new Dimension(100, 32));
		pnSouth.add(ok);
		
		set();
	}
	
	private void set() {
		setSize(350, 250);
		setLocationRelativeTo(null);
		setTitle("Fill Infomation");
		setVisible(true);
	}
	
	
}
