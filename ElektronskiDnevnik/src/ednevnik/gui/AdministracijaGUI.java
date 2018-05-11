package ednevnik.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class AdministracijaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JScrollPane scrollPane;
	private JTextArea textAreaPrikaz;
	private JPanel panel;
	private JLabel lblIzbor;
	private JLabel lblNo;
	private JButton btnProfesore;
	private JButton btnNewButton;
	private JComboBox comboBoxDodaj;
	private JButton btnDodaj;
	private JLabel lblObrii;
	private JComboBox comboBoxObrisi;
	private JButton btnObrii;
	private JMenu mnNewMenu;
	private JMenuItem mntmNoviDnevnik;
	private JMenuItem mntmNoviRazred;
	private JMenuItem mntmNovoOdeljenje;
	private JMenuItem mntmNoviProfesor;
	private JMenuItem mntmZatvori;
	private JMenuItem mntmAbout;
	private JComboBox comboBox3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministracijaGUI frame = new AdministracijaGUI();
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
	public AdministracijaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministracijaGUI.class.getResource("/icons/Shield-iconNajmanja.png")));
		setTitle("E-dnevnik administracija");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 644, 399);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
		
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMnNewMenu());
			mnFile.add(getMntmZatvori());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextAreaPrikaz());
		}
		return scrollPane;
	}
	private JTextArea getTextAreaPrikaz() {
		if (textAreaPrikaz == null) {
			textAreaPrikaz = new JTextArea();
		}
		return textAreaPrikaz;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setVisible(false);
			panel.setBackground(new Color(204, 255, 153));
			panel.setPreferredSize(new Dimension(300, 10));
			panel.setLayout(null);
			panel.add(getLblIzbor());
			panel.add(getLblNo());
			panel.add(getBtnProfesore());
			panel.add(getBtnNewButton());
			panel.add(getComboBox_1());
			panel.add(getBtnDodaj());
			panel.add(getLblObrii());
			panel.add(getComboBoxObrisi());
			panel.add(getBtnObrii());
			panel.add(getComboBox3());
			
			JComboBox comboBox = new JComboBox();
			comboBox.setEnabled(false);
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
			comboBox.setBounds(200, 134, 71, 20);
			panel.add(comboBox);
		}
		return panel;
	}
	private JLabel getLblIzbor() {
		if (lblIzbor == null) {
			lblIzbor = new JLabel("Prika\u017Ei...");
			lblIzbor.setFont(new Font("Open Sans", Font.ITALIC, 15));
			lblIzbor.setBounds(10, 27, 91, 14);
		}
		return lblIzbor;
	}
	private JLabel getLblNo() {
		if (lblNo == null) {
			lblNo = new JLabel("Novo...");
			lblNo.setFont(new Font("Tahoma", Font.ITALIC, 15));
			lblNo.setBounds(10, 135, 64, 14);
		}
		return lblNo;
	}
	private JButton getBtnProfesore() {
		if (btnProfesore == null) {
			btnProfesore = new JButton("Profesore");
			btnProfesore.setBackground(new Color(255, 255, 255));
			btnProfesore.setFont(new Font("Open Sans", Font.PLAIN, 13));
			btnProfesore.setBounds(83, 24, 107, 23);
		}
		return btnProfesore;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Odeljenje");
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Open Sans", Font.PLAIN, 13));
			btnNewButton.setBounds(83, 58, 107, 23);
		}
		return btnNewButton;
	}
	private JComboBox getComboBox_1() {
		if (comboBoxDodaj == null) {
			comboBoxDodaj = new JComboBox();
			comboBoxDodaj.setModel(new DefaultComboBoxModel(new String[] {"Profesor", "Odeljenje", "Razred"}));
			comboBoxDodaj.setForeground(new Color(255, 255, 255));
			comboBoxDodaj.setBackground(new Color(102, 153, 102));
			comboBoxDodaj.setFont(new Font("Open Sans", Font.PLAIN, 13));
			comboBoxDodaj.setBounds(84, 134, 106, 20);
		}
		return comboBoxDodaj;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.setBackground(new Color(255, 255, 255));
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnDodaj.setFont(new Font("Open Sans", Font.PLAIN, 13));
			btnDodaj.setBounds(55, 166, 89, 23);
		}
		return btnDodaj;
	}
	private JLabel getLblObrii() {
		if (lblObrii == null) {
			lblObrii = new JLabel("Brisanje...");
			lblObrii.setFont(new Font("Open Sans", Font.ITALIC, 15));
			lblObrii.setBounds(10, 238, 78, 14);
		}
		return lblObrii;
	}
	private JComboBox getComboBoxObrisi() {
		if (comboBoxObrisi == null) {
			comboBoxObrisi = new JComboBox();
			comboBoxObrisi.setForeground(new Color(255, 255, 255));
			comboBoxObrisi.setBackground(new Color(102, 153, 102));
			comboBoxObrisi.setFont(new Font("Open Sans", Font.PLAIN, 13));
			comboBoxObrisi.setBounds(106, 236, 107, 20);
		}
		return comboBoxObrisi;
	}
	private JButton getBtnObrii() {
		if (btnObrii == null) {
			btnObrii = new JButton("Obri\u0161i");
			btnObrii.setBackground(new Color(255, 255, 255));
			btnObrii.setFont(new Font("Open Sans", Font.PLAIN, 13));
			btnObrii.setBounds(55, 266, 89, 23);
		}
		return btnObrii;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Novo...");
			mnNewMenu.add(getMntmNoviDnevnik());
			mnNewMenu.add(getMntmNoviRazred());
			mnNewMenu.add(getMntmNovoOdeljenje());
			mnNewMenu.add(getMntmNoviProfesor());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNoviDnevnik() {
		if (mntmNoviDnevnik == null) {
			mntmNoviDnevnik = new JMenuItem("Novi dnevnik");
		}
		return mntmNoviDnevnik;
	}
	private JMenuItem getMntmNoviRazred() {
		if (mntmNoviRazred == null) {
			mntmNoviRazred = new JMenuItem("Novi razred");
		}
		return mntmNoviRazred;
	}
	private JMenuItem getMntmNovoOdeljenje() {
		if (mntmNovoOdeljenje == null) {
			mntmNovoOdeljenje = new JMenuItem("Novo odeljenje");
		}
		return mntmNovoOdeljenje;
	}
	private JMenuItem getMntmNoviProfesor() {
		if (mntmNoviProfesor == null) {
			mntmNoviProfesor = new JMenuItem("Novi profesor");
		}
		return mntmNoviProfesor;
	}
	private JMenuItem getMntmZatvori() {
		if (mntmZatvori == null) {
			mntmZatvori = new JMenuItem("Zatvori");
		}
		return mntmZatvori;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About...");
		}
		return mntmAbout;
	}
	private JComboBox getComboBox3() {
		if (comboBox3 == null) {
			comboBox3 = new JComboBox();
			comboBox3.setEnabled(false);
			comboBox3.setForeground(new Color(255, 255, 255));
			comboBox3.setBackground(new Color(102, 153, 102));
			comboBox3.setBounds(200, 60, 71, 20);
		}
		return comboBox3;
	}
}
