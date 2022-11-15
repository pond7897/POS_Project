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

public class Check_total_page extends JFrame {

	protected JPanel Total_Panel;
	protected JFrame Total_Frame;
	public JLabel Total_PriceNumber;
	private JTextField Txt_Money;
	private JButton btnNewButton_2;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Check_total_page(JLabel TT_P) {
		
		
		Total_Frame = new JFrame();
		Total_Frame.setBackground(SystemColor.activeCaptionBorder);
		Total_Frame.getContentPane().setLayout(null);
		Total_Frame.setResizable(false);
		Total_Frame.setBounds(100, 100, 1080, 720);
		Total_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
						JLabel lblNewLabel_1 = new JLabel("ยอดรวม");
						lblNewLabel_1.setBounds(175, 93, 103, 37);
						lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 30));
						Total_Frame.getContentPane().add(lblNewLabel_1);
				
				
		
		//Menu me_count = new Menu();
		
		JLabel TextTotal = new JLabel("0");
		TextTotal.setText(String.valueOf(TT_P.getText()));
		TextTotal.setHorizontalAlignment(SwingConstants.CENTER);
		TextTotal.setFont(new Font("Kanit", Font.PLAIN, 30));
		TextTotal.setBounds(338, 88, 345, 42);
		Total_Frame.getContentPane().add(TextTotal);
				
						JLabel lblNewLabel_1_1 = new JLabel("ให้มา");
						lblNewLabel_1_1.setBounds(175, 357, 88, 62);
						lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
						Total_Frame.getContentPane().add(lblNewLabel_1_1);
		
				Txt_Money = new JTextField();
				Txt_Money.setEnabled(false);
				Txt_Money.setEditable(false);
				Txt_Money.setFont(new Font("Kanit", Font.PLAIN, 30));
				Txt_Money.setBounds(343, 357, 370, 50);
				Total_Frame.getContentPane().add(Txt_Money);
				
				Txt_Money.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char chr_Pay = e.getKeyChar();
						if(!(Character.isDigit(chr_Pay)) ) { // Check ว่า ให้ใส่เฉพาะตัวเลข
							e.consume();
						}
						
					}
					
					
					@Override
					public void keyReleased(KeyEvent e) {
						if(Txt_Money.getText().isEmpty()) {
							btnNewButton_2.setEnabled(false);
						}
						else if( Integer.valueOf(Txt_Money.getText()) >= Integer.valueOf(TT_P.getText()) ) {
							btnNewButton_2.setEnabled(true);
						}
						else {
							btnNewButton_2.setEnabled(false);
						}
					}
				});

		JButton btnNewButton = new JButton("เงินสด");
		btnNewButton.setBounds(575, 216, 220, 60);
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Txt_Money.setEnabled(true);
				Txt_Money.setEditable(true);
				btnNewButton_2.setEnabled(false);
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

		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getMenu_page();
			}
		});
		
				JButton btnNewButton_2 = new JButton("Next");
				btnNewButton_2.setBounds(886, 613, 170, 60);
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Success_PayMoney Spm = new Success_PayMoney(TT_P,Txt_Money);
						Spm.setVisible(true);
						Total_Frame.dispose();
					}
				});
				btnNewButton_2.setFont(new Font("Kanit", Font.PLAIN, 20));
				Total_Frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2_1.setBounds(10, 613, 170, 60);
		btnNewButton_2_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		Total_Frame.getContentPane().add(btnNewButton_2_1);
	}
	
	public void getMenu_page() {
		Menu menu = new Menu();
		menu.Menuframe.setVisible(true);
		Total_Frame.dispose();
	}
}
