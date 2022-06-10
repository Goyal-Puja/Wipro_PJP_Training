package com.mile1.test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.bean.Student;

public class CountingNullTest {

	Student data[];
	StudentService ss = new StudentService();
	
	@Before
	public void setUp() {
		
		data = new Student[4];
		data[0] = new Student ("Sekar", new int [ ] {85, 75, 95}); 
		 data[1] = new Student ("null", new int [ ] {11, 22, 33}); 
		 data[2] = null;
		 data[3] = new Student ("Manoj", null); 
	}

	@Test
	public void test() {
		
		assertEquals(1,ss.findNumberofNullMarks(data));
	}
	@Test
	public void test1() {
		
		assertEquals(1,ss.findNumberofNullName(data));
	}
	@Test
	public void test2() {
		
		assertEquals(1,ss.findNumberofNullObject(data));
	}

}
