package ednevnik;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EDnevnikTest {

	EDnevnik d;

	@Before
	public void setUp() throws Exception {
		d = new EDnevnik();
	}

	@After
	public void tearDown() throws Exception {
		d = null;
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSkolskaGodinaNull() {
		d.setSkolskaGodina(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSkolskaGodinaPrazan() {
		d.setSkolskaGodina("");
	}
	
	@Test
	public void testSetSkolskaGodina() {
		d.setSkolskaGodina("2016/17");
		
		assertEquals(d.getSkolskaGodina(), "2016/17");
	}
	
	@Test
	public void testEqualsObjectTrue() {
		d.setSkolskaGodina("2016/17");
		
		EDnevnik e = new EDnevnik();
		e.setSkolskaGodina("2016/17");
		
		assertTrue(d.equals(e));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		d.setSkolskaGodina("2013/17");
		
		EDnevnik e = new EDnevnik();
		e.setSkolskaGodina("2016/17");
		
		assertFalse(d.equals(e));
	}
}
