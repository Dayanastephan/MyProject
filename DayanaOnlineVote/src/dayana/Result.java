package dayana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import javax.sql.*;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
public class Result  extends delete{

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	Connection con;
	JFrame j11;
	PreparedStatement ps;
	String name;
	Statement st;
	ResultSet rs;
	Object se;
	String se1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l1;
	private JButton btnNewButton_10;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void  Result1() {
		j11=new JFrame();
		j11.setVisible(true);
		j11.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("JOIN SECRETARY");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi from cann where pos='JOIN SECRETARY' ";
					rs=st.executeQuery(query);
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				
						
					DefaultTableModel model=(DefaultTableModel)table.getModel();
						model.addRow(new Object[] {name});
						i++;
					}
					if (i < 1) {
						JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (i == 1) {
						System.out.println(i + " Record Found");
					} else {
						System.out.println(i + " Records Found");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
		});
		btnNewButton.setBounds(99, 245, 177, 25);
		j11.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SECRETARY");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi from cann where pos='SECRETARY' ";
					rs=st.executeQuery(query);
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				
						
					DefaultTableModel model=(DefaultTableModel)table_1.getModel();
						model.addRow(new Object[] {name});
						i++;
					}
					if (i < 1) {
						JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (i == 1) {
						System.out.println(i + " Record Found");
					} else {
						System.out.println(i + " Records Found");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_1.setBounds(372, 245, 149, 23);
		j11.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PRESIDENT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi from cann where pos='PRESIDENT' ";
					rs=st.executeQuery(query);
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				
						
					DefaultTableModel model=(DefaultTableModel)table_2.getModel();
						model.addRow(new Object[] {name});
						i++;
					}
					if (i < 1) {
						JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (i == 1) {
						System.out.println(i + " Record Found");
					} else {
						System.out.println(i + " Records Found");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(645, 238, 163, 31);
		j11.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("VICE PRESIDENT");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi from cann where pos='VICE PRESIDENT' ";
					rs=st.executeQuery(query);
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				
						
					DefaultTableModel model=(DefaultTableModel)table_3.getModel();
						model.addRow(new Object[] {name});
						i++;
					}
					if (i < 1) {
						JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (i == 1) {
						System.out.println(i + " Record Found");
					} else {
						System.out.println(i + " Records Found");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_3.setBounds(897, 232, 177, 31);
		j11.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("TREASURER");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi from cann where pos='TREASURER' ";
					rs=st.executeQuery(query);
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				
						
					DefaultTableModel model=(DefaultTableModel)table_4.getModel();
						model.addRow(new Object[] {name});
						i++;
					}
					if (i < 1) {
						JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if (i == 1) {
						System.out.println(i + " Record Found");
					} else {
						System.out.println(i + " Records Found");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton_4.setBounds(1170, 231, 149, 31);
		j11.getContentPane().add(btnNewButton_4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table.setBounds(99, 328, 163, 168);
		j11.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table_1.setBounds(364, 320, 170, 176);
		j11.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table_2.setBounds(645, 308, 177, 176);
		j11.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table_3.setBounds(897, 308, 177, 176);
		j11.getContentPane().add(table_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		table_4.setBounds(1170, 308, 163, 176);
		j11.getContentPane().add(table_4);
		
		btnNewButton_5 = new JButton("WINNER");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				st=con.createStatement();
				// Create a statement and execute the query
				String query = "SELECT name, COUNT(*) as count FROM table1 GROUP BY name  ORDER BY count(name) DESC";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				// Display the results in a JTable
				
				while (rs.next()) {
				    String name = rs.getString("name");
				    //int count = rs.getInt("count");
				    System.out.println(name);
				    l1.setText(name);
				    break;
				
				    //System.out.println(count);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
				catch(Exception er)
				{
					System.out.println(er);
				}
				}
		});
		btnNewButton_5.setBounds(107, 528, 127, 30);
		j11.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("WINNER");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				st=con.createStatement();
				// Create a statement and execute the query
				String query = "SELECT name, COUNT(*) as count FROM table2 GROUP BY name  ORDER BY count(name) DESC";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				// Display the results in a JTable
				
				while (rs.next()) {
				    String name = rs.getString("name");
				    //int count = rs.getInt("count");
				    System.out.println(name);
				    l2.setText(name);
				    break;
				
				    //System.out.println(count);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
				catch(Exception er)
				{
					System.out.println(er);
				}
				}
			
		});
		btnNewButton_6.setBounds(386, 528, 135, 30);
		j11.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("WINNER");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				st=con.createStatement();
				// Create a statement and execute the query
				String query = "SELECT name, COUNT(*) as count FROM table3 GROUP BY name  ORDER BY count(name) DESC";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				// Display the results in a JTable
				
				while (rs.next()) {
				    String name = rs.getString("name");
				    //int count = rs.getInt("count");
				    l3.setText(name);
				    System.out.println(name);
				    break;
				
				    //System.out.println(count);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
				catch(Exception er)
				{
					System.out.println(er);
				}
				
			}
		});
		btnNewButton_7.setBounds(659, 528, 126, 30);
		j11.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("WINNER");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				st=con.createStatement();
				// Create a statement and execute the query
				String query = "SELECT name, COUNT(*) as count FROM table4 GROUP BY name  ORDER BY count(name) DESC";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				// Display the results in a JTable
				
				while (rs.next()) {
				    String name = rs.getString("name");
				    //int count = rs.getInt("count");
				    System.out.println(name);
				    l4.setText(name);
				    break;
				
				    //System.out.println(count);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
				catch(Exception er)
				{
					System.out.println(er);
				}
				
			}
		});
		btnNewButton_8.setBounds(922, 528, 126, 31);
		j11.getContentPane().add(btnNewButton_8);
		
	
		
		 l1 = new JLabel("");
		l1.setOpaque(true);
		l1.setBackground(Color.WHITE);
		l1.setBounds(107, 583, 135, 31);
		j11.getContentPane().add(l1);
		
		l2 = new JLabel("");
		l2.setOpaque(true);
		l2.setBackground(Color.WHITE);
		l2.setBounds(386, 583, 135, 31);
		j11.getContentPane().add(l2);
		
		l3 = new JLabel("");
		l3.setOpaque(true);
		l3.setBackground(Color.WHITE);
		l3.setBounds(659, 583, 126, 31);
		j11.getContentPane().add(l3);
		
		l4 = new JLabel("");
		l4.setOpaque(true);
		l4.setBackground(Color.WHITE);
		l4.setBounds(922, 583, 126, 31);
		j11.getContentPane().add(l4);
		
		l5 = new JLabel("");
		l5.setOpaque(true);
		l5.setBackground(Color.WHITE);
		l5.setBounds(1183, 583, 138, 31);
		j11.getContentPane().add(l5);
		
		btnNewButton_10 = new JButton("WINNER");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				st=con.createStatement();
				// Create a statement and execute the query
				String query = "SELECT name, COUNT(*) as count FROM table5 GROUP BY name  ORDER BY count(name) DESC";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);

				// Display the results in a JTable
				
				while (rs.next()) {
				    String name = rs.getString("name");
				    //int count = rs.getInt("count");
				    System.out.println(name);
				    l5.setText(name);
				    break;
				
				    //System.out.println(count);
				}
				
				//SELECT email, COUNT(email)FROMcontactsGROUP BY email HAVING COUNT(email) > 1;
			}
				catch(Exception er)
				{
					System.out.println(er);
				}
				
			}
			
			
		});
		btnNewButton_10.setBounds(1181, 521, 140, 31);
		j11.getContentPane().add(btnNewButton_10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\ep3QDV.jpg"));
		lblNewLabel.setBounds(0, 0, 1371, 749);
		j11.getContentPane().add(lblNewLabel);
	}
}
