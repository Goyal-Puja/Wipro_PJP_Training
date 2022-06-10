package Assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCases {
	
	TestSort t = null;
	

	@Before
	public void setUp() throws Exception {
		
		t = new TestSort();
	}

	@Test
	public void testSortValues() {
		//fail("Not yet implemented");
		
		int[] values = {9, -3, 5, 0, 1};
		int[] expectedOrder = {-3, 0, 1, 5, 9};
		assertArrayEquals(expectedOrder,t.sortValues(values));
	}

}
