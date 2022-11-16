package Pos_Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Vector;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	public void addtable(int ID, String Pd, int qty, int price) {
		DefaultTableModel dt = (DefaultTableModel) table.getModel();

		double totPrice = price * Double.valueOf(qty);
		DecimalFormat df = new DecimalFormat("0");
		TotalPrice = df.format(totPrice);

		for (int row = 0; row < table.getRowCount(); row++) {
			if (Pd == table.getValueAt(row, 1)) {
				dt.removeRow(table.convertRowIndexToModel(row));
			}
		}

		Vector v = new Vector();
		v.add(ID);
		v.add(Pd);
		v.add(qty);
		v.add(TotalPrice);

		dt.addRow(v);

	}

	public void cal() {
		// cal total table values

		int numOfRow = table.getRowCount();
		int tot = 0;

		for (int i = 0; i < numOfRow; i++) {

			double value = Double.valueOf(table.getValueAt(i, 3).toString());

			tot += value;

		}

		DecimalFormat df = new DecimalFormat("0");
		Total_PriceNumber.setText(df.format(tot));

	}

	public void switchPanels(JPanel panel) {
		panel_SubMenu.removeAll();
		panel_SubMenu.add(panel);
		panel_SubMenu.repaint();
		panel_SubMenu.revalidate();
	}

	private void initialize() {

		JPanel panel_Menu = new JPanel();
		panel_Menu.setBounds(23, 33, 675, 65);
		Menuframe.getContentPane().add(panel_Menu);
		panel_Menu.setLayout(null);

		JLabel lblNewLabel = new JLabel("ขนม");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("WR Tish Kid", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 225, 65);
		panel_Menu.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ชา");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setFont(new Font("WR Tish Kid", Font.BOLD, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(224, 0, 207, 65);
		panel_Menu.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("กาแฟ");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2.setFont(new Font("WR Tish Kid", Font.BOLD, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(430, 0, 245, 65);
		panel_Menu.add(lblNewLabel_2);

		JPanel panel_CheckMenu = new JPanel();
		panel_CheckMenu.setBackground(new Color(255, 255, 255));
		panel_CheckMenu.setBounds(708, 126, 348, 433);
		Menuframe.getContentPane().add(panel_CheckMenu);
		panel_CheckMenu.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 348, 433);
		panel_CheckMenu.add(scrollPane);

		table = new JTable();
		table.setRowMargin(0);
		table.setFont(new Font("Kanit", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
				new Object[][] {

				},
				new String[] {
						"ID", "Product name", "Quantity", "price"
				}));
		scrollPane.setViewportView(table);

		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);

		panel_SubMenu = new JLayeredPane();
		panel_SubMenu.setBackground(new Color(255, 255, 255));
		panel_SubMenu.setBounds(23, 126, 675, 531);
		Menuframe.getContentPane().add(panel_SubMenu);
		panel_SubMenu.setLayout(null);

		// ขนม

		JPanel Choos_Snack = new JPanel();
		Choos_Snack.setBackground(new Color(255, 255, 255));
		Choos_Snack.setBounds(0, 0, 675, 531);
		panel_SubMenu.add(Choos_Snack);
		Choos_Snack.setLayout(null);

		TextMoji_choc = new JLabel("โมจิโรลช็อคโกแลต");
		TextMoji_choc.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextMoji_choc.setHorizontalAlignment(SwingConstants.CENTER);
		TextMoji_choc.setBounds(41, 249, 170, 29);
		Choos_Snack.add(TextMoji_choc);

		JButton btnMoji_choc = new JButton("");
		btnMoji_choc.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack/modi_choc.png")));
		btnMoji_choc.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnMoji_choc.setBounds(41, 30, 170, 220);
		Choos_Snack.add(btnMoji_choc);

		btnMoji_choc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[0];
				++Acount;
				++count[0];
				addtable(1, TextMoji_choc.getText(), Acount, 20);
				cal();

			}
		});

		TextPudding_choc = new JLabel("พุดดิ้งช็อคโกแลต");
		TextPudding_choc.setHorizontalAlignment(SwingConstants.CENTER);
		TextPudding_choc.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextPudding_choc.setBounds(251, 249, 170, 29);
		Choos_Snack.add(TextPudding_choc);

		JButton btnPudding_choc = new JButton("");
		btnPudding_choc.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack//Pudding_choc.png")));
		btnPudding_choc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[1];
				++Acount;
				++count[1];
				addtable(2, TextPudding_choc.getText(), Acount, 20);
				cal();
			}
		});
		btnPudding_choc.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnPudding_choc.setBounds(251, 30, 170, 220);
		Choos_Snack.add(btnPudding_choc);

		TextPudding_milk = new JLabel("พุดดิ้งฝอยทองนมสด");
		TextPudding_milk.setHorizontalAlignment(SwingConstants.CENTER);
		TextPudding_milk.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextPudding_milk.setBounds(459, 249, 170, 29);
		Choos_Snack.add(TextPudding_milk);

		JButton btnPudding_milk = new JButton("");
		btnPudding_milk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[2];
				++Acount;
				++count[2];
				addtable(3, TextPudding_milk.getText(), Acount, 35);
				cal();
			}
		});
		btnPudding_milk
				.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack//Pudding_gold_milk.png")));
		btnPudding_milk.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnPudding_milk.setBounds(459, 30, 170, 220);
		Choos_Snack.add(btnPudding_milk);

		TextMoji_GreenTea = new JLabel("โมจิโรลชาเขียว");
		TextMoji_GreenTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextMoji_GreenTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextMoji_GreenTea.setBounds(41, 501, 170, 29);
		Choos_Snack.add(TextMoji_GreenTea);

		JButton btnMoji_GreenTea = new JButton("");
		btnMoji_GreenTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[3];
				++Acount;
				++count[3];
				addtable(4, TextMoji_GreenTea.getText(), Acount, 20);
				cal();
			}
		});
		btnMoji_GreenTea
				.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack//Moji_GreenTea.png")));

		btnMoji_GreenTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnMoji_GreenTea.setBounds(41, 279, 170, 220);
		Choos_Snack.add(btnMoji_GreenTea);

		TextCroissant = new JLabel("ครัวซ็อง");
		TextCroissant.setHorizontalAlignment(SwingConstants.CENTER);
		TextCroissant.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextCroissant.setBounds(251, 501, 170, 29);
		Choos_Snack.add(TextCroissant);

		JButton btnCroissant = new JButton("");
		btnCroissant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[4];
				++Acount;
				++count[4];
				addtable(5, TextCroissant.getText(), Acount, 20);
				cal();
			}
		});
		btnCroissant.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack/Croissant.png")));
		btnCroissant.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnCroissant.setBounds(251, 279, 170, 220);
		Choos_Snack.add(btnCroissant);

		TextBreadGalic = new JLabel("ปังเนยกระเทียม");
		TextBreadGalic.setHorizontalAlignment(SwingConstants.CENTER);
		TextBreadGalic.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextBreadGalic.setBounds(459, 501, 170, 29);
		Choos_Snack.add(TextBreadGalic);

		JButton btnBreadGalic = new JButton("");
		btnBreadGalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[5];
				++Acount;
				++count[5];
				addtable(6, TextBreadGalic.getText(), Acount, 20);
				cal();
			}
		});
		btnBreadGalic.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Snack/BreadGalic.png")));
		btnBreadGalic.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnBreadGalic.setBounds(459, 279, 170, 220);
		Choos_Snack.add(btnBreadGalic);

		// ชา

		JPanel Choos_Cha = new JPanel();
		Choos_Cha.setBounds(0, 0, 675, 531);
		panel_SubMenu.add(Choos_Cha);
		Choos_Cha.setLayout(null);

		TextMilkTea = new JLabel("ชานม");
		TextMilkTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextMilkTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextMilkTea.setBounds(41, 251, 170, 29);
		Choos_Cha.add(TextMilkTea);

		JButton btnMilkTea = new JButton("");
		btnMilkTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[6];
				++Acount;
				++count[6];
				addtable(7, TextMilkTea.getText(), Acount, 35);
				cal();
			}
		});
		btnMilkTea.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/milkTea.png")));
		btnMilkTea.setVerticalAlignment(SwingConstants.CENTER);
		btnMilkTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnMilkTea.setBounds(41, 30, 170, 220);
		Choos_Cha.add(btnMilkTea);

		TextGreenTea = new JLabel("ชาเขียว");
		TextGreenTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextGreenTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextGreenTea.setBounds(251, 251, 170, 29);
		Choos_Cha.add(TextGreenTea);

		JButton btnGreenTea = new JButton("");
		btnGreenTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[7];
				++Acount;
				++count[7];
				addtable(8, TextGreenTea.getText(), Acount, 35);
				cal();
			}
		});
		btnGreenTea.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/greenTea.png")));
		btnGreenTea.setVerticalAlignment(SwingConstants.CENTER);
		btnGreenTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnGreenTea.setBounds(251, 30, 170, 220);
		Choos_Cha.add(btnGreenTea);

		TextLimeTea = new JLabel("ชามะนาว");
		TextLimeTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextLimeTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextLimeTea.setBounds(459, 251, 170, 29);
		Choos_Cha.add(TextLimeTea);

		JButton btnLimeTea = new JButton("");
		btnLimeTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[8];
				++Acount;
				++count[8];
				addtable(9, TextLimeTea.getText(), Acount, 35);
				cal();
			}
		});
		btnLimeTea.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/LimeTea.png")));
		btnLimeTea.setVerticalAlignment(SwingConstants.CENTER);
		btnLimeTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnLimeTea.setBounds(459, 30, 170, 220);
		Choos_Cha.add(btnLimeTea);

		TextColdTea = new JLabel("ชาเย็น");
		TextColdTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextColdTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextColdTea.setBounds(41, 502, 170, 29);
		Choos_Cha.add(TextColdTea);

		JButton btnColdTea = new JButton("");
		btnColdTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[9];
				++Acount;
				++count[9];
				addtable(10, TextColdTea.getText(), Acount, 35);
				cal();
			}
		});
		btnColdTea.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/ColdTea.png")));
		btnColdTea.setVerticalAlignment(SwingConstants.CENTER);
		btnColdTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnColdTea.setBounds(41, 279, 170, 220);
		Choos_Cha.add(btnColdTea);

		TextColdMilk = new JLabel("นมเย็น");
		TextColdMilk.setHorizontalAlignment(SwingConstants.CENTER);
		TextColdMilk.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextColdMilk.setBounds(251, 502, 170, 29);
		Choos_Cha.add(TextColdMilk);

		JButton btnColdMilk = new JButton("");
		btnColdMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[10];
				++Acount;
				++count[10];
				addtable(11, TextColdMilk.getText(), Acount, 35);
				cal();
			}
		});
		btnColdMilk.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/ColdMilk.png")));
		btnColdMilk.setVerticalAlignment(SwingConstants.CENTER);
		btnColdMilk.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnColdMilk.setBounds(251, 279, 170, 220);
		Choos_Cha.add(btnColdMilk);

		TextCocho = new JLabel("โกโก้");
		TextCocho.setHorizontalAlignment(SwingConstants.CENTER);
		TextCocho.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextCocho.setBounds(459, 502, 170, 29);
		Choos_Cha.add(TextCocho);

		JButton btnCocho = new JButton("");
		btnCocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[11];
				++Acount;
				++count[11];
				addtable(12, TextCocho.getText(), Acount, 35);
				cal();
			}
		});
		btnCocho.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cha/Cocho.png")));
		btnCocho.setVerticalAlignment(SwingConstants.CENTER);
		btnCocho.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnCocho.setBounds(459, 279, 170, 220);
		Choos_Cha.add(btnCocho);

		// กาแฟ

		JPanel Choos_cafe = new JPanel();
		Choos_cafe.setBounds(0, 0, 675, 531);
		panel_SubMenu.add(Choos_cafe);
		Choos_cafe.setLayout(null);

		TextAmericano = new JLabel("อเมริกาโน่");
		TextAmericano.setHorizontalAlignment(SwingConstants.CENTER);
		TextAmericano.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextAmericano.setBounds(41, 250, 170, 29);
		Choos_cafe.add(TextAmericano);

		JButton btnAmericano = new JButton("");
		btnAmericano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[12];
				++Acount;
				++count[12];
				addtable(13, TextAmericano.getText(), Acount, 35);
				cal();
			}
		});
		btnAmericano.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/Americano.png")));
		btnAmericano.setVerticalAlignment(SwingConstants.CENTER);
		btnAmericano.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnAmericano.setBounds(41, 30, 170, 220);
		Choos_cafe.add(btnAmericano);

		TextCapucino = new JLabel("คาปูชิโน่");
		TextCapucino.setHorizontalAlignment(SwingConstants.CENTER);
		TextCapucino.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextCapucino.setBounds(251, 250, 170, 29);
		Choos_cafe.add(TextCapucino);

		JButton btnCapucino = new JButton("");
		btnCapucino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[13];
				++Acount;
				++count[13];
				addtable(14, TextCapucino.getText(), Acount, 35);
				cal();
			}
		});
		btnCapucino.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/Capucino.png")));
		btnCapucino.setVerticalAlignment(SwingConstants.CENTER);
		btnCapucino.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnCapucino.setBounds(251, 30, 170, 220);
		Choos_cafe.add(btnCapucino);

		TextEspresso = new JLabel("เอสเปรสโซ่");
		TextEspresso.setHorizontalAlignment(SwingConstants.CENTER);
		TextEspresso.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextEspresso.setBounds(459, 250, 170, 29);
		Choos_cafe.add(TextEspresso);

		JButton btnEspresso = new JButton("");
		btnEspresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[14];
				++Acount;
				++count[14];
				addtable(15, TextEspresso.getText(), Acount, 35);
				cal();
			}
		});
		btnEspresso.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/Esspressso.png")));
		btnEspresso.setVerticalAlignment(SwingConstants.CENTER);
		btnEspresso.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnEspresso.setBounds(459, 30, 170, 220);
		Choos_cafe.add(btnEspresso);

		TextLate = new JLabel("ลาเต้");
		TextLate.setHorizontalAlignment(SwingConstants.CENTER);
		TextLate.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextLate.setBounds(41, 502, 170, 29);
		Choos_cafe.add(TextLate);

		JButton btnLate = new JButton("");
		btnLate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[15];
				++Acount;
				++count[15];
				addtable(16, TextLate.getText(), Acount, 35);
				cal();
			}
		});
		btnLate.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/Late.png")));
		btnLate.setVerticalAlignment(SwingConstants.CENTER);
		btnLate.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnLate.setBounds(41, 279, 170, 220);
		Choos_cafe.add(btnLate);

		TextMocha = new JLabel("มอคค่า");
		TextMocha.setHorizontalAlignment(SwingConstants.CENTER);
		TextMocha.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextMocha.setBounds(251, 502, 170, 29);
		Choos_cafe.add(TextMocha);

		JButton btnMocha = new JButton("");
		btnMocha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[16];
				++Acount;
				++count[16];
				addtable(17, TextMocha.getText(), Acount, 35);
				cal();
			}
		});
		btnMocha.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/Mocha.png")));
		btnMocha.setVerticalAlignment(SwingConstants.CENTER);
		btnMocha.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnMocha.setBounds(251, 279, 170, 220);
		Choos_cafe.add(btnMocha);

		TextBlackTea = new JLabel("กาแฟดำ");
		TextBlackTea.setHorizontalAlignment(SwingConstants.CENTER);
		TextBlackTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		TextBlackTea.setBounds(459, 502, 170, 29);
		Choos_cafe.add(TextBlackTea);

		JButton btnBlackTea = new JButton("");
		btnBlackTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Acount = count[17];
				++Acount;
				++count[17];
				addtable(18, TextBlackTea.getText(), Acount, 35);
				cal();
			}
		});
		btnBlackTea.setIcon(new ImageIcon(Menu.class.getResource("/resources/image_item/Cafe/BlackTea.png")));
		btnBlackTea.setVerticalAlignment(SwingConstants.CENTER);
		btnBlackTea.setFont(new Font("Kanit", Font.PLAIN, 14));
		btnBlackTea.setBounds(459, 279, 170, 220);
		Choos_cafe.add(btnBlackTea);

		//

		JButton btnNewButton_1 = new JButton("ชำระเงิน");
		btnNewButton_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.valueOf(Total_PriceNumber.getText()) == 0) {
					Success_PayMoney Sp = new Success_PayMoney();
					Sp.setVisible(true);
					Menuframe.dispose();
				} else {
					Check_total_page TotalPage = new Check_total_page(Total_PriceNumber);
					TotalPage.Total_Frame.setVisible(true);
					Menuframe.setVisible(false);
				}

			}
		});
		btnNewButton_1.setBounds(828, 615, 143, 42);
		Menuframe.getContentPane().add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBounds(708, 566, 348, 39);
		Menuframe.getContentPane().add(panel);
		panel.setLayout(null);

		Total_PriceNumber = new JLabel("");
		Total_PriceNumber.setText("0");
		Total_PriceNumber.setFont(new Font("Kanit", Font.PLAIN, 20));
		Total_PriceNumber.setHorizontalAlignment(SwingConstants.LEFT);
		Total_PriceNumber.setBounds(122, 0, 226, 39);
		panel.add(Total_PriceNumber);

		JLabel Total_Price_1 = new JLabel(" ราคารวม :");
		Total_Price_1.setHorizontalAlignment(SwingConstants.LEFT);
		Total_Price_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		Total_Price_1.setBounds(0, 0, 114, 39);
		panel.add(Total_Price_1);

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(Choos_Snack);

			}
		});

		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(Choos_Cha);

			}
		});

		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(Choos_cafe);

			}
		});

	}

	public Menu() {

		Menuframe = new JFrame();
		Menuframe.getContentPane().setBackground(new Color(248, 209, 224));
		Menuframe.setResizable(false);
		Menuframe.setBounds(100, 100, 1080, 720);
		Menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(Menu.class.getResource("/resources/icons8_home_50px_1.png")));
		btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogout.setBounds(964, 67, 71, 49);
		btnLogout.setPreferredSize(new Dimension(20, 21));
		btnLogout.setIconTextGap(1);
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure?");
				if (choice == JOptionPane.YES_OPTION) {
					Login login_page = new Login();
					login_page.frmTextshop.setVisible(true);
					Menuframe.setVisible(false);
				}

			}
		});
		Menuframe.getContentPane().setLayout(null);

		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Kanit", Font.PLAIN, 22));
		btnLogout.setBackground(new Color(255, 255, 255));
		Menuframe.getContentPane().add(btnLogout);

		JButton btnDeleteItem = new JButton("ลบสินค้า");
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dt = (DefaultTableModel) table.getModel();
				int rw = table.getSelectedRow();
				if (rw == -1) {
					JOptionPane.showMessageDialog(null, "Please select a product to delete before pressing the button.",
							"WARNING", JOptionPane.WARNING_MESSAGE);
				} else {
					String r = dt.getValueAt(table.getSelectedRow(), 0).toString();
					dt.removeRow(rw);
					switch (r) {
						case "1":
							count[0] = 0;
							break;

						case "2":
							count[1] = 0;
							break;

						case "3":
							count[2] = 0;
							break;

						case "4":
							count[3] = 0;
							break;

						case "5":
							count[4] = 0;
							break;

						case "6":
							count[5] = 0;
							break;

						case "7":
							count[6] = 0;
							break;

						case "8":
							count[7] = 0;
							break;

						case "9":
							count[8] = 0;
							break;

						case "10":
							count[9] = 0;
							break;

						case "11":
							count[10] = 0;
							break;

						case "12":
							count[11] = 0;
							break;

						case "13":
							count[12] = 0;
							break;

						case "14":
							count[13] = 0;
							break;

						case "15":
							count[14] = 0;
							break;

						case "16":
							count[15] = 0;
							break;

						case "17":
							count[16] = 0;
							break;

						case "18":
							count[17] = 0;
							break;
						default:
							break;
					}

					cal();
				}
			}
		});
		btnDeleteItem.setPreferredSize(new Dimension(20, 21));
		btnDeleteItem.setIconTextGap(1);
		btnDeleteItem.setForeground(new Color(0, 0, 0));
		btnDeleteItem.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnDeleteItem.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		btnDeleteItem.setBackground(Color.WHITE);
		btnDeleteItem.setBounds(830, 67, 109, 49);
		Menuframe.getContentPane().add(btnDeleteItem);

		initialize();
	}

	public static void main(String[] args) {
		Menu me = new Menu();
		me.Menuframe.setVisible(true);
	}

	public JLabel Total_PriceNumber;
	protected JFrame Menuframe;
	protected JLayeredPane panel_SubMenu;
	private JTable table;
	private String TotalPrice;
	private JLabel TextMoji_choc;
	private JLabel TextPudding_choc;
	private JLabel TextPudding_milk;
	private JLabel TextMoji_GreenTea;
	private JLabel TextCroissant;
	private JLabel TextBreadGalic;
	private JLabel TextMilkTea;
	private JLabel TextGreenTea;
	private JLabel TextLimeTea;
	private JLabel TextColdTea;
	private JLabel TextColdMilk;
	private JLabel TextCocho;
	private JLabel TextAmericano;
	private JLabel TextCapucino;
	private JLabel TextEspresso;
	private JLabel TextLate;
	private JLabel TextMocha;
	private JLabel TextBlackTea;
	private int[] count = new int[18];
}
