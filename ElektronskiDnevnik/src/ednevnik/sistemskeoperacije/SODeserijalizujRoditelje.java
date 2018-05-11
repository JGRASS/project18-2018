package ednevnik.sistemskeoperacije;

import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import ednevnik.Roditelj;

public class SODeserijalizujRoditelje {
	public static LinkedList<Roditelj> izvrsi() {
		try(ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("Roditelji.out")));){
			return (LinkedList<Roditelj>)(in.readObject());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
