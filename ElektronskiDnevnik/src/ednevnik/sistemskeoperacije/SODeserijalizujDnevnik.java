package ednevnik.sistemskeoperacije;
/**
* Klasa koja sadrzi metodu SODeserijalizujDnevnik
* @author Milos Pecikoza
* @author Ana Slovic
* @author Aleksa Vucetic
* @version 1.0
*/
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import ednevnik.EDnevnik;

public class SODeserijalizujDnevnik {
	
	/**
	 * Metoda koja izvrsava deserijalizaciju dnevnika
	 * @return objekat dnevnika
	 */
	public static EDnevnik izvrsi() {
		EDnevnik d = new EDnevnik();
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Dnevnik.out")))){
			return (EDnevnik)in.readObject();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}