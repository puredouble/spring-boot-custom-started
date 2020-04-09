package me.puredouble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public Animal animal() {
//		Animal animal = new Animal();
//		animal.setName("cat");
//		animal.setAge(2);
//		return animal;
//	}

}
