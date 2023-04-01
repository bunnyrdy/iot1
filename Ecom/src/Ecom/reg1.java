package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class reg1 {

	private JFrame frame;
	private JTextField n;
	private JTextField em;
	private JTextField m;
	private JPasswordField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg1 window = new reg1();
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
	public reg1() {
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
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBounds(75, 21, 97, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn = new JButton("submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String email = em.getText();
				String password = p.getText();
				String marks =m.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/3year","root","mrec");
					String q="Insert into reg values('"+name+"','"+email+"','"+password+"','"+marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btn, "done");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn.setBounds(170, 207, 89, 23);
		frame.getContentPane().add(btn);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(75, 69, 97, 31);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel_1_1 = new JLabel("setpassowrd");
		lblNewLabel_1_1.setBounds(75, 111, 97, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("marks");
		lblNewLabel_1_2.setBounds(75, 153, 97, 31);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		n = new JTextField();
		n.setBounds(158, 26, 138, 23);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		em = new JTextField();
		em.setColumns(10);
		em.setBounds(158, 74, 138, 23);
		frame.getContentPane().add(em);
		
		m = new JTextField();
		m.setColumns(10);
		m.setBounds(158, 153, 138, 23);
		frame.getContentPane().add(m);
		
		p = new JPasswordField();
		p.setBounds(158, 111, 138, 23);
		frame.getContentPane().add(p);
	}

}
