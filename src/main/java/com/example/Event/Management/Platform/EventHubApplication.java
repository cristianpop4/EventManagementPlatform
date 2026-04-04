package com.example.Event.Management.Platform;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "OpenApi for EventHub", version = "1.0", description = "Apis for managing events"))
public class EventHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventHubApplication.class, args);
	}

}
