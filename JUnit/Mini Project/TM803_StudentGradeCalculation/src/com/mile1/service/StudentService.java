package com.mile1.service;
import com.mile1.bean.Student;

public class StudentService {
	public int findNumberofNullMarks(Student s[])
	{
		int nullMarksCount = 0;
		for(int i=0;i<s.length;i++)
		{
			try {
				s[i].getMarks();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				nullMarksCount++;
				
			}
		}
		return nullMarksCount;
	}
	public int findNumberofNullName(Student s[])
	{
		int nullNamesCount = 0;
		for(int i=0;i<s.length;i++)
		{
			try {
				s[i].getName();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				nullNamesCount++;
				
			}
		}
		return nullNamesCount;
	}
	public int findNumberofNullObject(Student s[])
	{
		int nullObjectsCount = 0;
		for(int i=0;i<s.length;i++)
		{
				if(s[i] == null)
				nullObjectsCount++;
		}
		return nullObjectsCount;
	}
	
}
