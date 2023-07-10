package de.gloresoft.workorderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WorkOrderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkOrderApiApplication.class, args);
		
	}

	 @Bean 
	 public RestTemplate restTemplate() {
		 return new RestTemplate(); }
}
