package com.kg.ive;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	
	@GetMapping("/ofTest1")
	public String ofTest1() {
		return "ofTest1 ejcutado";
	}
	
}
