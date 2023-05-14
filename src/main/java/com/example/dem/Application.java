package com.example.dem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dem.entity.Student;
import com.example.dem.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ramesh","Fadatare","ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		
//		Student student2 = new Student("Sanjay","jadhav","sanjay@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Ram","Kumar","ramKumar@gmail.com");
//		studentRepository.save(student3);
//		
//		
//		Student student4 = new Student("Suresh","jadhav","sureshja@gmail.com");
//		studentRepository.save(student4);
		
	}

}
