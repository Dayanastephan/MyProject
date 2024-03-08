package dayana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class front extends JFrame {
	public front() {
	}

	private JPanel contentPane;
	JFrame jf23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		front ob=new front();
		ob.front1();
		
	}

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void front1() {
		

		jf23=new JFrame();
		jf23.getContentPane().setFont(new Font("Rockwell", Font.ITALIC, 18));
		jf23.getContentPane().setBackground(new Color(0, 153, 0));
		jf23.setVisible(true);
		jf23.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(":)");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vote ob4=new vote();
				ob4.von();
				
				//jf23.setVisible(false);
			}
		});
		btnNewButton.setBounds(1132, 659, 69, 34);
		jf23.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ST. ANTONY'S COLLEGE OF ARTS AND SCIENCE FOR WOMEN");
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(641, 172, 729, 34);
		jf23.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ONLINE VOTING SYSTEM");
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.BOLD, 28));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setBounds(713, 309, 412, 41);
		jf23.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("S. DAYANA");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(919, 489, 126, 23);
		jf23.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("II- M.SC CS");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(919, 523, 148, 42);
		jf23.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\online-voting-hand-gets-out-smartphone-voice-sign-check-mark-electronic-voting-technology-concept-internet-online-200777019.jpg"));
		lblNewLabel.setBounds(21, 190, 520, 399);
		jf23.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(0, 128, 0));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\USER\\Documents\\940328-dark-blue-abstract-wallpaper-3456x1944-images.jpg"));
		lblNewLabel_5.setBounds(0, 0, 1397, 761);
		jf23.getContentPane().add(lblNewLabel_5);
	}
}
