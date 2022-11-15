package Pos_Project;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Login {

	protected JFrame frmTextshop;
	private ImageIcon imgIcon;
	private JTextField textFieldUser;
	private JLabel Label_Pass;
	private JPasswordField textFieldPass;
	private JButton BEnter;
	private String admin = "admin";
	private String password = "admin123";

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTextshop = new JFrame();
		frmTextshop.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/resources/abc.png")));
		frmTextshop.setResizable(false);
		frmTextshop.setBackground(new Color(240, 240, 240));
		frmTextshop.getContentPane().setBackground(new Color(248, 209, 224));
		frmTextshop.setTitle("TextShop");
		frmTextshop.setBounds(100, 100, 1080, 720);
		frmTextshop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTextshop.getContentPane().setLayout(null);
		
		JLabel Label_Logo = new JLabel("");
		Label_Logo.setIcon(new ImageIcon(Login.class.getResource("/resources/gonhintest2.jpg")));
		Label_Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Logo.setBounds(241, 47, 564, 259);
		frmTextshop.getContentPane().add(Label_Logo);
		
		JLabel Label_User = new JLabel("ชื่อผู้ใช้ : ");
		Label_User.setFont(new Font("Kanit", Font.PLAIN, 25));
		Label_User.setBounds(211, 381, 82, 47);
		frmTextshop.getContentPane().add(Label_User);
		
		textFieldUser = new JTextField();
		textFieldUser.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textFieldUser.setFont(new Font("Kanit", Font.PLAIN, 20));
		textFieldUser.setBackground(new Color(248, 225, 231));
		textFieldUser.setBounds(327, 393, 481, 33);
		frmTextshop.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		textFieldUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (textFieldUser.getText().equals(admin) && textFieldPass.getText().equals(password)) {
						JLabel messageDone = new JLabel("Success");
						JOptionPane.showMessageDialog(null, messageDone,"Alert",JOptionPane.WARNING_MESSAGE);
						Menu page_menu = new Menu();
						page_menu.Menuframe.setVisible(true);
						frmTextshop.dispose();
						
					}
					else if (textFieldUser.getText().isEmpty() || textFieldPass.getText().isEmpty()){
						JLabel messageFail = new JLabel("Please input user and password");
						JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
					
					}
					else {
						JLabel messageFail = new JLabel("User or Password incorrect");
						JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
						}
				}
			}
		});
		
		Label_Pass = new JLabel("รหัสผ่าน : ");
		Label_Pass.setFont(new Font("Kanit", Font.PLAIN, 25));
		Label_Pass.setBounds(191, 446, 102, 47);
		frmTextshop.getContentPane().add(Label_Pass);
		
		textFieldPass = new JPasswordField();
		textFieldPass.setFont(new Font("Kanit", Font.PLAIN, 20));
		textFieldPass.setColumns(10);
		textFieldPass.setBackground(new Color(248, 225, 231));
		textFieldPass.setBounds(327, 456, 481, 33);
		frmTextshop.getContentPane().add(textFieldPass);
		
		
		//Button UserLogin
		BEnter = new JButton("เข้าสู่ระบบ");
		
		textFieldPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (textFieldUser.getText().equals(admin) && textFieldPass.getText().equals(password)) {
						JLabel messageDone = new JLabel("Success");
						JOptionPane.showMessageDialog(null, messageDone,"Alert",JOptionPane.WARNING_MESSAGE);
						Menu page_menu = new Menu();
						page_menu.Menuframe.setVisible(true);
						frmTextshop.dispose();
						
					}
					else if (textFieldUser.getText().isEmpty() || textFieldPass.getText().isEmpty()){
						JLabel messageFail = new JLabel("Please input user and password");
						JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
					
					}
					else {
						JLabel messageFail = new JLabel("User or Password incorrect");
						JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
						}
				}
			}
		});
		BEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BEnter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textFieldUser.getText().equals(admin) && textFieldPass.getText().equals(password)) {
					JLabel messageDone = new JLabel("Success");
					JOptionPane.showMessageDialog(null, messageDone,"Alert",JOptionPane.WARNING_MESSAGE);
					Menu page_menu = new Menu();
					page_menu.Menuframe.setVisible(true);
					frmTextshop.dispose();
					
				}
				else if (textFieldUser.getText().isEmpty() || textFieldPass.getText().isEmpty()){
					JLabel messageFail = new JLabel("Please input user and password");
					JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
				
				}
				else {
					JLabel messageFail = new JLabel("User or Password incorrect");
					JOptionPane.showMessageDialog(null,messageFail,"Error",JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		BEnter.setForeground(new Color(0, 0, 0));
		BEnter.setBackground(new Color(251, 214, 198));
		BEnter.setFont(new Font("WR Tish Kid", Font.BOLD, 35));
		BEnter.setBounds(378, 582, 274, 54);
		frmTextshop.getContentPane().add(BEnter);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 21, 270, 59);
		
	}
}
