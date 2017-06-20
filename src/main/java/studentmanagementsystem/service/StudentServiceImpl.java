package studentmanagementsystem.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentmanagementsystem.entity.Student;
import studentmanagementsystem.repository.StudentRepository;

@Service 
public class StudentServiceImpl implements StudentService{//why? not studentSErvice
//	teacher I confuse here It's ok?yes I will try to run it again then

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public boolean remove(int id) {
		try{
			return studentRepository.remove(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean save(Student student) {
		try{
			System.out.println("This is test Service" + student.toString());
			return studentRepository.save(student);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Student student) {
		try{
			return studentRepository.update(student);
		}catch(Exception e){
			
		}
		return false;
	}

	@Override
	public ArrayList<Student> findAll() {
		try{
			return studentRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
