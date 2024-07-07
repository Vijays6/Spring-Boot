package com.vj.boot;

import com.vj.boot.model.Laptop;
import com.vj.boot.service.LaptopService;
import com.vj.boot.springjdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@PropertySource("classpath:application.properties")
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
		Student student=applicationContext.getBean(Student.class);
		student.setName("Vijay");
		student.setRollNo(894638888);
		student.setMarks(1080);

		System.out.println(student);














//		Laptop laptop=applicationContext.getBean(Laptop.class);
//		LaptopService service=applicationContext.getBean(LaptopService.class);
//		service.addLaptop(laptop);
//		Employee employee1=applicationContext.getBean(Employee.class);
//		employee1.start();
	}

}
