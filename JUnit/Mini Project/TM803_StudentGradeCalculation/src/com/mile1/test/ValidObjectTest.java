package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mile1.bean.*;
import com.mile1.service.*;

public class ValidObjectTest {

	StudentReport sr = new StudentReport();
	Student tc1 = new Student("Sekar", new int[] {300, 400, 500});
	Student tc2 = new Student("Aman", new int[] {40, 40, 50}); 
	Student tc3 = new Student("Ankit", new int[] {30, 40, 50});
	
	
	@Test
	public void test() {
		assertEquals("A+",sr.findGrade(tc1));
	}
	public void test1() {
		assertEquals("D",sr.findGrade(tc2));
	}
	public void test2() {
		assertEquals("D",sr.findGrade(tc3));
	}

}
