package dayana;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.sql.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class cnadiform  extends cand1 {

	JFrame jf8;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs; 
	String b;
	JComboBox<String> com1,com2,com3;
	//BufferedImage image;
	private JTextField t1,t2,t3,t4,t5,t6;

	String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	FileNameExtensionFilter filter;
	JFileChooser chooser;
	 String selectedimagepath;
	ImageIcon li;
	JRadioButton r1,r2,r3;
	private JTextField t7;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void cand() {
		jf8=new JFrame();
		jf8.getContentPane().setBackground(new Color(102, 204, 102));
		jf8.setVisible(true);
		jf8.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CANDIDATE REGISTRATION PAGE");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(299, 36, 334, 38);
		jf8.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CANDITATE NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(113, 129, 140, 14);
		jf8.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTER NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(113, 247, 140, 14);
		jf8.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ROLL NO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(113, 189, 112, 14);
		jf8.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" BIRTH DATE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(113, 309, 136, 14);
		jf8.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GENDER");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(117, 368, 136, 14);
		jf8.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NATIONALITY");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(113, 602, 136, 27);
		jf8.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("ARREARS");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(758, 205, 171, 20);
		jf8.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(r1.isSelected())
					{
						c12=r1.getText();
					}
					if(r2.isSelected())
					{
						c12=r1.getText();
					}
					if(r3.isSelected())
					{
						c12=r1.getText();
						
					}
					c1=t1.getText();
					c2=t2.getText();
					c3=t3.getText();
					c4=t4.getText();
					c5=t5.getText();
					c6=t6.getText();
					c7=t7.getText();
					c9=(String)com1.getSelectedItem();
					c10=(String)com2.getSelectedItem();
					c11=(String)com3.getSelectedItem();
					if(c11.equals("YES"))
					{
						JOptionPane.showMessageDialog(jf8,"NOT ELIGIBLE !!!!","Warning",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
					try
			        {
					
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
					
					ps=con.prepareStatement("insert into cann(candi,fn,mn,dob,gender,dept,year,arrear,nation,pos,mob)values(?,?,?,?,?,?,?,?,?,?,?)");
				
			ps.setString(1,c1);
			ps.setString(2,c2);
			ps.setString(3,c3);
			ps.setString(4,c4);
			ps.setString(5,c12);	
			ps.setString(6,c9);
			ps.setString(7,c10);
			ps.setString(8,c11);
			ps.setString(9,c5);
			ps.setString(10,c6);
			ps.setString(11,c7);
			//ps.setInt(12,0);
		
				int x=ps.executeUpdate();
				if(x>0)
				{
					JOptionPane.showMessageDialog(jf8,"Record Inserted Sucessfully!!!!","Warning",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					System.out.println("not inserted");
				}
				}
				
				catch(Exception ex3)
				{
					System.out.println(ex3);
				}
			}
			}
		});
		btnNewButton.setBounds(816, 630, 156, 38);
		jf8.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(415, 110, 192, 38);
		jf8.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(415, 166, 192, 38);
		jf8.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(415, 235, 192, 38);
		jf8.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(415, 297, 192, 38);
		jf8.getContentPane().add(t4);
		t4.setColumns(10);
		ButtonGroup group = new ButtonGroup();
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r1.setBounds(415, 364, 62, 23);
		group.add(r1);
		jf8.getContentPane().add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.BOLD, 13));
		r2.setBounds(494, 365, 82, 23);
	    group.add(r2);
	    jf8.getContentPane().add(r2);
		
		r3 = new JRadioButton("Transgender");
		r3.setFont(new Font("Tahoma", Font.BOLD, 13));
		r3.setBounds(595, 365, 112, 23);
		group.add(r3);
		jf8.getContentPane().add(r3);
		
		JButton btnNewButton_3 = new JButton("<<");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cand1 ob4=new cand1();
				ob4.candi1();
				jf8.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(997, 637, 62, 27);
		jf8.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("POSTING ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(113, 547, 95, 27);
		jf8.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("MOBILE NO");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(758, 276, 92, 27);
		jf8.getContentPane().add(lblNewLabel_10);
		
		t5 = new JTextField();
		t5.setBounds(415, 590, 192, 38);
		jf8.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(415, 541, 192, 38);
		jf8.getContentPane().add(t6);
		t6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("DEPARTMENT");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(113, 445, 112, 26);
		jf8.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("PURSUING YEAR");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(113, 501, 140, 20);
		jf8.getContentPane().add(lblNewLabel_12);
		
		com1 = new JComboBox<String>();
		com1.addItem("BA TAMIL");
		com1.addItem("BA ENGLISH");
		com1.addItem("B.Sc MATHS ");
		com1.addItem("B.Sc COMPUTER SCIENCE ");
		com1.addItem("B.Sc CHEMISTRY ");
		com1.addItem("B.Sc PHYSICS");
		com1.addItem("B.Sc ZOOLOGY ");
		com1.addItem("B.Sc BOTONY ");
		com1.addItem("BCA ");
		com1.addItem("B.Com ");
		com1.addItem("B.Com CA ");
		com1.addItem("BBA ");
		com1.addItem("MA TAMIL");
		com1.addItem("MA ENGLISH ");
		com1.addItem("M.Sc MATHS ");
		com1.addItem("M.Sc COMPUTER SCIENCE ");
		com1.addItem("M.Sc CHEMISTRY");
		com1.addItem("M.Sc PHYSICS");
		com1.addItem("M.Sc ZOOLOGY");
		com1.addItem("M.Sc BOTONY");
		com1.addItem("M.Com ");
		
		com1.setBounds(415, 433, 192, 38);
		jf8.getContentPane().add(com1);
		com3 = new JComboBox<String>(); 
		com3.addItem("YES");
		com3.addItem("NO");
		com3.setBounds(944, 198, 192, 38);
		jf8.getContentPane().add(com3);
		
	
		
		
		com2 = new JComboBox<String>();
		
		com2.addItem("1");
		com2.addItem("2");
		com2.addItem("3");
		com2.setBounds(415, 492, 192, 38);
		jf8.getContentPane().add(com2);
		
		t7 = new JTextField();
		t7.setBounds(944, 272, 192, 38);
		jf8.getContentPane().add(t7);
		t7.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("CLICK");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 t6.setText("");
					c9=(String)com1.getSelectedItem();
					c10=(String)com2.getSelectedItem();
					c11=(String)com3.getSelectedItem();
				String[] arrOfStr = c9.split(" ");
				  
		        for (String a : arrOfStr)
		        {
		           
		            b=a;
		        break;
		        }
		        if((b.equals("BA")&&(c10.equals("1")))||(b.equals("B.Sc")&&(c10.equals("1")))|(b.equals("B.Com")&&(c10.equals("1"))))
		        {
		        t6.setText("TREASURER");	
		        }
		        if((b.equals("BA")&&(c10.equals("2")))||(b.equals("B.Sc")&&(c10.equals("2")))|(b.equals("B.Com")&&(c10.equals("2"))))
		        {
		        t6.setText("SECRETARY");	
		        }
		        if((b.equals("BA")&&(c10.equals("3")))||(b.equals("B.Sc")&&(c10.equals("3")))|(b.equals("B.Com")&&(c10.equals("3"))))
		        {
		        t6.setText("PRESIDENT");	
		        }
		        if((b.equals("MA")&&(c10.equals("1")))||(b.equals("M.Sc")&&(c10.equals("1")))|(b.equals("M.Com")&&(c10.equals("1"))))
		        {
		        t6.setText("VICE PRESIDENT");	
		        }
		        if((b.equals("MA")&&(c10.equals("2")))||(b.equals("M.Sc")&&(c10.equals("2")))|(b.equals("M.Com")&&(c10.equals("2"))))
		        {
		        t6.setText("JOIN SECRETARY");	
		        }
			}
				
		
			
		});
		btnNewButton_4.setBounds(668, 433, 136, 38);
		jf8.getContentPane().add(btnNewButton_4);
			
			
		
		
	
}
	}
