package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 window = new login1();
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
	public login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.main(new String[]{});
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdmin.setBounds(54, 95, 123, 73);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnUser = new JButton("USER");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.main(new String[]{});
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUser.setForeground(new Color(0, 0, 0));
		btnUser.setBounds(256, 90, 123, 78);
		frame.getContentPane().add(btnUser);
	}

}
