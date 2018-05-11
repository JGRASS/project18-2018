package ednevnik.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import ednevnik.Profesor;

public class SODeserijalizujProfesore {
public static void izvrsi(LinkedList<Profesor> profesori) {
		
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Profesori.out")))){
			profesori.clear();
			try {
				while(true) {
					Profesor r = (Profesor)(in.readObject());
					profesori.add(r);
				}
			} catch (EOFException e) {}
			in.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
