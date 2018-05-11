package ednevnik.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import ednevnik.Profesor;

public class SODeserijalizujProfesore {
	public static LinkedList<Profesor> izvrsi() {
		try(ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("fajlovi/Profesori.out")))){
			return (LinkedList<Profesor>)(in.readObject());
		}catch(Exception e){
			return new LinkedList<Profesor>();
		}
	}
}
