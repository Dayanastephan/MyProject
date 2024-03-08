package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;
public class vote extends login {

	JFrame jf2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void von() {
		jf2=new JFrame();
		jf2.getContentPane().setBackground(new Color(25, 25, 112));
		jf2.setVisible(true);
		jf2.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("ELECTION COMMISION");
		btnNewButton_2.setForeground(new Color(0, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete ob4=new delete();
				ob4.del();
				jf2.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(799, 452, 282, 68);
		jf2.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 21));
		
		JButton btnNewButton_1 = new JButton("CANDIDATE");
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cand1 ob4=new cand1();
				ob4.candi1();
				jf2.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(799, 347, 274, 62);
		jf2.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 23));
		
		JButton btnNewButton = new JButton("VOTER");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login ob1=new login();
				ob1.fun();
				jf2.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(797, 228, 276, 68);
		jf2.getContentPane().add(btnNewButton);
		btnNewButton.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 22));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\online-voting-lot-human-hands-get-out-smartphone-palms-elections-electronic-technology-concept-200776994.jpg"));
		lblNewLabel.setBounds(59, 222, 535, 340);
		jf2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\death-valley-4275549_1920.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1370, 733);
		jf2.getContentPane().add(lblNewLabel_1);
	}
}
