package ednevnik.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import ednevnik.Profesor;

public class SOSerijalizujProfesora {
	public static void izvrsi(LinkedList<Profesor> p) {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("fajlovi/Profesori.out")))){
			out.writeObject(p);
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}

