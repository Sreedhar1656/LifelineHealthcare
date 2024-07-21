package com.lancesoft;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoWebResource {
	
	
	@GetMapping("/getInfo")
	public ResponseEntity<?> getAPI() {
		return new ResponseEntity<>(" Hyy There! ", HttpStatus.OK);
	}

	@GetMapping("/getInfo/{name}")
	public ResponseEntity<?> getInfo(@PathVariable(value = "name") String name ) {
		return new ResponseEntity<>(" Hyy "+name, HttpStatus.OK);
	}
}
