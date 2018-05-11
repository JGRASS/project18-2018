package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ednevnik.gui.kontroler.GUIKontroler;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UlazGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblPrijava;
	private JPanel panel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JRadioButton rdbtnProfesor;
	private JRadioButton rdbtnRoditelj;
	private JRadioButton rdbtnAdministracija;
	private JLabel lblKorisnikoIme;
	private JTextField textFieldKorisnickoIme;
	private JLabel lblLozinka;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	private JButton btnPrijaviSe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UlazGUI frame = new UlazGUI();
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
	public UlazGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izadji();
			}
		});
		setResizable(false);
		setTitle("E-dnevnik");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UlazGUI.class.getResource("/icons/Addressbook-4-icon.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 463, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getPanel_1(), BorderLayout.CENTER);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(204, 255, 153));
			panel.setPreferredSize(new Dimension(10, 50));
			panel.setLayout(null);
			panel.add(getLblPrijava());
		}
		return panel;
	}
	private JLabel getLblPrijava() {
		if (lblPrijava == null) {
			lblPrijava = new JLabel("Prijava:");
			lblPrijava.setFont(new Font("Open Sans", Font.PLAIN, 18));
			lblPrijava.setBounds(10, 11, 94, 28);
		}
		return lblPrijava;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setLayout(null);
			panel_1.add(getLabel());
			panel_1.add(getLabel_1());
			panel_1.add(getLabel_2());
			panel_1.add(getRdbtnProfesor());
			panel_1.add(getRdbtnRoditelj());
			panel_1.add(getRdbtnAdministracija());
			panel_1.add(getLblKorisnikoIme());
			panel_1.add(getTextFieldKorisnickoIme());
			panel_1.add(getLblLozinka());
			panel_1.add(getPasswordField());
			panel_1.add(getBtnPrijaviSe());
		}
		return panel_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon(UlazGUI.class.getResource("/icons/Group-icon (3).png")));
			label.setBounds(188, 33, 67, 58);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(UlazGUI.class.getResource("/icons/Shield-icon (2).png")));
			label_1.setBounds(308, 33, 60, 58);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(UlazGUI.class.getResource("/icons/Degree-icon (3).png")));
			label_2.setBounds(71, 33, 67, 58);
		}
		return label_2;
	}
	private JRadioButton getRdbtnProfesor() {
		if (rdbtnProfesor == null) {
			rdbtnProfesor = new JRadioButton("Profesor");
			rdbtnProfesor.setBackground(new Color(255, 255, 255));
			buttonGroup.add(rdbtnProfesor);
			rdbtnProfesor.setFont(new Font("Open Sans", Font.PLAIN, 11));
			rdbtnProfesor.setBounds(62, 96, 95, 23);
		}
		return rdbtnProfesor;
	}
	private JRadioButton getRdbtnRoditelj() {
		if (rdbtnRoditelj == null) {
			rdbtnRoditelj = new JRadioButton("Roditelj / u\u010Denik");
			rdbtnRoditelj.setBackground(new Color(255, 255, 255));
			buttonGroup.add(rdbtnRoditelj);
			rdbtnRoditelj.setFont(new Font("Open Sans", Font.PLAIN, 11));
			rdbtnRoditelj.setBounds(159, 96, 123, 23);
		}
		return rdbtnRoditelj;
	}
	private JRadioButton getRdbtnAdministracija() {
		if (rdbtnAdministracija == null) {
			rdbtnAdministracija = new JRadioButton("Administracija");
			rdbtnAdministracija.setBackground(new Color(255, 255, 255));
			buttonGroup.add(rdbtnAdministracija);
			rdbtnAdministracija.setFont(new Font("Open Sans", Font.PLAIN, 11));
			rdbtnAdministracija.setBounds(284, 96, 109, 23);
		}
		return rdbtnAdministracija;
	}
	private JLabel getLblKorisnikoIme() {
		if (lblKorisnikoIme == null) {
			lblKorisnikoIme = new JLabel("Korisni\u010Dko ime:");
			lblKorisnikoIme.setFont(new Font("Open Sans", Font.PLAIN, 12));
			lblKorisnikoIme.setBounds(113, 144, 95, 14);
		}
		return lblKorisnikoIme;
	}
	private JTextField getTextFieldKorisnickoIme() {
		if (textFieldKorisnickoIme == null) {
			textFieldKorisnickoIme = new JTextField();
			textFieldKorisnickoIme.setBounds(212, 142, 109, 20);
			textFieldKorisnickoIme.setColumns(10);
		}
		return textFieldKorisnickoIme;
	}
	private JLabel getLblLozinka() {
		if (lblLozinka == null) {
			lblLozinka = new JLabel("Lozinka:");
			lblLozinka.setFont(new Font("Open Sans", Font.PLAIN, 12));
			lblLozinka.setBounds(113, 176, 46, 14);
		}
		return lblLozinka;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(212, 173, 109, 20);
		}
		return passwordField;
	}
	
	private void izadji() {
		int opcija = 
				JOptionPane.showConfirmDialog(
					contentPane, "Da li zaista zelite da izadjete?",
					"Izlaz", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (opcija == JOptionPane.YES_OPTION)
				System.exit(0);
	}
	private JButton getBtnPrijaviSe() {
		if (btnPrijaviSe == null) {
			btnPrijaviSe = new JButton("Prijavi se");
			btnPrijaviSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {	
						GUIKontroler.prikaziAdministracijaGUI(rdbtnAdministracija.isSelected(),
								textFieldKorisnickoIme, passwordField);
						GUIKontroler.prikaziRoditeljGUI(rdbtnRoditelj.isSelected(), textFieldKorisnickoIme, passwordField);
					
				}
			});
			btnPrijaviSe.setBackground(new Color(204, 255, 153));
			btnPrijaviSe.setFont(new Font("Open Sans", Font.PLAIN, 11));
			btnPrijaviSe.setBounds(166, 210, 100, 23);
		}
		return btnPrijaviSe;
	}
	
	public void ulogujSe() {
		
		
		
			
		
		
		
	}
}
