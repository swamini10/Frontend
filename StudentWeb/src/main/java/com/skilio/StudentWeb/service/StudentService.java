package com.skilio.StudentWeb.service;
import com.skilio.StudentWeb.model.Student;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public Student getStudent(int rollno) {
		
		Student s1 = new Student(1,"vinod","pune");
		Student s2 = new Student(2,"ram","aran");
		Student s3 = new Student(3,"sham","pune");
		Student s4 = new Student(4,"amol","ppur");
		Student s5 = new Student(5,"atul","surat");
		Student s6 = new Student(6,"don","solapur");
		
		List<Student> students =Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		for(Student std : students) {
			if(std.getRollNo() == rollno) {
				return std;
			}
		}
		return new Student();
	}

}
