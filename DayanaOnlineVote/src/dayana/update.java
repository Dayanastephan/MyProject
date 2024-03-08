package dayana;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.sql.*;
import java.sql.*;

public class update extends vote{

	JFrame jf3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void upd() {
		jf3=new JFrame();
		jf3.getContentPane().setBackground(new Color(255, 182, 193));
		jf3.setVisible(true);
		jf3.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CORRECTION IN VOTER ID");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//correction ob=new correction();
				//ob.cort();
				//jf3.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(705, 281, 242, 37);
		jf3.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("DELETION OF VOTER ID ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del ob=new del();
				ob.dell();
				jf3.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(705, 477, 231, 37);
		jf3.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\image 1.png"));
		lblNewLabel.setBounds(146, 174, 547, 430);
		jf3.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("<--");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vote ob5=new vote();
				ob5.von();
				jf3.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(809, 535, 89, 23);
		jf3.getContentPane().add(btnNewButton_3);
	}
}
