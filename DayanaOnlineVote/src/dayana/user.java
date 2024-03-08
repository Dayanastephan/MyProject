package dayana;

import java.awt.event.*;

import javax.swing.*;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;

public class user extends election{
	JFrame jf10;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	JComboBox<String> c2,c1;
	
String u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11;
private JTextField t5;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void use() {
		jf10=new JFrame();
		jf10.getContentPane().setBackground(new Color(135, 206, 250));
		jf10.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		jf10.setVisible(true);
		jf10.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(112, 146, 115, 32);
		jf10.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTER NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(112, 217, 154, 26);
		jf10.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YEAR");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(112, 349, 115, 25);
		jf10.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("USER NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(112, 484, 115, 23);
		jf10.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PASS WORD");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(112, 561, 136, 33);
		jf10.getContentPane().add(lblNewLabel_5);
		
		t1 = new JTextField();
		t1.setBounds(417, 135, 169, 36);
		jf10.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(417, 214, 169, 38);
		jf10.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(417, 402, 169, 44);
		jf10.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(417, 471, 169, 49);
		jf10.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("REGISTRATION HERE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(235, 51, 209, 32);
		jf10.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					u1=t1.getText();
					u2=t2.getText();
					u3=t3.getText();
					u4=t4.getText();
					u5=t5.getText();
					u6=(String)c1.getSelectedItem();
					u7=(String)c2.getSelectedItem();
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
					ps=con.prepareStatement("insert into voterlogin(name,rno,dep,year,mob,user,pass)values(?,?,?,?,?,?,?)");
					ps.setString(1,u1);
					ps.setString(2,u2);
					ps.setString(3,u6);
					ps.setString(4,u7);
					ps.setString(5,u3);
					ps.setString(6,u4);
					ps.setString(7,u5);
					
					int x=ps.executeUpdate();
					if(x>0)
					{
					JOptionPane.showMessageDialog(jf10,"YOUR ID IS CREATED!!!!!","Warning",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
					JOptionPane.showMessageDialog(jf10,"YOUR ID IS CREATED","Warning",JOptionPane.WARNING_MESSAGE);
					}	
					t1.setText("");
					
					t2.setText("");
					
					t3.setText("");
					t4.setText("");
					
					t5.setText("");
					c1.removeAllItems();
					c2.removeAllItems();
					
				}
				catch(Exception ex5)
				{
					System.out.println(ex5);
				}
				
			}
		});
		btnNewButton.setBounds(649, 617, 189, 49);
		jf10.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login  ob2=new login();
				ob2.fun();
				jf10.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(887, 617, 67, 32);
		jf10.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("MOBILE NO");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(112, 419, 121, 14);
		jf10.getContentPane().add(lblNewLabel_8);
		
		t5 = new JTextField();
		t5.setBounds(417, 556, 169, 38);
		jf10.getContentPane().add(t5);
		t5.setColumns(10);
		
		 c2 = new JComboBox<String>();
		 c2.addItem("1");
		 c2.addItem("2");
		 c2.addItem("3");
		 
		c2.setBounds(417, 342, 169, 32);
		jf10.getContentPane().add(c2);
		
		JLabel lblNewLabel_3_1 = new JLabel("DEPARTMENT");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(112, 280, 136, 25);
		jf10.getContentPane().add(lblNewLabel_3_1);
		
		 c1 = new JComboBox<String>();
		 c1.addItem("BA TAMIL");
			c1.addItem("BA ENGLISH");
			c1.addItem("B.Sc MATHS ");
			c1.addItem("B.Sc COMPUTER SCIENCE ");
			c1.addItem("B.Sc CHEMISTRY ");
			c1.addItem("B.Sc PHYSICS");
			c1.addItem("B.Sc ZOOLOGY ");
			c1.addItem("B.Sc BOTONY ");
			c1.addItem("BCA ");
			c1.addItem("B.Com ");
			c1.addItem("B.Com CA ");
			c1.addItem("BBA ");
			c1.addItem("MA TAMIL");
			c1.addItem("MA ENGLISH ");
			c1.addItem("M.Sc MATHS ");
			c1.addItem("M.Sc COMPUTER SCIENCE ");
			c1.addItem("M.Sc CHEMISTRY");
			c1.addItem("M.Sc PHYSICS");
			c1.addItem("M.Sc ZOOLOGY");
			c1.addItem("M.Sc BOTONY");
			c1.addItem("M.Com ");
			
		c1.setBounds(417, 277, 169, 36);
		jf10.getContentPane().add(c1);
	}
}
