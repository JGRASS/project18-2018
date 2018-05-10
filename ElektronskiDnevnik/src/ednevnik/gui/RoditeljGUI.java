package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RoditeljGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldImeIPrezimeUcenika;
	private JTextField textFieldJMBGUcenika;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoditeljGUI frame = new RoditeljGUI();
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
	public RoditeljGUI() {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izadji();
			}
		});
		setTitle("Roditelj / ucenik");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RoditeljGUI.class.getResource("/icons/Group-icon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		panel.setBackground(new Color(204, 255, 153));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JLabel lblIzaberiUcenika = new JLabel("Izaberi ucenika:");
		lblIzaberiUcenika.setBounds(10, 11, 144, 19);
		lblIzaberiUcenika.setFont(new Font("Open Sans", Font.PLAIN, 18));
		panel.add(lblIzaberiUcenika);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime ucenika:");
		lblImeIPrezime.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblImeIPrezime.setBounds(10, 28, 157, 23);
		panel_1.add(lblImeIPrezime);
		
		textFieldImeIPrezimeUcenika = new JTextField();
		textFieldImeIPrezimeUcenika.setBounds(267, 30, 157, 20);
		panel_1.add(textFieldImeIPrezimeUcenika);
		textFieldImeIPrezimeUcenika.setColumns(10);
		
		JLabel lblJmbgUcenika = new JLabel("JMBG ucenika:");
		lblJmbgUcenika.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblJmbgUcenika.setBounds(10, 62, 157, 14);
		panel_1.add(lblJmbgUcenika);
		
		textFieldJMBGUcenika = new JTextField();
		textFieldJMBGUcenika.setBounds(267, 61, 157, 20);
		panel_1.add(textFieldJMBGUcenika);
		textFieldJMBGUcenika.setColumns(10);
		
		JButton btnIzaberi = new JButton("Izaberi");
		btnIzaberi.setBounds(169, 161, 89, 23);
		panel_1.add(btnIzaberi);
	}
	
	private void izadji() {
		int opcija = 
				JOptionPane.showConfirmDialog(
					contentPane, "Da li zaista zelite da izadjete?",
					"Izlaz", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (opcija == JOptionPane.YES_OPTION)
				System.exit(0);
	}
}
