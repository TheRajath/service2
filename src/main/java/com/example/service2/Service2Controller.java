package com.example.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/service2")
@RestController
public class Service2Controller {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/test1")
	public String test1() {
		return "Test1 method of service2";
	}

	@RequestMapping("/getTest1")
	public String test2() {
		
		String service1 = restTemplate.getForObject("http://localhost:8082/service1/test1", String.class);
		return service1;
		
	}

}
