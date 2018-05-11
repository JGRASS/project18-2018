package ednevnik.gui.kontroler;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ednevnik.EDnevnik;
import ednevnik.Korisnici;
import ednevnik.Profesor;
import ednevnik.gui.AdministracijaDodajProfesoraGUI;
import ednevnik.gui.AdministracijaGUI;
import ednevnik.gui.ProfesorGUI;
import ednevnik.gui.RoditeljGUI;
import ednevnik.gui.UlazGUI;
import ednevnik.interfejs.EDnevnikInterfejs;
import ednevnik.interfejs.KorisniciInterfejs;



public class GUIKontroler {
	public static EDnevnikInterfejs dnevnik= new EDnevnik();
	public static KorisniciInterfejs korisnici = new Korisnici();
	
	public static UlazGUI ug;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UlazGUI ug = new UlazGUI();
					ug.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prikaziAdministracijaGUI(boolean selected,JTextField kIme,JPasswordField pass) {
		if(selected==true) {
			String sifra="";
			for(int i=0;i<pass.getPassword().length;i++)
				sifra +=pass.getPassword()[i];
			if(kIme.getText().equals("admin") && sifra.equals("nosleep123")) {
				AdministracijaGUI prozor = new AdministracijaGUI();
				prozor.setLocationRelativeTo(null);
				prozor.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,
						"Uneli ste pogresno korisnicko ime ili sifru!", "Greska",
						JOptionPane.INFORMATION_MESSAGE);
				kIme.setText("");
			
			}
		}
	}
	public static void prikaziDodajProfesoraGUI(boolean selected) {
		if(selected) {
			AdministracijaDodajProfesoraGUI adp = new AdministracijaDodajProfesoraGUI();
			adp.setLocationRelativeTo(null);
			adp.setVisible(true);
		}
		
	}
	
	public static void prikaziRoditeljGUI(boolean selected,JTextField kIme,JPasswordField pass) {
		if(selected==true) {
			String sifra="";
			for(int i=0;i<pass.getPassword().length;i++)
				sifra +=pass.getPassword()[i];
			if(korisnici.uporediRoditelja(kIme.getText(), sifra)) {
				RoditeljGUI prozor = new RoditeljGUI();
				prozor.setLocationRelativeTo(null);
				prozor.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,
						"Uneli ste pogresno korisnicko ime ili sifru!", "Greska",
						JOptionPane.INFORMATION_MESSAGE);
				kIme.setText("");
			
			}
		}
		return;
	}
	
	public static void prikaziProfesorGUI(boolean selected,JTextField kIme,JPasswordField pass) {
		if(selected==true) {
			String sifra="";
			for(int i=0;i<pass.getPassword().length;i++)
				sifra +=pass.getPassword()[i];
			if(korisnici.uporediProfesora(kIme.getText(), sifra)) {
				ProfesorGUI prozor = new ProfesorGUI();
				prozor.setLocationRelativeTo(null);
				prozor.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,
						"Uneli ste pogresno korisnicko ime ili sifru!", "Greska",
						JOptionPane.INFORMATION_MESSAGE);
				kIme.setText("");
			
			}
		}
		return;
	}
	
	public static void prikaziSveProfesore(JTextArea area) {
		area.setText(korisnici.prikaziSveProfesore());
	}
	
	public static void dodajProfesora(String imePrezime, String korisnickoIme,String sifra) {
		try {
			Profesor p = new Profesor();

			p.setImePrezime(imePrezime);
			p.setKorisnicnoIme(korisnickoIme);
			p.setSifra(sifra);
			
			korisnici.dodajProfesora(p);
			
			
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
	
}
