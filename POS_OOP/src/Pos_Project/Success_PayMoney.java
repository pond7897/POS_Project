package Pos_Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Success_PayMoney extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success_PayMoney frame = new Success_PayMoney();
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
	public Success_PayMoney() {
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

		JTextArea textArea = new JTextArea();
		textArea.setBounds(343, 68, 370, 92);
		contentPane.add(textArea);

		JLabel lblNewLabel_1_1 = new JLabel("ชำระเงินเสร็จสิ้น");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 80));
		lblNewLabel_1_1.setBounds(287, 436, 527, 104);
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("หน้าแรก");
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
