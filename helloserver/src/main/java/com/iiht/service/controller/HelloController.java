package com.iiht.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {

	@GetMapping("/message")
	public String msg() {
		return "message done";
	}
	
	@GetMapping("/{n}")
	public ResponseEntity<Long> factorial(@PathVariable Long n){
		
		Long fact1=1L;
		for(int i=1;i<=n;i++) {
			fact1= fact1 * i;
		}
		return ResponseEntity.status(HttpStatus.OK).body(fact1);
	}
}
