package Pos_Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Success_PayMoney extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Success_PayMoney() {
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 209, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("เงินทอน");
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(214, 92, 103, 37);
		contentPane.add(lblNewLabel_1);

		JLabel Txt_change = new JLabel();
		Txt_change.setFont(new Font("Kanit", Font.PLAIN, 25));
		Txt_change.setHorizontalAlignment(SwingConstants.CENTER);
		Txt_change.setText(String.valueOf(0));
		Txt_change.setBounds(343, 78, 370, 68);
		contentPane.add(Txt_change);

		JLabel lblNewLabel_1_1 = new JLabel("ชำระเงินเสร็จสิ้น");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 80));
		lblNewLabel_1_1.setBounds(287, 436, 535, 84);
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("หน้าแรก");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu me = new Menu();
				me.Menuframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 30));
		btnNewButton.setBounds(410, 591, 215, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Success_PayMoney.class.getResource("/resources/checked.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(343, 195, 354, 200);
		contentPane.add(lblNewLabel);
	}
	
	public Success_PayMoney(JLabel TT_P,JTextField Txt_pay) {
		int change = Integer.valueOf(Txt_pay.getText()) - Integer.valueOf(TT_P.getText());  
		
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("เงินทอน");
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(214, 92, 103, 37);
		contentPane.add(lblNewLabel_1);

		JLabel Txt_change = new JLabel();
		Txt_change.setFont(new Font("Kanit", Font.PLAIN, 25));
		Txt_change.setHorizontalAlignment(SwingConstants.CENTER);
		Txt_change.setText(String.valueOf(change));
		Txt_change.setBounds(343, 78, 370, 68);
		contentPane.add(Txt_change);

		JLabel lblNewLabel_1_1 = new JLabel("ชำระเงินเสร็จสิ้น");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 80));
		lblNewLabel_1_1.setBounds(287, 436, 527, 104);
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("หน้าแรก");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu me = new Menu();
				me.Menuframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 30));
		btnNewButton.setBounds(407, 597, 236, 76);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Success_PayMoney.class.getResource("/resources/checked.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(343, 209, 379, 217);
		contentPane.add(lblNewLabel);

	}
}
