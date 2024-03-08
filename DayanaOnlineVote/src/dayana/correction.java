package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;

public class correction extends update {

	JFrame jf4;
	String h1,h2,h3,h4,h5,h6;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t1;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	String s1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void cort() {
		jf4=new JFrame();
		jf4.setVisible(true);
		jf4.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(154, 190, 87, 25);
		jf4.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AADHAR NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(154, 250, 87, 25);
		jf4.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOBILE NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(154, 305, 87, 25);
		jf4.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setBounds(318, 186, 122, 34);
		jf4.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(318, 241, 122, 34);
		jf4.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(331, 301, 122, 34);
		jf4.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(318, 352, 122, 34);
		jf4.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(318, 428, 122, 34);
		jf4.getContentPane().add(t6);
		t6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("VOTER ID");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setBounds(154, 120, 109, 34);
		jf4.getContentPane().add(lblNewLabel_5);
		
		t1 = new JTextField();
		t1.setBounds(318, 116, 122, 38);
		jf4.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("CLICK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					s1=t1.getText();
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/vote","root","root");
					st=con.createStatement();
					String sql = "SELECT NAME,AADHARNO,MOBILENO,FATHERNAME,MOTHERNAME FROM  register WHERE VOTERID=?";
					       ps=con.prepareStatement(sql);
					        ps.setString(1,t1.getText());
					rs=ps.executeQuery();
					if(rs.next())
					{
					t2.setText(rs.getString("NAME"));
					t3.setText(rs.getString("AADHARNO"));
					t4.setText(rs.getString("MOBILENO"));
					t5.setText(rs.getString("FATHERNAME"));
					t6.setText(rs.getString("MOTHERNAME"));
					
					
					}
							
					
					
				}
				
			
				catch(Exception ex34)
				{
					System.out.println(ex34);
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(539, 134, 99, 34);
		jf4.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update ob5=new update();
				ob5.upd();
				jf4.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(539, 235, 89, 23);
		jf4.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("FATHER NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(154, 356, 109, 25);;
		jf4.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("MOTHER NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setBounds(154, 432, 109, 25);
		jf4.getContentPane().add(lblNewLabel_4);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				
				h1=t1.getText();
				h2=t2.getText();
				h3=t3.getText();
				h4=t4.getText();
				h5=t5.getText();
				h6=t6.getText();
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				Statement stmt = con.createStatement();  
		        stmt.execute("UPDATE voterlogin SET name='" +t2.getText() + "',rno='" + t3.getText() + "',dep='" +t4.getText() + "',year='"+t5.getText() + "',mob='"+t6.getText() + "' WHERE VOTERID='" + t1.getText() + "' ");  
		        JOptionPane.showMessageDialog(null, "Record is updated...");  
		        stmt.close();  
		        con.close();  
				
				
				
			}
				catch(Exception ex34)
				{
					System.out.println(ex34);
				}
			}
		});
		btnUpdate.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 15));
		btnUpdate.setBounds(353, 520, 160, 45);
		jf4.getContentPane().add(btnUpdate);
	}
}
