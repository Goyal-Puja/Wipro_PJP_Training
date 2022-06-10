package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mile1.exception.*;
import com.mile1.bean.*;
import com.mile1.service.*;

public class InvalidObjectTest {
	
	StudentReport sr = new StudentReport();
	Student tc4 = null;
	Student tc5 = new Student(null, new int[] {40, 40, 50});
	Student tc6 = new Student("Aman",null);
	

	@Test
	public void test() {
		assertThrows(NullStudentObjectException.class,()->sr.validate(tc4));
		
	}
	public void test1() {
		assertThrows(NullNameException.class,()->sr.validate(tc5));
		
	}
	public void test2() {
		assertThrows(NullMarkArrayException.class,()->sr.validate(tc6));
		
	}

}
