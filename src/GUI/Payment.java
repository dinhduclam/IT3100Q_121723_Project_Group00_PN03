package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Payment extends JFrame{
	TextField fullName, adress, phoneNumber;
	
	public Payment(String a[], String []b){
		setLayout(new BorderLayout());
		
		JPanel pnWest = new JPanel();
		add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		add(pnEast, BorderLayout.EAST);
		
		JLabel title = new JLabel("INFOMATION");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setPreferredSize(new Dimension(0, 50));
		add(title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		fullName = new TextField();
		adress = new TextField();
		phoneNumber = new TextField();
		
		panel.add(new JLabel("Full Name"));
		panel.add(fullName);
		panel.add(new JLabel("Address"));
		panel.add(adress);
		panel.add(new JLabel("Phone Number"));
		panel.add(phoneNumber);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(0, 60));
		add(pnSouth, BorderLayout.SOUTH);
		pnSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
		Button ok = new Button(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Bill(a, b, fullName.getText(), adress.getText(), phoneNumber.getText());
				dispose();
			}
		}, "OK");
		ok.setPreferredSize(new Dimension(80, 35));
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
