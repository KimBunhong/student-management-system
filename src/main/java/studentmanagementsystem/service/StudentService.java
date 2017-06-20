package studentmanagementsystem.service;

import java.util.ArrayList;
import studentmanagementsystem.entity.Student;

public interface StudentService {
	
	/**
	 *  
	 * @param id
	 * @return
	 */	
	boolean remove(int id);
	
	/**
	 * 
	 * @param Student
	 * @return
	 */
	boolean save(Student Student);
	
	/**
	 * 
	 * @param Student
	 * @return
	 */
	boolean update(Student Student);
	
	/**
	 * 
	 * @return
	 */
	ArrayList<Student> findAll(); // findAll Mean Select All Data
	
	/**
	 *  
	 * @param id
	 * @return
	 */
	Student findOne(int id);

}
