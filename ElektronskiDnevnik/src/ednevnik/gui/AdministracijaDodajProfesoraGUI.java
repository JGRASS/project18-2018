package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ednevnik.gui.kontroler.GUIKontroler;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministracijaDodajProfesoraGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldImeIPrezimeProfesora;
	private JTextField textFieldKIme;
	private JTextField textFieldLozinka;

	/**
	 * Create the frame.
	 */
	public AdministracijaDodajProfesoraGUI() {
		setTitle("Dodaj profesora");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministracijaDodajProfesoraGUI.class.getResource("/icons/Shield-iconNajmanja.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		textFieldKIme = new JTextField();
		textFieldKIme.setColumns(10);
		textFieldKIme.setBounds(221, 80, 131, 20);
		contentPane.add(textFieldKIme);
		
		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblLozinka.setBounds(10, 122, 153, 14);
		contentPane.add(lblLozinka);
		
		textFieldLozinka = new JTextField();
		textFieldLozinka.setColumns(10);
		textFieldLozinka.setBounds(221, 120, 131, 20);
		contentPane.add(textFieldLozinka);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIKontroler.dodajProfesora(textFieldImeIPrezimeProfesora.getText(), textFieldKIme.getText(), textFieldLozinka.getText());
				dispose();
			}
		});
		btnDodaj.setBounds(170, 203, 89, 23);
		contentPane.add(btnDodaj);
	}

}
