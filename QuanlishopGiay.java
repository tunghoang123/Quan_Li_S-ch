package quanlishopgiay;
 
import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class QuanlishopGiay extends JFrame {
	private JPanel contentPane;
	private JTextField txtMenu;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanlishopGiay frame = new QuanlishopGiay();
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
	public QuanlishopGiay() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tungv\\Downloads\\Y-tuong-thiet-ke-noi-that-cua-hang-phu-kien.jpg"));
		setTitle("ShopGiayTuyet.com");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1165, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN Shop Giày");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(354, 10, 379, 46);
		contentPane.add(lblNewLabel);
		
		txtMenu = new JTextField();
		txtMenu.setFont(new Font("Times New Roman", Font.BOLD, 21));
		txtMenu.setForeground(Color.RED);
		txtMenu.setText("   MENU");
		txtMenu.setBounds(128, 69, 106, 34);
		contentPane.add(txtMenu);
		txtMenu.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tên giày:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(128, 145, 88, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã giày:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(128, 176, 88, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số lượng:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(128, 206, 88, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("SIZE:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(128, 238, 88, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(249, 145, 369, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(249, 175, 369, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(249, 205, 369, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(249, 237, 369, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnThm = new JButton("Thêm");
		btnThm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThm.setBounds(678, 145, 99, 21);
		contentPane.add(btnThm);
		
		JButton btnSa = new JButton("Sửa ");
		btnSa.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSa.setBounds(678, 177, 99, 21);
		contentPane.add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnXa.setBounds(678, 207, 99, 21);
		contentPane.add(btnXa);
		
		JButton btnSpXp = new JButton("Sắp xếp");
		btnSpXp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSpXp.setBounds(678, 239, 99, 21);
		contentPane.add(btnSpXp);
		
		JPanel panel = new JPanel();
		panel.setBounds(259, 268, 350, 52);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"T\u00EAn Gi\u00E0y", "M\u00E3 Gi\u00E0y", "S\u1ED1 L\u01B0\u1EE3ng", "SIZE"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		panel.add(table);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\tungv\\Downloads\\0-thiet-ke-shop-giay-anh-tuan-anh-cau-giay (1) (1).jpg"));
		btnNewButton_4.setBounds(41, 340, 1027, 277);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\tungv\\Downloads\\Y-tuong-thiet-ke-noi-that-cua-hang-phu-kien.jpg"));
		btnNewButton_5.setBounds(827, 64, 284, 238);
		contentPane.add(btnNewButton_5);
	}
}
