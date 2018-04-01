package hotelManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import javax.swing.JPasswordField;

public class JFrameHotel extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameHotel frame = new JFrameHotel();
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
	
	
	
	public JFrameHotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setToolTipText("Username");
		txtUserName.setBounds(164, 85, 134, 28);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();	
		txtPassword.setToolTipText("Password");
		txtPassword.setBounds(164, 125, 134, 28);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String userName = txtUserName.getText();
				String password = txtPassword.getText();
				
				if(userName.equals("admin") && password.equals("admin")) {
					JOptionPane.showMessageDialog(btnLogin,"You've logged in successfully!");
					JFrameWelcome secondScreen = new JFrameWelcome();
					secondScreen.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(btnLogin,"Something went wrong xD");
				}
					
			
			}
		});
		btnLogin.setBounds(164, 165, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.setBounds(316, 230, 117, 29);
		contentPane.add(btnSignup);
		
		JLabel lblNewLabel = new JLabel("HOTEL MANAGEMENT SYSTEM");
		lblNewLabel.setBounds(134, 22, 197, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setBounds(109, 91, 43, 16);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(79, 131, 69, 16);
		contentPane.add(lblPassword);
		

	}
}
