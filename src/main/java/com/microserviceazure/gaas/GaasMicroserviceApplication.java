package com.microserviceazure.gaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GaasMicroserviceApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Hi";
	}
	public static void main(String[] args) {
		SpringApplication.run(GaasMicroserviceApplication.class, args);
	}

}
