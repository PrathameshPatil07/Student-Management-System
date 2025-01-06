package com.tka.StudentManagement.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.StudentManagement.Entity.Student;
import com.tka.StudentManagement.dao.StudentDao;
@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public ArrayList<Student> getallstudent()
	{
			
		return studentDao.getallstudent();
	}
	
	public void addstudent(Student s)
	{
		
		studentDao.addstudent(s);	
		
	}
	public void deleteStudent(Student s)
	{
		studentDao.deleteStudent(s);
	}
	public void Updatestudent(Student s)
	{
		studentDao.Updatestudent(s);
		
	}
	public Student IsExists(Student s)
	{
		if(studentDao.IsExists(s)!=null)
		{
			System.out.println("Student Exists..!");
			return studentDao.IsExists(s);
		}else 
		{
			System.out.println("Student does not Exists..!");
			studentDao.addstudent(s);
			
		}
		
	return null;	
	}
}
