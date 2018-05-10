package ednevnik.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ednevnik.EDnevnik;

public class SOSerijalizujDnevnik {
	
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