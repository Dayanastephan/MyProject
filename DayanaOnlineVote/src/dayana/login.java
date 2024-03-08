package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;
public class login{

	JFrame jf1;
	private JTextField t1;
	private JPasswordField pf;
	public String d1,d2,d3,d4;
	JButton btnNewButton_1;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	int t=0;
	
	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void fun() {
		
jf1=new JFrame();
jf1.getContentPane().setBackground(new Color(0, 102, 102));
jf1.setVisible(true);
jf1.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBackground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(277, 150, 164, 30);
		jf1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(160, 281, 134, 35);
		jf1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(161, 372, 122, 30);
		jf1.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(354, 282, 141, 40);
		jf1.getContentPane().add(t1);
		t1.setColumns(10);
		
		btnNewButton_1 = new JButton("NEW USER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user ob2=new user();
				ob2.use();
				jf1.setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(277, 586, 164, 31);
		jf1.getContentPane().add(btnNewButton_1);
		
		pf = new JPasswordField();
		pf.setBounds(354, 374, 141, 35);
		jf1.getContentPane().add(pf);
		
		JButton btnNewButton_2 = new JButton("LOGIN");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					d1=t1.getText();
					
					d2=pf.getText();
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
				st=con.createStatement();
				rs=st.executeQuery("select user,pass from voterlogin");
				while(rs.next())
				{
				d3=rs.getString("user");
				d4=rs.getString("pass");
				if(!d1.equals("")&&(!d2.equals("")))
				{
				if((d1.equals(d3))&&(d2.equals(d4)))
				{
					t=1;
				election ob=new election();
				ob.ele();
				}
				}
				}
					if((!d1.equals(d3))&&(!d2.equals(d4))&&(t!=1))
					{
					JOptionPane.showMessageDialog(jf1,"Enter your User Name and password!!!!","Warning",JOptionPane.WARNING_MESSAGE);
					}
				
				
				}
				catch(Exception e111)
				{
				System.out.println(e111);
				}
				
				
			}
		});
		btnNewButton_2.setBounds(292, 504, 122, 35);
		jf1.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(0, 0, 128));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\0_420_748_0_70__Features_cyber_security.jpg"));
		lblNewLabel_3.setBounds(688, -83, 652, 850);
		jf1.getContentPane().add(lblNewLabel_3);
	}
}
