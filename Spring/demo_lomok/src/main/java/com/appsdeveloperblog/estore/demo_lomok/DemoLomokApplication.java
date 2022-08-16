package com.appsdeveloperblog.estore.demo_lomok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLomokApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoLomokApplication.class, args);
		
		Student student = new Student();
		student.setId(100);
		student.setFirstName("kljlkf");
		student.setLastName("kljk");
		
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		
	}

}
