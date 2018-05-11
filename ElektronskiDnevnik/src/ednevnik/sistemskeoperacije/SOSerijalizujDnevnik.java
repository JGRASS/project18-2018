package ednevnik.sistemskeoperacije;
/**
* Klasa koja sadrzi metodu SOSerijalizujDnevnik
* @author Milos Pecikoza
* @author Ana Slovic
* @author Aleksa Vucetic
* @version 1.0
*/
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ednevnik.EDnevnik;

public class SOSerijalizujDnevnik {
	
	/**
	 * Metoda koja izvrsava serijalizaciju dnevnika
	 * @param d je objekat dnevnika koji treba da se serijalizuje
	 */
	public static void izvrsi(EDnevnik d) {
		try (			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Dnevnik.out")))){
			out.writeObject(d);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}