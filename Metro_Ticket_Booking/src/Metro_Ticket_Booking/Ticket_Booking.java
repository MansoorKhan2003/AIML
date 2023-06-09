package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField t1;
	private JComboBox c1;
	private JComboBox c2;
	private JComboBox c3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
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
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 621, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(231, 11, 139, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(91, 72, 57, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(207, 76, 119, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(91, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(91, 189, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(91, 247, 70, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String f=(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				String no=(String) c3.getSelectedItem();
				int not=Integer.parseInt(no);
				int bill=not*80;
				if(f.equals(t))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Check it!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Hello ,"+n+"\n From :"+f+"\nTo :"+t+"\nNo of Tickets :"+no+"\n Your Bill :"+bill);
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(180, 325, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kphb", "Moosapet", "Punjagutta", "JBS", "CBS", "Sec"}));
		c1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c1.setBounds(222, 129, 104, 22);
		frame.getContentPane().add(c1);
		
		c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Jntu", "SecRailway", "BalaNagar","Kphb", "Ameerpet"}));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c2.setBounds(222, 188, 104, 22);
		frame.getContentPane().add(c2);
		
		c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		c3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c3.setBounds(222, 246, 104, 22);
		frame.getContentPane().add(c3);
	}

}
