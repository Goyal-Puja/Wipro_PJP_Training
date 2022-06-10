import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCasesCheckPresence {
	TestCheckPresence t = null;

	@BeforeEach
	void setUp() throws Exception {
		
		t = new TestCheckPresence();
	}

	@Test
	void testCheckPresence() {
		//fail("Not yet implemented");
		assertTrue(t.checkPresence("GeeksForGeeks","Geeks"));
		assertFalse(t.checkPresence("GeeksForGeeks","of"));
	}

}
