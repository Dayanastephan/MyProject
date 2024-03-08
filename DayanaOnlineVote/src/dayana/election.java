package dayana;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.sql.*;
import java.sql.*;

public class election extends cnadiform  {

	protected static final String DefautlTableModel = null;
	JFrame jf9;
	int r1,r2,r3,r4,r5,big=0,i,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	private JTable table;
	String name,reg,position,a1,a2,a3,se1;
	Object se;

	/**
	 * Launch the application.
	
	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void ele() {
		jf9=new JFrame();
		jf9.getContentPane().setBackground(new Color(255, 182, 193));
		jf9.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SHOW");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			private JTable tblData;
			private DefaultTableModel model;

			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");  
					Statement st=con.createStatement();
					String query="select candi,mn,pos from cann where pos='JOIN SECRETARY' ";
					rs=st.executeQuery(query);
				
					int i = 0;
					while (rs.next()) {
			name = rs.getString("candi");
				reg= rs.getString("mn");
					position=rs.getString("pos");
						
					DefaultTableModel model=(DefaultTableModel)table.getModel();
						model.addRow(new Object[] {name,reg,position});
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
				/*try
				{
					
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","DA@YA#NA$");  
				Statement st=con.createStatement();
				String query="select candi,mn,pos from cann where pos='JOIN SECRETARY' ";
				rs=st.executeQuery(query);
				ResultSetMetaData rsmd=rs.getMetaData();
			
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int cols =rsmd.getColumnCount();
				String[] colname=new String[cols];
				for(int i=0; i<cols; i++)
					colname[i]=rsmd.getColumnName(i+1);
				model.setColumnIdentifiers(colname);
			
				while(rs.next())
				{
					name=rs.getString(1);
					reg=rs.getString(2);
					position=rs.getString(3);
					break;
				}
					String[] row= {name,reg,position};
					model.addRow(row);
				
				}
				catch(Exception eee)
				{
					System.out.println(eee);
				}*/
				
			}
		});
		btnNewButton.setBounds(98, 446, 112, 28);
		jf9.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(284, 295, 417, 301);
		jf9.getContentPane().add(table);
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(304, 231, 139, 36);
		jf9.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("REGISTER NO");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(426, 231, 147, 36);
		jf9.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("POSITION");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(583, 231, 121, 36);
		jf9.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("VOTE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				int row=table.getSelectedRow();
				int col=table.getSelectedColumn();
				if(row>=0 &&col>=0)
				{
					se=table.getValueAt(row, col);
					se1=(String)(se);
					System.out.println(se);
				}
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","root");
				ps=con.prepareStatement("insert into table1(name)values(?)");
			
				ps.setString(1,se1);
				//ps.setInt(2,1);
				
				int x=ps.executeUpdate();
				if(x>0)
				{
				JOptionPane.showMessageDialog(jf9,"THANKS FOR VOTING!!!!!"," ",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
				JOptionPane.showMessageDialog(jf9,"YOUR VOTE NOT SUBMITTED TRY AGAIN|||","Warning",JOptionPane.WARNING_MESSAGE);
				}
				election1 obr=new election1();
				obr.ele2();
				jf9.setVisible(false);
				}
				catch(Exception ef)
				{
					System.out.println(ef);
				}
			}
		});
		btnNewButton_2.setBounds(419, 666, 139, 36);
		jf9.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("JOIN SECRETARY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(419, 127, 229, 28);
		jf9.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\download (2).jfif"));
		lblNewLabel_2.setBounds(816, 315, 315, 265);
		jf9.getContentPane().add(lblNewLabel_2);
		jf9.setVisible(true);
		
			}
}
