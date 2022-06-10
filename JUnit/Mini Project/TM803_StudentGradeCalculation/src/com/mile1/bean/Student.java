package com.mile1.bean;

public class Student {
	
	private String name;	
	public Student()
	{
		super();
	}
	private int marks[];
	private String grade;
	
	public Student(String name,int marks[])
	{
		this.name = name;
		this.marks = marks;
	}
     public void setName(String name)
     {
    	 this.name = name;
     }
     public String getName()
     {
    	 return name;
    	 
     }
     public void setMarks(int[] marks)
     {
    	 this.marks = marks;
     }
     public int[] getMarks()
     {
    	 return marks;
    	 
     }
     public void setGrade(String grade)
     {
    	 this.grade = grade;
     }
     public String getGrade()
     {
    	 return grade;
    	 
     }
     
}
