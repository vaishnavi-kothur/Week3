package org.student;

import org.department.Department;

public class Student extends Department {
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
    public void studentName()
    {
    	System.out.println("Student Name is Vaishnavi");
    }
    public void studentDept()
    {
    	System.out.println("Student Dept is IS");
    }
    public void studentId()
    {
    	System.out.println("Student ID is 12");
    }
}
