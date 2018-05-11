package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class AdministracijaDodajProfesoraGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldImeIPrezimeProfesora;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministracijaDodajProfesoraGUI frame = new AdministracijaDodajProfesoraGUI();
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
	public AdministracijaDodajProfesoraGUI() {
		setTitle("Dodaj profesora");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministracijaDodajProfesoraGUI.class.getResource("/icons/Shield-iconNajmanja.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime profesora:");
		lblImeIPrezime.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblImeIPrezime.setBounds(10, 43, 153, 14);
		contentPane.add(lblImeIPrezime);
		
		textFieldImeIPrezimeProfesora = new JTextField();
		textFieldImeIPrezimeProfesora.setBounds(221, 41, 131, 20);
		contentPane.add(textFieldImeIPrezimeProfesora);
		textFieldImeIPrezimeProfesora.setColumns(10);
		
		JLabel lblKorisnickoIme = new JLabel("Korisnicko ime:");
		lblKorisnickoIme.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblKorisnickoIme.setBounds(10, 86, 153, 14);
		contentPane.add(lblKorisnickoIme);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(221, 80, 131, 20);
		contentPane.add(textField);
		
		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblLozinka.setBounds(10, 122, 153, 14);
		contentPane.add(lblLozinka);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 120, 131, 20);
		contentPane.add(textField_1);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(170, 203, 89, 23);
		contentPane.add(btnDodaj);
	}

}
