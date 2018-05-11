package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UcenikTest {

	Ucenik p;
	
	@Before
	public void setUp() throws Exception {
		 p =new Ucenik();
	}

	@After
	public void tearDown() throws Exception {
		 p = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimeNull() {
		p.setImePrezime(null);		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImePrezimePrazan() {
		p.setImePrezime("");		
	}
	
	@Test
	public void testSetImePrezime() {
		p.setImePrezime("Milos");
		
		assertEquals(p.getImePrezime(), "Milos");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeRoditeljaNull() {
		p.setImePrezime(null);		
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetImeRoditeljaPrazan() {
		p.setImePrezime("");		
	}
	
	@Test
	public void testSetImeRoditelja() {
		p.setImePrezime("Milos");
		
		assertEquals(p.getImePrezime(), "Milos");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgNull() {
		p.setJmbg(null);	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgPrazan() {
		p.setJmbg("");	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgRazlicitoOd13Brojeva() {
		p.setJmbg("132");	
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetJmbgRazlicitoOd13Brojeva2() {
		p.setJmbg("12345678910111213");	
	}
	
	@Test
	public void testSetJmbg() {
		p.setJmbg("1234567891234");
		
		assertEquals(p.getJmbg(), "1234567891234");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetOpravdaniIzostanciManjeOd0() {
		p.setOpravdaniIzostanci(-2);
	}
	
	@Test
	public void testSetOpravdaniIzostanci() {
		p.setOpravdaniIzostanci(2);
		
		assertEquals(p.getOpravdaniIzostanci(), 2);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetNeopravdaniIzostanciManjeOd0() {
		p.setNeopravdaniIzostanci(-2);
	}
	
	@Test
	public void testSetNeopravdaniIzostanci() {
		p.setNeopravdaniIzostanci(2);
		
		assertEquals(p.getNeopravdaniIzostanci(), 2);
	}
	
	@Test
	public void testEqualsObjectTrue() {
		p.setNeopravdaniIzostanci(2);
		p.setImePrezime("Milos");
		p.setJmbg("1234567891234");
		p.setNeopravdaniIzostanci(2);
		p.setOpravdaniIzostanci(2);
		
		Ucenik a = new Ucenik();
		a.setNeopravdaniIzostanci(2);
		a.setImePrezime("Milos");
		a.setJmbg("1234567891234");
		a.setNeopravdaniIzostanci(2);
		a.setOpravdaniIzostanci(2);
		
		assertTrue(p.equals(a));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		p.setNeopravdaniIzostanci(2);
		p.setImePrezime("Vlatko");
		p.setJmbg("1234567891234");
		p.setNeopravdaniIzostanci(2);
		p.setOpravdaniIzostanci(2);
		
		Ucenik a = new Ucenik();
		a.setNeopravdaniIzostanci(2);
		a.setImePrezime("Milos");
		a.setJmbg("1234567891234");
		a.setNeopravdaniIzostanci(2);
		a.setOpravdaniIzostanci(2);
		
		assertFalse(p.equals(a));
	}

	@Test
	public void testToString() {
		p.setNeopravdaniIzostanci(2);
		p.setImePrezime("Vlatko");
		p.setJmbg("1234567891234");
		p.setNeopravdaniIzostanci(2);
		p.setOpravdaniIzostanci(2);
	
		assertEquals(p.toString(), "Ucenik [imePrezime=Vlatko, imeRoditelja=null, jmbg=1234567891234, ocene=null, opravdaniIzostanci=2, neopravdaniIzostanci=2, napomene=null]");
	}
	

}
