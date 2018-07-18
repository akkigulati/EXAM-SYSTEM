package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class WELCOME {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOME window = new WELCOME();
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
	public WELCOME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("WELCOME");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblWelcome.setBounds(90, 28, 201, 43);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnRegistration = new JButton("REGISTER");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				register.main(new String[]{});
				
				
				
			}
		});
		btnRegistration.setBounds(100, 92, 107, 34);
		frame.getContentPane().add(btnRegistration);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login1.main(new String[]{});
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(100, 137, 107, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update.main(new String[]{});
				
			}
		});
		btnNewButton_1.setBounds(100, 182, 107, 34);
		frame.getContentPane().add(btnNewButton_1);
	}
}
