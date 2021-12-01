package com.example.safetynetserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping(value = "/process", produces = "application/json")
	public AttestationStatement process(@RequestBody String attestation)
	{
		AttestationStatement attS = OfflineVerify.process(attestation);
		return attS;
	}
}
