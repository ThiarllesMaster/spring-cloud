package com.config.client.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@Value("${valores.valor_fijo}")
	private String msg;

	@GetMapping
	public String hello() {
		return "Hello World ".concat(msg);
	}
}
