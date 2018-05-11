package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PredmetTest {

	Predmet p;

	@Before
	public void setUp() throws Exception {
		p = new Predmet();
	}

	@After
	public void tearDown() throws Exception {
		p = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetNazivNull() {
		p.setNaziv(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetNazivPrazan() {
		p.setNaziv("");
	}
	
	@Test
	public void testSetNaziv() {
		p.setNaziv("Hemija");
		
		assertEquals(p.getNaziv(), "Hemija");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeProfesoraNull() {
		p.setImeProfesora(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeProfesoraPrazan() {
		p.setImeProfesora("");
	}
	
	@Test
	public void testSetImeProfesora() {
		p.setImeProfesora("Mia");
		
		assertEquals(p.getImeProfesora(), "Mia");
	}
	
	@Test
	public void testEqualsObjectTrue() {
		p.setImeProfesora("Milos");
		p.setNaziv("Hemija");
		
		Predmet m = new Predmet();
		
		m.setImeProfesora("Milos");
		m.setNaziv("Hemija");
		
		assertTrue(p.equals(m));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		p.setImeProfesora("Milos");
		p.setNaziv("Matematika");
		
		Predmet m = new Predmet();
		
		m.setImeProfesora("Milos");
		m.setNaziv("Hemija");
		
		assertFalse(p.equals(m));
	}
}
