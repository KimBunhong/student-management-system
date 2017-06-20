package studentmanagementsystem.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import studentmanagementsystem.entity.Student;
import studentmanagementsystem.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	//ban hz jg I don't know why it work?????library in pom.xml?yes common oh
	@RequestMapping(value="/student", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Student> findAll(){
		System.out.println("hello this is sample");
		ArrayList<Student> students = studentService.findAll();
		System.out.println("student" + students);
		return students;
	}
	
	@RequestMapping(value="/home") // note i call home and home will call angular method getData will response data back to ng-repeat
	public String home(){
		return "home";
	}

	@RequestMapping(value="/Student/{id}", method=RequestMethod.DELETE)
	public String removeStudent(@PathVariable("id") int id){
		boolean status = studentService.remove(id);
		System.out.println(status);
		return "Student";
	}
	
	@RequestMapping(value="/Studentsave", method = RequestMethod.POST)
	public void save(@RequestBody Student Student){
		boolean status = studentService.save(Student);
		System.out.println("Update Success: " + status);
	}

	@RequestMapping(value="/Studentupdate", method = RequestMethod.PUT)
	public void update(@RequestBody Student Student){
		boolean status = studentService.update(Student);
		System.out.println("Update Success: " + status);
	}
	
	
//	@RequestMapping(value="/Student", method=RequestMethod.GET)
//	public String Student(){
//		return "index";
//	}
	
}
