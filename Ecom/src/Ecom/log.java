package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class log {

	private JFrame frame;
	private JTextField em;
	private JPasswordField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log window = new log();
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
	public log() {
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
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 66, 110, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(48, 124, 110, 34);
		frame.getContentPane().add(lblPassword);
		
		em = new JTextField();
		em.setBounds(191, 66, 162, 34);
		frame.getContentPane().add(em);
		em.setColumns(10);
		
		p = new JPasswordField();
		p.setBounds(191, 124, 162, 34);
		frame.getContentPane().add(p);
		
		JButton btn = new JButton("submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = em.getText();
				String password = p.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/3year","root","mrec");
					String q="select count(*) from log where email =? and password =?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1, email);
					ps.setString(2, password);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int count=rs.getInt(1);
					if(count==0)
					{
						JOptionPane.showMessageDialog(btn, "invalid");
					}else {
					
						JOptionPane.showMessageDialog(btn, "done");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn.setBounds(154, 194, 115, 23);
		frame.getContentPane().add(btn);
	}
}
