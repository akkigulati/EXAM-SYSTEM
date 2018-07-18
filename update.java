package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class update {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update window = new update();
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
	public update() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("UPDATE");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(42, 67, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblEnterUserName = new JLabel("USERNAME");
		lblEnterUserName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEnterUserName.setBounds(52, 11, 147, 35);
		frame.getContentPane().add(lblEnterUserName);
		
		textField = new JTextField();
		textField.setBounds(253, 18, 132, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIncorrect = new JLabel("");
		lblIncorrect.setBounds(52, 187, 86, 35);
		frame.getContentPane().add(lblIncorrect);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(253, 64, 132, 20);
		frame.getContentPane().add(passwordField);
		
	

		JButton btnContinue = new JButton("UPDATE");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText().toString();
				String password=passwordField.getText().toString();
				String NEW=passwordField_1.getText().toString();
				try{ Class.forName("com.mysql.jdbc.Driver");	
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
					PreparedStatement pd=con.prepareStatement("update details  set password=? where username=? and password=?");
					pd.setString(1,NEW);	
					pd.setString(2, username);
					pd.setString(3,password);
					
                   int i=pd.executeUpdate();
                 if(i>0)
						
                 {
                	 lblIncorrect.setText("UPDATED!");
                	 
                 }
                 
                 else
                 {lblIncorrect.setText("TRY AGAIN!");
                 }
                 
                 }
				
				
				catch(Exception ex)
				{System.out.println(ex);
				
				}
				
				
				
				
			}
		});
		btnContinue.setBounds(263, 168, 111, 23);
		frame.getContentPane().add(btnContinue);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WELCOME.main(new String[]{});
			}
		});
		btnNewButton.setBounds(263, 213, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("CURRENT PASSWORD");
		lblNewLabel.setBounds(52, 67, 147, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterNewPassword = new JLabel("NEW PASSWORD\r\n\r\n");
		lblEnterNewPassword.setBounds(53, 114, 111, 14);
		frame.getContentPane().add(lblEnterNewPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(253, 111, 132, 20);
		frame.getContentPane().add(passwordField_1);
		
		
		
	}
}