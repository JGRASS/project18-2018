package ednevnik.sistemskeoperacije;

import java.util.LinkedList;

import ednevnik.Profesor;
import ednevnik.Roditelj;

/**
 * Klasa koja sadrzi metodu SODodajProfesora
 * @author Milos Pecikoza
 * @author Ana Slovic
 * @author Aleksa Vucetic
 * @version 1.0
 */
public class SODodajProfesora {

	/**
	 * Metoda koja dodaje profesora u listu profesora koji imaju pristup sistemu
	 * @param prof Profesor 
	 * @param profesori lista profesora 
	 */
	public static void izvrsi(Profesor prof,LinkedList<Profesor> profesori) {
		if(prof==null)
			throw new RuntimeException("Profesor ne moze biti null.");
		if(profesori.contains(prof))
			throw new RuntimeException("Profesor je vec unet u listu profesora.");
		
		profesori.add(prof);
		
	}
}
