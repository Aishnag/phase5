package com.aishwarya.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	@GetMapping("/aws")
	public String Message() {
		return "Spring Boot Application Deployement in AWS Successfully !!!";
	}

}
