import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCasesConcat {
	TestStringConcat t = null;

	@BeforeEach
	void setUp() throws Exception {
		t = new TestStringConcat();
	}

	@Test
	void testDoStringConcat() {
		//fail("Not yet implemented");
		assertEquals("Puja Goyal", t.doStringConcat("Puja","Goyal"));
	}

}
