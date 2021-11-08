package com.normalization.springdatjpamapping.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;
import com.normalization.springdatjpamapping.entity.Student;
import com.normalization.springdatjpamapping.entity.SubjectStudent;
import com.normalization.springdatjpamapping.entity.Subjects;
import com.normalization.springdatjpamapping.repository.StudentRepository;
import com.normalization.springdatjpamapping.repository.SubjectRepository;
import com.normalization.springdatjpamapping.repository.SubjectStudentRepository;

@RestController
public class SubjectController {

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectStudentRepository subjectStudentRepository;
	
	@PostMapping("/saveSubjects")
	public ResponseEntity<String> saveSubject(@RequestBody Set<Subjects> sub)
	{
		subjectRepository.saveAll(sub);
		return ResponseEntity.ok("saved");
	}
	
	@PostMapping("/saveStudents")
	public ResponseEntity<String> saveStudents(@RequestBody Set<Student> stu)
	{
		studentRepository.saveAll(stu);
		return ResponseEntity.ok("saved");
	}
	
	@PutMapping("updateStudent/{stuId}")
	public Student updateStudent(@PathVariable int stuId, @RequestBody Student studentUpdate)
	{
		return studentRepository.findById(stuId)
				.map(stu -> {
			stu.setStuName(studentUpdate.getStuName());
			stu.setStuClass(studentUpdate.getStuClass());
			return studentRepository.save(stu);
		}).orElseThrow(()->new NotFoundException("not found"));
	}
	
	@PutMapping("updateSubjects/{subId}")
	public Subjects updateSubjects(@PathVariable int subId, @RequestBody Subjects subjectUpdate)
	{
		return subjectRepository.findById(subId)
				.map(sub ->{
					sub.setSubName(subjectUpdate.getSubName());
					return subjectRepository.save(sub);
				}).orElseThrow(() -> new NotFoundException("Not Found"));
	}
	
	@GetMapping("/findStudents")
	public List<Student> findAllStudents()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/findSubjects")
	public List<Subjects> findAllSubjects()
	{
		return subjectRepository.findAll();
	}
	
	@PutMapping("/subject/{subId}/students/{stuId}")
	 public Subjects enrollStudentToSubjects(@PathVariable int stuId,@PathVariable int subId)
	 {
		 Subjects sub = subjectRepository.getById(subId);
		 Student stu = studentRepository.getById(stuId);
		 sub.enrollStudent(stu);
		 return subjectRepository.save(sub);
	 }
	
//	@DeleteMapping("deleteStudent/{stuId}")
//	public ResponseEntity<?> deleteStudent(@PathVariable int stuId)
//	{
//		try {
//		studentRepository.deleteById(stuId);
//		return new ResponseEntity<>(stuId, HttpStatus.OK);
//		}
//		catch(Exception e)
//		{
//			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
	
	@DeleteMapping("deletesubject/{subId}/student/{stuId}")
	public void deleteSubject(@PathVariable int subId,@PathVariable int stuId)
	{
		SubjectStudent subjectStudent= new SubjectStudent();
		subjectStudent.setStuId(stuId);
		subjectStudent.setSubId(subId);
		subjectStudentRepository.delete(subjectStudent);
	}
	

}
