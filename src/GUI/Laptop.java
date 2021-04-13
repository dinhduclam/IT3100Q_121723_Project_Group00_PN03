package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

class Laptop extends JPanel implements ActionListener {
	private JPanel pnSouth, pnButtonList, pnFillInfor, pnTitle, pnLeft, pnExportExcel;
	
	private JButton add, update, clear, delete, export;
	private JLabel status;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private Object[] row = new Object[10];
	private String[] colTitle;
	private int numberOfState;
	private String deviceName;
	private TextField[] textFields = new TextField[10];
	
	
	Laptop(String deviceName, int numberOfState, String[] colTitle) {
		this.colTitle = colTitle;
		this.numberOfState = numberOfState;
		this.deviceName = deviceName;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		createPnLeft(); // pnRight is table
		/*************/
		JPanel separator = new JPanel();
		separator.setPreferredSize(new Dimension(15, 0));
		add(separator);
		/*************/
		createTable();
	}

	private void createTable() {
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(600, 2));

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				int rowIndx = table.getSelectedRow();
				
			}
		});
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(colTitle);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		add(scrollPane);
	}

	private void createPnLeft() {
		pnLeft = new JPanel();
		pnLeft.setLayout(new BorderLayout(0, 0));

		pnTitle = new JPanel();
		pnTitle.setPreferredSize(new Dimension(0, 30));
		pnLeft.add(pnTitle, BorderLayout.NORTH);
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel title = new JLabel(deviceName.toUpperCase());
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnTitle.add(title);

		/* Create JPanel to fill in information */
		
		
		pnFillInfor = new JPanel();
		pnLeft.add(pnFillInfor, BorderLayout.CENTER);
		pnFillInfor.setLayout(new GridLayout(0, 2, 10, 10));
		
		System.out.println(numberOfState);
		for (int i=0; i<numberOfState; i++) {
			pnFillInfor.add(new JLabel(colTitle[i]));
			textFields[i] = new TextField();
			pnFillInfor.add(textFields[i]);
		}

		
		/*--------------*/
		/* Button */
		pnSouth = new JPanel();
		pnSouth.setLayout(new BorderLayout());
		pnSouth.setPreferredSize(new Dimension(0, 180));

		pnLeft.add(pnSouth, BorderLayout.SOUTH);

		status = new JLabel("");
		status.setPreferredSize(new Dimension(0, 50));
		pnSouth.add(status, BorderLayout.NORTH);

		// create button (add, update, clear, delete)
		pnButtonList = new JPanel();
		pnButtonList.setLayout(new GridLayout(2, 2, 10, 10));
		pnSouth.add(pnButtonList);

		add = new JButton("Add");
		add.addActionListener(this);
		add.setContentAreaFilled(false);
		pnButtonList.add(add);

		update = new JButton("Update");
		update.addActionListener(this);
		update.setContentAreaFilled(false);
		pnButtonList.add(update);

		clear = new JButton("Clear");
		clear.addActionListener(this);
		clear.setContentAreaFilled(false);
		pnButtonList.add(clear);

		delete = new JButton("Delete");
		delete.addActionListener(this);
		delete.setContentAreaFilled(false);
		pnButtonList.add(delete);

		pnExportExcel = new JPanel();
		pnExportExcel.setLayout(new BorderLayout());
		pnExportExcel.add(new JPanel(), BorderLayout.NORTH);

		export = new JButton("Export (Excel)");
		export.addActionListener(this);
		export.setPreferredSize(new Dimension(0, 36));
		export.setContentAreaFilled(false);
		ImageIcon excel = new ImageIcon("src/icon/excel.png");
		export.setIcon(excel);
		pnExportExcel.add(export);

		pnSouth.add(pnExportExcel, BorderLayout.SOUTH);
		/*--------------*/

		add(pnLeft);

	}

	// clear all text in the textfield (make, manufacturing year, price, color,...)
	private void clear() {
		for (int i=0; i<numberOfState; i++)
			textFields[i].setText("");;
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

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
