import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCasesSort {
	TestSort t = null;

	@BeforeEach
	void setUp() throws Exception {
		
		t = new TestSort();
	}

	@Test
	void testSortValues() {
		//fail("Not yet implemented");
		int[] values = {9, -3, 5, 0, 1};
		int[] expectedOrder = {-3, 0, 1, 5, 9};
		assertArrayEquals(expectedOrder,t.sortValues(values));
	}

}
