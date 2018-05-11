package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RazredTest {

	Razred o;

	@Before
	public void setUp() throws Exception {
		 o = new Razred();
	}

	@After
	public void tearDown() throws Exception {
		o = null;
	}


	@Test(expected = java.lang.RuntimeException.class)
	public void testSetRedniBrojManjiOd1() {
		o.setRedniBroj(0);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetRedniBrojVeciOd8() {
		o.setRedniBroj(9);
	}
	
	@Test
	public void testSetRedniBroj() {
		o.setRedniBroj(4);
		
		assertEquals(o.getRedniBroj(), 4);
	}
	
	@Test
	public void testEqualsObjectTrue() {
		o.setRedniBroj(4);
		
		Razred r = new Razred();
		r.setRedniBroj(4);
		
		assertTrue(o.equals(r));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		o.setRedniBroj(3);
		
		Razred r = new Razred();
		r.setRedniBroj(4);
		
		assertFalse(o.equals(r));
	}
	
	@Test
	public void testToString() {
		o.setRedniBroj(4);
		
		assertEquals(o.toString(), "Razred [redniBroj=4, odeljenja=null]");
	}
}
