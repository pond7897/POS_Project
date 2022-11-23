package Pos_Project;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class Check_total_page extends JFrame {

	protected JPanel Total_Panel;
	protected JFrame Total_Frame;
	public JLabel Total_PriceNumber;
	private JTextField Txt_Money;
	private JButton btnNewButton_2;
	private JTextArea Bill;
	private JTable table;

	public Check_total_page(JLabel TT_P, JTable table) {

		Total_Frame = new JFrame();
		Total_Frame.getContentPane().setBackground(new Color(248, 209, 224));
		Total_Frame.setBackground(SystemColor.activeCaptionBorder);
		Total_Frame.setResizable(false);
		Total_Frame.setBounds(100, 100, 1080, 720);
		Total_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.table = table;
		
		initialize(TT_P,table);

	}
	
	private void initialize(JLabel TT_P, JTable table) {
		Total_Frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ยอดรวม");
		lblNewLabel_1.setBounds(635, 352, 176, 41);
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(lblNewLabel_1);

		JLabel TextTotal = new JLabel("0");
		TextTotal.setBounds(769, 349, 287, 46);
		TextTotal.setText(String.valueOf(TT_P.getText()));
		TextTotal.setHorizontalAlignment(SwingConstants.CENTER);
		TextTotal.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(TextTotal);

		JLabel lblNewLabel_1_1 = new JLabel("ให้มา");
		lblNewLabel_1_1.setBounds(577, 507, 88, 62);
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(lblNewLabel_1_1);

		Txt_Money = new JTextField();
		Txt_Money.setBounds(675, 519, 370, 50);
		Txt_Money.setEnabled(false);
		Txt_Money.setEditable(false);
		Txt_Money.setFont(new Font("Kanit", Font.PLAIN, 30));
		Total_Frame.getContentPane().add(Txt_Money);

		Txt_Money.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char chr_Pay = e.getKeyChar();
				if (!(Character.isDigit(chr_Pay))) { // Check ว่า ให้ใส่เฉพาะตัวเลข
					e.consume();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (Txt_Money.getText().isEmpty()) { // เช็คว่าได้ใส่จำนวนเงินไปหรือยัง
					btnNewButton_2.setEnabled(false);
				} else if (Integer.valueOf(Txt_Money.getText()) >= Integer.valueOf(TT_P.getText())) { // เช็คเงินที่ป้อนมากกว่าเงินทั้งหมดหรือไม่
					btnNewButton_2.setEnabled(true);
				} else {
					btnNewButton_2.setEnabled(false);
				}
			}
		});

		JButton btnNewButton = new JButton("เงินสด");
		btnNewButton.setBounds(836, 418, 220, 60);
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Txt_Money.setEnabled(true);
				Txt_Money.setEditable(true);
			}
		});
		Total_Frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("เร็วๆนี้");
		btnNewButton_1.setBounds(591, 418, 220, 60);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Total_Frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("ชำระเงิน");
		btnNewButton_2.setBounds(875, 598, 170, 60);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Success_PayMoney Spm = new Success_PayMoney(TT_P, Txt_Money);
				Spm.setVisible(true);
				Total_Frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		Total_Frame.getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(23, 10, 517, 632);
		scrollPane.setViewportView(table);
		Total_Frame.getContentPane().add(scrollPane);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(441, 18, 551, 324);
		lblNewLabel.setIcon(new ImageIcon(Check_total_page.class.getResource("/resources/gonhintest2.jpg")));
		Total_Frame.getContentPane().add(lblNewLabel);
		
	}
}
