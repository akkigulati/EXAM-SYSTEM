package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBox;

public class User {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
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
	public User() {
		
		initialize();
		}
		
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("USER");
		frame.setBounds(100, 100, 644, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBack = new JButton("LOGOUT");
		btnBack.setBounds(349, 11, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login.main(new String[]{});
				
				
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBack);
		
		
		JLabel lblNewLabel = new JLabel("HELLO USER");
		lblNewLabel.setBounds(10, 11, 80, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Q1.switch(x) \r\n{ \r\n    default:  \r\n        System.out.println(\"Hello\"); \r\n}\r\n");
		lblNewLabel_1.setBounds(10, 35, 428, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Q2. \r\nWhich class does not override the equals() and hashCode() methods, inheriting them directly from class Object?");
		lblNewLabel_2.setBounds(10, 132, 608, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Q3) public class Test { } \r\nWhat is the prototype of the default constructor?");
		lblNewLabel_3.setBounds(10, 197, 561, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Q4.Which one creates an instance of an array?");
		lblNewLabel_4.setBounds(10, 256, 270, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Q5. \t\r\nWhich two cause a compiler error?\r\n\r\n");
		lblNewLabel_5.setBounds(10, 307, 608, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1 and 3");
		chckbxNewCheckBox.setBounds(10, 92, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2 and 4");
		chckbxNewCheckBox_1.setBounds(168, 92, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("java.lang.String");
		chckbxNewCheckBox_2.setBounds(10, 153, 131, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("java.lang.StringBuffer");
		chckbxNewCheckBox_3.setBounds(168, 153, 169, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Test( )");
		chckbxNewCheckBox_4.setBounds(10, 218, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("public Test( )");
		chckbxNewCheckBox_5.setBounds(168, 218, 141, 23);
		frame.getContentPane().add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("int[ ] ia = new int[15];\t");
		chckbxNewCheckBox_6.setBounds(10, 277, 156, 23);
		frame.getContentPane().add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("int ia[ ] [ ] = { 4, 5, 6 }, { 1,2,3 };");
		chckbxNewCheckBox_7.setBounds(168, 277, 215, 23);
		frame.getContentPane().add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("1, 2\t");
		chckbxNewCheckBox_8.setBounds(10, 365, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("2, 4");
		chckbxNewCheckBox_9.setBounds(168, 365, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_9);
		
		JLabel lblScore = new JLabel("");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScore.setBounds(408, 434, 163, 52);
		frame.getContentPane().add(lblScore);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int score=0;
				if(chckbxNewCheckBox.isSelected()==true)
				{
					score=score+2;	
				}
				else if(chckbxNewCheckBox_1.isSelected()==true)
				{
					score=score-1;
					
				}
				 if(chckbxNewCheckBox_3.isSelected()==true)
				{
					score=score+2;	
				}
				else if(chckbxNewCheckBox_2.isSelected()==true)
				{
					score=score-1;
					
				}
				 
				 if(chckbxNewCheckBox_5.isSelected()==true)
					{
						score=score+2;	
					}
					else if(chckbxNewCheckBox_4.isSelected()==true)
					{
						score=score-1;
						
					}
				 if(chckbxNewCheckBox_6.isSelected()==true)
					{
						score=score+2;	
					}
					else if(chckbxNewCheckBox_7.isSelected()==true)
					{
						score=score-1;
						
					}
				 
				 if(chckbxNewCheckBox_8.isSelected()==true)
					{
						score=score+2;	
					}
					else if(chckbxNewCheckBox_9.isSelected()==true)
					{
						score=score-1;
						
					}
				 
				 
				 lblScore.setText("SCORE:"+score);
				 
				
				
				
				
				
			}
		});
		btnSubmit.setBounds(141, 442, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Which two are acceptable types for x?:\r\n 1)byte\r\n 2)long\r\n 3)char\r\n 4)float\r\n 5)Short\r\n 6)Long");
		lblNewLabel_6.setBounds(10, 66, 546, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(" 1)float[ ] f = new float(3);\r\n 2)float f2[ ] = new float[ ];\r\n 3)float[ ]f1 = new float[3];\r\n");
		lblNewLabel_7.setBounds(10, 332, 618, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(" 4)float f3[ ] = new float[3];\r\n 5)float f5[ ] = {1.0f, 2.0f, 2.0f};");
		lblNewLabel_8.setBounds(10, 344, 395, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
