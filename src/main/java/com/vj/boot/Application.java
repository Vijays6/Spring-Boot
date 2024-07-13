package com.vj.boot;

import com.vj.boot.springjdbc.model.Student;
import com.vj.boot.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@PropertySource("classpath:application.properties")
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
		Student student=applicationContext.getBean(Student.class);
		student.setName("Thalapathy");
		student.setRollNo(1007);
		student.setMarks(800);

//		System.out.println(student);

		StudentService studentService=applicationContext.getBean(StudentService.class);
		studentService.addStudent(student);
		System.out.println(studentService.getStudents());













//		Laptop laptop=applicationContext.getBean(Laptop.class);
//		LaptopService service=applicationContext.getBean(LaptopService.class);
//		service.addLaptop(laptop);
//		Employee employee1=applicationContext.getBean(Employee.class);
//		employee1.start();
	}

}
