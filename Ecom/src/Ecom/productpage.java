package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class productpage {

	private JFrame frame;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					productpage window = new productpage();
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
	public productpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FLIPKART");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\Captur7.PNG"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(139, 0, 158, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\4.PNG"));
		lblNewLabel_1.setBounds(32, 45, 80, 121);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\3.PNG"));
		lblNewLabel_2.setBounds(181, 45, 80, 121);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\2.PNG"));
		lblNewLabel_2_1.setBounds(323, 45, 80, 121);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lb = new JLabel("CART :");
		lb.setForeground(new Color(30, 144, 255));
		lb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lb.setBounds(10, 5, 71, 26);
		frame.getContentPane().add(lb);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "kindel", "pdf", "peper"}));
		c1.setBounds(32, 207, 80, 16);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "kindel", "pdf", "paper"}));
		c2.setBounds(181, 207, 80, 16);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		c3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "kindel", "pdf", "paper"}));
		c3.setBounds(323, 207, 80, 16);
		frame.getContentPane().add(c3);
		
		JLabel p = new JLabel("100/-");
		p.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		p.setForeground(new Color(100, 149, 237));
		p.setBounds(42, 177, 59, 19);
		frame.getContentPane().add(p);
		
		JLabel p1 = new JLabel("100/-");
		p1.setForeground(new Color(100, 149, 237));
		p1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		p1.setBounds(191, 177, 59, 19);
		frame.getContentPane().add(p1);
		
		JLabel p2 = new JLabel("100/-");
		p2.setForeground(new Color(100, 149, 237));
		p2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		p2.setBounds(333, 177, 59, 19);
		frame.getContentPane().add(p2);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			int c;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				int p=100;
				String t=(String) c1.getSelectedItem();
				if(t.equals("pdf")) {
					int c=50;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c+"\n type:"+t);
				}
				else if(t.equals("paper")) {
					int c=200;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c+"\n type:"+t);
				}
				else if(t.equals("kindel")) {
					int c=400;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c+"\n type:"+t);
					
				}
					
				
	 


			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(23, 234, 89, 16);
		frame.getContentPane().add(btnNewButton);
		
		JButton lb2 = new JButton("add to cart");
		lb2.addActionListener(new ActionListener() {
		int c6;
		
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				int p1=100;
				String t=(String) c2.getSelectedItem();
				if(t.equals("pdf")) {
					int c6=50;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c6+"\n type:"+t);
				}
				else if(t.equals("paper")) {
					int c6=200;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c6+"\n type:"+t);
				}
				else if(t.equals("kindel")) {
					int c6=400;
					JOptionPane.showMessageDialog(btnNewButton, "price:"+c6+"\n type:"+t);
				}
					
			
	 
			}
		});
				
		lb2.setBounds(181, 234, 89, 16);
		frame.getContentPane().add(lb2);
		
		JButton lb3 = new JButton("add to cart");
		lb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart:"+i);
				int p2=100;
				String t=(String) c3.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton, "price:"+p2+"\n type:"+t);
	 
			}
		});
		lb3.setBounds(314, 234, 89, 16);
		frame.getContentPane().add(lb3);
		
		JLabel lblNewLabel_3 = new JLabel("BILL:");
		lblNewLabel_3.setForeground(new Color(100, 149, 237));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(323, 13, 80, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
		
