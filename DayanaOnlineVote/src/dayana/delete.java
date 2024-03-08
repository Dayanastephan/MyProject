package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;



public class delete extends vote  {
	
JFrame jf11;
private JTextField t1;
Connection con;
PreparedStatement ps;
Statement st;
ResultSet rs;
private JPasswordField t2;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_2;
	/**
	 * Launch the application
	 * 
	 */


	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void del() {
		
		jf11=new JFrame();
		jf11.getContentPane().setBackground(new Color(255, 182, 193));
		jf11.setVisible(true);
		jf11.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(492, 183, 185, 43);
		jf11.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(239, 182, 165, 32);
		jf11.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPassword.setBounds(239, 283, 165, 37);
		jf11.getContentPane().add(lblPassword);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				if((a.equals("DAYANA"))&&(b.equals("MAHA")))
				{ 
					Result ob=new Result();
					ob.Result1();
					jf11.setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(366, 446, 165, 43);
		jf11.getContentPane().add(btnNewButton_1);
		
		t2 = new JPasswordField();
		t2.setBounds(492, 283, 185, 43);
		jf11.getContentPane().add(t2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\istockphoto-1283508273-170667a.jpg"));
		lblNewLabel_1.setBounds(708, 178, 396, 433);
		jf11.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\death-valley-4275549_1920.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1399, 814);
		jf11.getContentPane().add(lblNewLabel_2);
	}
}
