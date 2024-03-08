package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;

public class del  {

	JFrame jf6;
	private JTextField t1;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void dell() {
		
		jf6=new JFrame();
		jf6.getContentPane().setBackground(new Color(0, 153, 153));
		jf6.setVisible(true);
		jf6.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOTER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(261, 237, 122, 27);
		jf6.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(538, 235, 148, 34);
		jf6.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					String s1=t1.getText();
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
					st=con.createStatement();
					String sql =" DELETE from voterlogin WHERE rno=?";
					       ps=con.prepareStatement(sql);
					        ps.setString(1,s1);
					ps.execute(); 
			}
				catch(Exception e4)
				{
					System.out.println(e4);
				}
			}
			
		});
		btnNewButton.setBounds(391, 340, 137, 34);
		jf6.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update ob5=new update();
				ob5.upd();
				jf6.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(625, 432, 68, 27);
		jf6.getContentPane().add(btnNewButton_1);
	}
}
