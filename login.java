package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblTryAgain;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("LOGIN");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(100, 52, 123, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(100, 116, 94, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(233, 49, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(233, 113, 86, 20);
		frame.getContentPane().add(passwordField);
		
		lblTryAgain = new JLabel("");
		lblTryAgain.setBounds(233, 160, 76, 14);
		frame.getContentPane().add(lblTryAgain);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String USERNAME=textField.getText().toString();
				
				String PASSWORD=passwordField.getText().toString();
				try{
					  
	            	   Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
						PreparedStatement pd=con.prepareStatement("select * from details where username=? and password=?");
						
						
						pd.setString(1, USERNAME);
						pd.setString(2, PASSWORD);
						ResultSet rs=pd.executeQuery();
					Boolean i=rs.next();
					
					 if(i==true&&USERNAME.equals("akshaygulati")&&PASSWORD.equals("akshaygulati"))
					 {
						 admin.main(new String[]{});
					 }
					 else if(i==true)
					 {
						 User.main(new String[]{});
					 }
					 
					 else
					 {		
							lblTryAgain.setText("try again!");}
					 
					
				}
				catch(Exception ex)
				{System.out.println(ex);
				
				}
				
				
				
				
			}
		});
		btnLogin.setBounds(157, 212, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			WELCOME.main(new String[]{});
			
			}
			
			
			
		});
		btnBack.setBounds(269, 212, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
	}
}
