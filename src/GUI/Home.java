package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import struct.Device;

public class Home extends JFrame implements ActionListener {
	private Button btLaptop, btPhone, btHistory;
	private JPanel pnChoose, pnCenter, cardDevice, laptop, phone, history;
	private CardLayout card;

	public Home() {
		// TODO Auto-generated constructor stub
		window();
		laptop = new DeviceGUI("laptop", Device.LAPTOP_TYPE, Device.LAPTOP_NUMBER_OF_STATE, Device.LAPTOP_COLUMN_TITLE);
		phone = new DeviceGUI("smart phone", Device.PHONE_TYPE, Device.PHONE_NUMBER_OF_STATE, Device.PHONE_COLUMN_TITLE);
		history = new History();
		
		pnCenter = new JPanel();
		cardDevice = new JPanel();
		card = new CardLayout(15, 15);
		cardDevice.setLayout(card);

		cardDevice.add("laptop", laptop);
		cardDevice.add("phone", phone);
		cardDevice.add("history", history);
		
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

		btLaptop = new Button(Button.CHOOSE_BUTTON, this, "Laptop");
		btLaptop.setBackground(SystemColor.activeCaptionBorder);
		btLaptop.setBounds(0, 90, 130, 47);
		pnChoose.add(btLaptop);
		
		btPhone = new Button(Button.CHOOSE_BUTTON, this, "Smartphone");
		btPhone.setBounds(0, 137, 130, 47);
		pnChoose.add(btPhone);
		
		btHistory = new Button(Button.CHOOSE_BUTTON, this, "History");
		btHistory.setBounds(0, 570, 130, 47);
		pnChoose.add(btHistory);
		
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
		btHistory.setBackground(SystemColor.activeCaption);
		
		if (arg0.getSource() == btLaptop) {
			card.show(cardDevice, "laptop");
			btLaptop.setBackground(SystemColor.activeCaptionBorder);
		} else if (arg0.getSource() == btPhone) {
			card.show(cardDevice, "phone");
			btPhone.setBackground(SystemColor.activeCaptionBorder);
		}
		else if (arg0.getSource() == btHistory) {
			card.show(cardDevice, "history");
			btHistory.setBackground(SystemColor.activeCaptionBorder);
		}

	}

	private void set() {
		setSize(1200, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Device Management");
	}
}