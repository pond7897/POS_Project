package Pos_Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Success_Promptpay extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success_Promptpay frame = new Success_Promptpay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Success_Promptpay() {
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("ชำระเงินเสร็จสิ้น");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 80));
		lblNewLabel_1_1.setBounds(264, 262, 536, 104);
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("หน้าแรก");
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 30));
		btnNewButton.setBounds(407, 597, 236, 76);
		contentPane.add(btnNewButton);

	}
}
