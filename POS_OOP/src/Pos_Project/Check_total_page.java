package Pos_Project;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Check_total_page extends JFrame {

	protected JPanel Total_Panel;
	protected JFrame Total_Frame;
	private int Totall;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Check_total_page() {
		
		Total_Frame = new JFrame();
		Total_Frame.setBackground(SystemColor.activeCaptionBorder);
		Total_Frame.getContentPane().setLayout(null);
		Total_Frame.setResizable(false);
		Total_Frame.setBounds(100, 100, 1080, 720);
		Total_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Menu menu = new Menu();
		Totall = menu.getTotal();

		JLabel lblNewLabel_1 = new JLabel("ยอดรวม");
		lblNewLabel_1.setBounds(175, 93, 103, 37);
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("เงินสด");
		btnNewButton.setBounds(575, 216, 220, 60);
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Total_Frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("พร้อมเพย์");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(261, 216, 220, 60);
		btnNewButton_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Total_Frame.getContentPane().add(btnNewButton_1);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("MN Kha Ki", Font.PLAIN, 30));
		textArea.setBounds(343, 357, 370, 62);
		Total_Frame.getContentPane().add(textArea);

		JLabel lblNewLabel_1_1 = new JLabel("ให้มา");
		lblNewLabel_1_1.setBounds(175, 357, 88, 62);
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setBounds(10, 613, 170, 60);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("supermarket", Font.PLAIN, 15));
		Total_Frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getMenu_page();
			}
		});
		btnNewButton_2_1.setBounds(886, 613, 170, 60);
		btnNewButton_2_1.setFont(new Font("supermarket", Font.PLAIN, 15));
		Total_Frame.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel = new JLabel(String.valueOf(Totall));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel.setBounds(338, 88, 345, 42);
		Total_Frame.getContentPane().add(lblNewLabel);
	}
	
	public void getMenu_page() {
		Menu menu = new Menu();
		menu.Menuframe.setVisible(true);
		Total_Frame.dispose();
	}
}
