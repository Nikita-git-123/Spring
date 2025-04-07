package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return "Student saved";
	}
	
	@GetMapping("/students")
	public Iterable<Student> getStudent(@RequestBody Student student) {
		return studentRepo.findAll();
	}

}
