package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarkArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

	  public String findGrade (Student studentObject) {
		  int[] marks = studentObject.getMarks();
		  for(int i=0;i<marks.length;i++) {
			  if(marks[i] < 35) {
				  studentObject.setGrade("F");
				  return studentObject.getGrade();
			  }  
		  }
		  int marksSum = 0;
		  for(int i=0;i<marks.length;i++)
		  {
			  marksSum += marks[i];
		  }
		  if(marksSum <= 150)
			  studentObject.setGrade("D");
			  else if(marksSum > 150 && marksSum <= 200)
				  studentObject.setGrade("C");
			  else if(marksSum > 200 && marksSum <= 250)
				  studentObject.setGrade("B");
			  else if(marksSum > 250 && marksSum <= 300)
				  studentObject.setGrade("A");
			  else studentObject.setGrade("A+");
		  return studentObject.getGrade();		  
		  
	  }
	public String validate (Student studentObject) 
			throws NullStudentObjectException, NullMarkArrayException, NullNameException{
		
		if(studentObject == null) {
			throw new NullStudentObjectException();
		}
		else
		{
			if(studentObject.getName() == null) throw new NullNameException();
			if(studentObject.getMarks() == null) throw new NullMarkArrayException();
			
			return findGrade(studentObject);
			
		}
		
	}
}
