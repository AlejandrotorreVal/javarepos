package atm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;

public class gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(40, 370, 85, 34);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 204));
		panel.setBounds(10, 10, 736, 119);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAIXABANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(291, 65, 125, 54);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(135, 370, 85, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(230, 370, 85, 34);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("6");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBounds(230, 414, 85, 34);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(135, 414, 85, 34);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(40, 414, 85, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1_2 = new JButton("9");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2.setBounds(230, 458, 85, 34);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(40, 458, 85, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_3_1 = new JButton("8");
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_3_1.setBounds(135, 458, 85, 34);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_1_2_2 = new JButton("0");
		btnNewButton_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2_2.setBounds(135, 502, 85, 34);
		contentPane.add(btnNewButton_1_1_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(102, 102, 102));
		panel_2.setBounds(10, 127, 736, 210);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(10, 10, 555, 191);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 204, 153));
		panel_3.setBounds(10, 10, 535, 171);
		panel_1.add(panel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(Color.BLACK);
		panel_2_1.setBackground(new Color(102, 102, 102));
		panel_2_1.setBounds(10, 345, 736, 217);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(326, 25, 10, 169);
		panel_2_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 153, 153));
		panel_5.setBounds(10, 10, 470, 197);
		panel_2_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Aceptar");
		btnNewButton_1_1_2_1.setBounds(361, 129, 85, 44);
		panel_5.add(btnNewButton_1_1_2_1);
		btnNewButton_1_1_2_1.setBackground(new Color(102, 255, 0));
		
		JButton btnNewButton_1_1_1_1 = new JButton("Borrar");
		btnNewButton_1_1_1_1.setBounds(361, 75, 85, 44);
		panel_5.add(btnNewButton_1_1_1_1);
		btnNewButton_1_1_1_1.setBackground(new Color(255, 255, 51));
		
		JButton btnNewButton_1_1_3 = new JButton("Cancelar");
		btnNewButton_1_1_3.setBounds(361, 21, 85, 44);
		panel_5.add(btnNewButton_1_1_3);
		btnNewButton_1_1_3.setBackground(new Color(255, 0, 0));
	}
}
