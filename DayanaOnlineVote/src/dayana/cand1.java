package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;

public class cand1 extends del {

	JFrame jf7;
	public String c1,c2,c3,c4;
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
	public void  candi1() {
		jf7=new JFrame();
		jf7.getContentPane().setBackground(new Color(0, 0, 51));
		jf7.setVisible(true);
		jf7.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("REGISTER HERE");
		btnNewButton_1.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnadiform ob5=new cnadiform();
				ob5.cand();
				jf7.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(708, 383, 258, 50);
		jf7.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<--");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vote ob5=new vote();
				ob5.von();
				jf7.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(922, 598, 67, 23);
		jf7.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\360_F_389618643_TSWVIzF1KvvqpTcje2KwbSqcfoOjh5p1.jpg"));
		lblNewLabel.setBounds(76, 262, 469, 316);
		jf7.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\death-valley-4275549_1920.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1399, 852);
		jf7.getContentPane().add(lblNewLabel_1);
	}
}
