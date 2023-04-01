package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginpage {

	 JFrame lframe;
	private JTextField t1;
	private JPasswordField p1;
	JLabel lb1 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.lframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.getContentPane().setBackground(Color.BLACK);
		lframe.setBounds(100, 100, 450, 300);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login page");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(189, 0, 138, 40);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("user name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(120, 83, 92, 25);
		lframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(120, 126, 92, 25);
		lframe.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(222, 85, 108, 25);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=t1.getText();
				String ps=p1.getText();
				if(un.equals("srinivas") && ps.equals("12345678"))
				{
				JOptionPane.showMessageDialog(btnNewButton,un+ "login done");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "lnvalid!");
				}
			}
		});
		btnNewButton.setBounds(189, 195, 89, 23);
		lframe.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(222, 126, 108, 27);
		lframe.getContentPane().add(p1);
		
	    lb1 = new JLabel("");
		lb1.setForeground(Color.RED);
		lb1.setBackground(Color.WHITE);
		lb1.setBounds(154, 46, 208, 26);
		lframe.getContentPane().add(lb1);
	}
}
