package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarkArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;


public class StudentMain {

	static Student data[] = new Student[4];
	
     StudentMain() {
		for(int i=0;i<data.length;i++)
		{
			data[i] = new Student();
		}
		 data[0] = new Student ("Sekar", new int [ ] {85, 75, 95}); 
		 data[1] = new Student ("null", new int [ ] {11, 22, 33}); 
		 data[2] = null;
		 data[3] = new Student ("Manoj", null); 
		/* data[4] = new Student ("B2", new int[ ] {13, 88, 13}); 
		 data[5] = new Student ("C3", new int[ ] {14, 14, 99}); 
		 data[6] = new Student ("A2", new int[ ] {77, 55, 12}); 
		 data[7] = new Student (null, new int[ ] {13, 88, 13});
		 data[8] = new Student ("A2", null);
		 data[9] = null;*/
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int NumberofNullName = 0;
		int NumberofNullMarkArray = 0;
		int NumberofNullStudentObject = 0;
		*/
		StudentMain sm = new StudentMain();
		StudentReport sr = new StudentReport();
		StudentService ss = new StudentService();
		
		System.out.println("Grade Calculation:");
		String x;
		
		for(int i=0;i<data.length;i++)
		{
			//System.out.println(sr.findGrade(data[i]));
			try {
				x = sr.validate(data[i]);
			} catch (NullStudentObjectException e) {
				// TODO Auto-generated catch block
				x = "NullStudentObjectException Occured";
			} catch (NullMarkArrayException e) {
				// TODO Auto-generated catch block
				x = "NullMarkarrayException occured";
			} catch (NullNameException e) {
				// TODO Auto-generated catch block
				x = "NullNameException Occured";
			}
			
			System.out.println("Grade = " +x);
		}
		
		
		System.out.println("Number of object with Name as NUll = "+ss.findNumberofNullName(data));
		 System.out.println("Number of object with MarkArray as NUll = "+ ss.findNumberofNullMarks(data));
		 System.out.println("Number of object with StudentObject as NUll = "+ss.findNumberofNullObject(data));
		 

	}

}
