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

public class Bill extends JFrame{
	Bill(String a[], String []b, String fullName, String address, String phoneNumber){
		setLayout(new BorderLayout());
		
		JPanel pnWest = new JPanel();
		add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		add(pnEast, BorderLayout.EAST);
		
		JLabel title = new JLabel("BILL");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setPreferredSize(new Dimension(0, 50));
		add(title, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 10, 10));
		
		panel.add(new JLabel("Full Name"));
		panel.add(new JLabel(fullName));
		panel.add(new JLabel("Address"));
		panel.add(new JLabel(address));
		panel.add(new JLabel("Phone Number"));
		panel.add(new JLabel(phoneNumber));
		
		int n = a.length;
		for (int i=0; i<n; i++) {
			if (i==6) continue;
			panel.add(new JLabel(a[i]));
			panel.add(new JLabel(b[i]));
		}
		
		JPanel pnSouth = new JPanel();
		pnSouth.setPreferredSize(new Dimension(0, 60));
		add(pnSouth, BorderLayout.SOUTH);
		pnSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
		Button close = new Button(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
			}
		}, "Close");
		close.setPreferredSize(new Dimension(80, 35));
		pnSouth.add(close);
		
		set();
	}
	
	private void set() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setTitle("Fill Infomation");
		setVisible(true);
	}
}
