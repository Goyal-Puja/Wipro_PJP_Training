package Assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCases {
	
	TestCheckPresence t = null;
	

	@Before
	public void setUp() throws Exception {
		
		t = new TestCheckPresence();
	}

	@Test
	public void testCheckPresence() {
		//fail("Not yet implemented");
		assertTrue(t.checkPresence("GeeksForGeeks","Geeks"));
		assertFalse(t.checkPresence("GeeksForGeeks","of"));
		
	}

}
