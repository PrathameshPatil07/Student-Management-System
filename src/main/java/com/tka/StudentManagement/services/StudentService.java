wpackage com.tka.StudentManagement.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
}
