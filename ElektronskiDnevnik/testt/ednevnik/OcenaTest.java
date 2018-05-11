package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcenaTest {

	Ocena o;

	@Before
	public void setUp() throws Exception {
		o = new Ocena();
	}

	@After
	public void tearDown() throws Exception {
		o = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetBrOceneManjiOd1() {
		o.setBrOcene(0);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetBrOceneVeciOd5() {
		o.setBrOcene(7);
	}
	
	@Test
	public void testSetBrOcene() {
		o.setBrOcene(2);
		
		assertEquals(o.getBrOcene(), 2);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPredmetNull() {
		o.setPredmet(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPredmetPrazan() {
		o.setPredmet("");
	}
	
	@Test
	public void testSetPredmet() {
		o.setPredmet("Hemija");
		
		assertEquals(o.getPredmet(), "Hemija");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetOpisNull() {
		o.setOpis(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetOpisPrazan() {
		o.setOpis("");
	}
	
	@Test
	public void testSetOpis() {
		o.setOpis("usmeni");
	
		assertEquals(o.getOpis(), "usmeni");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPolugodisteManjeOd1() {
		o.setPolugodiste(0);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPolugodisteVecaOd2() {
		o.setPolugodiste(3);
	}
	
	@Test
	public void testSetPolugodiste() {
		o.setPolugodiste(1);
		
		assertEquals(o.getPolugodiste(), 1);
	}
	
	@Test
	public void testEqualsObjectTrue() {
		o.setBrOcene(2);
		o.setOpis("usmeni");
		o.setPolugodiste(1);
		o.setPredmet("Hemija");
		
		Ocena p = new Ocena();
		p.setBrOcene(2);
		p.setOpis("usmeni");
		p.setPolugodiste(1);
		p.setPredmet("Hemija");
		
		assertTrue(o.equals(p));
	}
	
	@Test
	public void testEqualsObjectFalse1() {
		o.setBrOcene(2);
		o.setOpis("usmen");
		o.setPolugodiste(1);
		o.setPredmet("Hemija");
		
		Ocena p = new Ocena();
		p.setBrOcene(2);
		p.setOpis("usmeni");
		p.setPolugodiste(1);
		p.setPredmet("Hemija");
		
		assertFalse(o.equals(p));
	}
	
	@Test
	public void testEqualsObjectFalse2() {
		o.setBrOcene(2);
		o.setOpis("usmen");
		o.setPolugodiste(1);
		o.setPredmet("Matematika");
		
		Ocena p = new Ocena();
		p.setBrOcene(2);
		p.setOpis("usmeni");
		p.setPolugodiste(1);
		p.setPredmet("Hemija");
		
		assertFalse(o.equals(p));
	}
}
