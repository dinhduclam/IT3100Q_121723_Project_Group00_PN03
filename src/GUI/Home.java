package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class Home extends JFrame implements ActionListener {
	private JButton btLaptop, btPhone;
	private JPanel pnChoose, pnCenter, cardDevice, laptop;
	CardLayout card;

	Home() {
		// TODO Auto-generated constructor stub
		window();
		String[] colTitle = { "Make", "Year", "Color", "Name", "Model", "Price", "Cost Price", "CPU", "RAM", "Disk" };
		laptop = new Laptop("laptop", 10, colTitle);
		
		pnCenter = new JPanel();
		cardDevice = new JPanel();
		card = new CardLayout(15, 15);
		cardDevice.setLayout(card);

		cardDevice.add("laptop", laptop);

		pnCenter.setLayout(new BorderLayout());
		pnCenter.add(cardDevice, BorderLayout.CENTER);
		add(pnCenter);
		set();
	}

	private void window() {
		pnChoose = new JPanel();
		pnChoose.setPreferredSize(new Dimension(130, 10));
		pnChoose.setBackground(SystemColor.activeCaption);
		add(pnChoose, BorderLayout.WEST);
		pnChoose.setLayout(null);

		JLabel welcome = new JLabel("WELCOME!");
		welcome.setBounds(0, 2, 130, 64);
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 14));
		pnChoose.add(welcome);

		btLaptop = new JButton("Laptop");
		btLaptop.setForeground(SystemColor.info);
		btLaptop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btLaptop.setBackground(SystemColor.activeCaptionBorder);
		btLaptop.setBounds(0, 89, 130, 47);
		btLaptop.setBorder(null);
		pnChoose.add(btLaptop);
		//btLaptop.addActionListener(this);

		btPhone = new JButton("Smartphone");
		btPhone.setForeground(SystemColor.info);
		btPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btPhone.setBackground(SystemColor.activeCaption);
		btPhone.setBounds(0, 132, 130, 47);
		btPhone.setBorder(null);
		pnChoose.add(btPhone);
	//	btPhone.addActionListener(this);

		JLabel lbTitle = new JLabel("DEVICE MANAGEMENT");
		lbTitle.setFont(new Font("Tahoma", Font.BOLD, 18));

		JPanel pnTitle = new JPanel();
		pnTitle.setBackground(SystemColor.activeCaption);
		pnTitle.add(lbTitle);
		add(pnTitle, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		btLaptop.setBackground(SystemColor.activeCaption);
		btPhone.setBackground(SystemColor.activeCaption);
		
		if (arg0.getSource() == btLaptop) {
			card.show(cardDevice, "laptop");
			btLaptop.setBackground(SystemColor.activeCaptionBorder);
		} else if (arg0.getSource() == btPhone) {
			card.show(cardDevice, "phone");
			btPhone.setBackground(SystemColor.activeCaptionBorder);
		}

	}

	private void set() {
		setSize(1100, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Device Management");
	}
	
	public static void main(String[] args) {
		new Home();
	}
}