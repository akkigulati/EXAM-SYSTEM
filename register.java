package project;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("REGISTER");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(77, 38, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setBounds(77, 88, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(77, 138, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(173, 32, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 85, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(173, 135, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(173, 190, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME=textField.getText().toString();
				String USERNAME=textField_1.getText().toString();
				String PASSWORD=textField_2.getText().toString();
               try{
            	   
            	   Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
					PreparedStatement pd=con.prepareStatement("insert into details values(?,?,?)");
					pd.setString(1, NAME);
					pd.setString(2, USERNAME);
					pd.setString(3, PASSWORD);
					int i=pd.executeUpdate();
					if(i>0)
					{
						lblNewLabel_3.setText("Account created!");
						
					}
            	   
            	   
            	   
               }
				catch(Exception ex)
               {System.out.println(ex);
               }
               }
				
				
			}
		);
		btnNewButton.setBounds(122, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				WELCOME.main(new String[]{});
				
			}
		});
		btnBack.setBounds(253, 215, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
		
		
		
	}
}
