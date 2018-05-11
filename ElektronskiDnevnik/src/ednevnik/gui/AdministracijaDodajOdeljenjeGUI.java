package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdministracijaDodajOdeljenjeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBrojOedljenja;
	private JTextField textFieldImePrezimeRazrednog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministracijaDodajOdeljenjeGUI frame = new AdministracijaDodajOdeljenjeGUI();
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
	public AdministracijaDodajOdeljenjeGUI() {
		setTitle("Dodaj odeljenje");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministracijaDodajOdeljenjeGUI.class.getResource("/icons/Shield-iconNajmanja.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRedniBrojOdeljenja = new JLabel("Redni broj odeljenja:");
		lblRedniBrojOdeljenja.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblRedniBrojOdeljenja.setBounds(10, 33, 149, 20);
		contentPane.add(lblRedniBrojOdeljenja);
		
		textFieldBrojOedljenja = new JTextField();
		textFieldBrojOedljenja.setBounds(274, 34, 63, 20);
		contentPane.add(textFieldBrojOedljenja);
		textFieldBrojOedljenja.setColumns(10);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime razrednog staresine:");
		lblImeIPrezime.setFont(new Font("Open Sans", Font.PLAIN, 12));
		lblImeIPrezime.setBounds(10, 64, 210, 20);
		contentPane.add(lblImeIPrezime);
		
		textFieldImePrezimeRazrednog = new JTextField();
		textFieldImePrezimeRazrednog.setColumns(10);
		textFieldImePrezimeRazrednog.setBounds(274, 65, 150, 20);
		contentPane.add(textFieldImePrezimeRazrednog);
		
		JButton btnDodajUcenike = new JButton("Dodaj ucenike");
		btnDodajUcenike.setFont(new Font("Open Sans", Font.PLAIN, 12));
		btnDodajUcenike.setBounds(10, 95, 129, 23);
		contentPane.add(btnDodajUcenike);
		
		JButton btnDodajPredmete = new JButton("Dodaj predmete");
		btnDodajPredmete.setFont(new Font("Open Sans", Font.PLAIN, 12));
		btnDodajPredmete.setBounds(10, 129, 129, 23);
		contentPane.add(btnDodajPredmete);
	}

}
