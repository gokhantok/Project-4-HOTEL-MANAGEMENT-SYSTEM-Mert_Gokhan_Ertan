package hotelManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import java.awt.TextField;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;

public class JFrameWelcome extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstname;
	private JTextField txtLastName;
	private JTextField txtPhone;
	private JTextField txtMail;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtTotal;
	private JTextField textField_4;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtRoom;
	private JTextField textField_16;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameWelcome frame = new JFrameWelcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameWelcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setEnabled(false);
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(31, 20, 319, 282);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setBounds(90, 5, 139, 16);
		panel.add(lblCustomerInformation);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setBounds(6, 44, 76, 16);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(6, 78, 76, 16);
		panel.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(6, 113, 61, 16);
		panel.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(6, 175, 61, 16);
		panel.add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(6, 203, 61, 16);
		panel.add(lblEmail);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(90, 38, 134, 28);
		panel.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(90, 72, 134, 28);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		JTextPane txtAddress = new JTextPane();
		txtAddress.setBounds(94, 113, 207, 41);
		panel.add(txtAddress);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(90, 169, 134, 28);
		panel.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setBounds(90, 197, 134, 28);
		panel.add(txtMail);
		txtMail.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(399, 20, 352, 306);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPaymentInformation = new JLabel("Payment Information");
		lblPaymentInformation.setBounds(107, 6, 131, 16);
		panel_1.add(lblPaymentInformation);
		
		JLabel lblPayMethod = new JLabel("Pay Method:");
		lblPayMethod.setBounds(16, 43, 76, 16);
		panel_1.add(lblPayMethod);
		
		JLabel lblNameOnCard = new JLabel("Name on Card");
		lblNameOnCard.setBounds(16, 71, 98, 16);
		panel_1.add(lblNameOnCard);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(16, 94, 83, 16);
		panel_1.add(lblCardNumber);
		
		JLabel lblSecurityCode = new JLabel("Security Code");
		lblSecurityCode.setBounds(16, 119, 86, 16);
		panel_1.add(lblSecurityCode);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date");
		lblExpirationDate.setBounds(16, 147, 97, 16);
		panel_1.add(lblExpirationDate);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(16, 173, 52, 16);
		panel_1.add(lblSubtotal);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setBounds(16, 198, 57, 16);
		panel_1.add(lblDiscount);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(16, 226, 23, 16);
		panel_1.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(16, 255, 32, 16);
		panel_1.add(lblTotal);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 65, 134, 28);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 88, 134, 28);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 113, 134, 28);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(162, 141, 134, 28);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(162, 167, 134, 28);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(162, 192, 134, 28);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(162, 220, 134, 28);
		panel_1.add(textField_11);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(162, 249, 134, 28);
		panel_1.add(txtTotal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "ATM CARD"}));
		comboBox.setBounds(162, 34, 134, 27);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(31, 336, 319, 455);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblGeneralInformation = new JLabel("General Information");
		lblGeneralInformation.setBounds(93, 6, 133, 16);
		panel_2.add(lblGeneralInformation);
		
		JLabel lblCode = new JLabel("Check In");
		lblCode.setBounds(6, 56, 81, 16);
		panel_2.add(lblCode);
		
		JLabel lblCheckOut = new JLabel("Check Out\n");
		lblCheckOut.setBounds(6, 84, 81, 16);
		panel_2.add(lblCheckOut);
		
		JLabel lblNights = new JLabel("Nights");
		lblNights.setBounds(6, 112, 61, 16);
		panel_2.add(lblNights);
		
		JLabel lblRooms = new JLabel("Room");
		lblRooms.setBounds(6, 140, 61, 16);
		panel_2.add(lblRooms);
		
		JLabel lblBookTime = new JLabel("Book Time");
		lblBookTime.setBounds(6, 168, 81, 16);
		panel_2.add(lblBookTime);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("CheckIn");
		textField_4.setBounds(123, 50, 134, 28);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(123, 78, 134, 28);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(123, 106, 134, 28);
		panel_2.add(textField_14);
		
		txtRoom = new JTextField();
		txtRoom.setColumns(10);
		txtRoom.setBounds(123, 134, 134, 28);
		panel_2.add(txtRoom);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(123, 162, 134, 28);
		panel_2.add(textField_16);
		
		JLabel lblNotes = new JLabel("Adults\t");
		lblNotes.setBounds(6, 196, 61, 16);
		panel_2.add(lblNotes);
		
		JLabel lblChildren = new JLabel("Children");
		lblChildren.setBounds(6, 224, 61, 16);
		panel_2.add(lblChildren);
		
		JSpinner numberChildren = new JSpinner();
		numberChildren.setBounds(123, 218, 37, 28);
		panel_2.add(numberChildren);
		
		JSpinner numberAdult = new JSpinner();
		numberAdult.setBounds(123, 190, 37, 28);
		panel_2.add(numberAdult);
		
		JLabel lblNotes_1 = new JLabel("Notes");
		lblNotes_1.setBounds(6, 252, 61, 16);
		panel_2.add(lblNotes_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 280, 307, 129);
		panel_2.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(399, 336, 455, 455);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRoomAndGuests = new JLabel("Room and Guests Informations");
		lblRoomAndGuests.setBounds(6, 18, 235, 27);
		panel_3.add(lblRoomAndGuests);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(50, 205, 50));
		btnAdd.setBounds(6, 44, 83, 29);
		panel_3.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBackground(Color.ORANGE);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setBounds(85, 44, 75, 29);
		panel_3.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		
		btnDelete.setBounds(162, 44, 75, 29);
		panel_3.add(btnDelete);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 96, 428, 301);
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		Object [] columns = {"Room","Guest","Telephone","Adults","Children","Rate"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		
		Object[] row = new Object[6];
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				row[0] = txtRoom.getText();
				row[1] = txtFirstname.getText()+" "+txtLastName.getText();
				row[2] = txtPhone.getText();
				row[3] = numberAdult.getValue();
				row[4] = numberChildren.getValue();
				row[5] = txtTotal.getText();	
				
				model.addRow(row);
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					model.removeRow(i);
				}
				else {
					System.out.println("Delete Error");
				}
			}
		});
		
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int i = table.getSelectedRow();
				txtRoom.setText(model.getValueAt(i, 0).toString());
				txtFirstname.setText(model.getValueAt(i, 1).toString());
				txtPhone.setText(model.getValueAt(i, 2).toString());
				numberAdult.setValue(model.getValueAt(i, 3));
				numberChildren.setValue(model.getValueAt(i, 4));
				txtTotal.setText(model.getValueAt(i, 5).toString());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
		
		
		

	}
}
