package org.hkjc.developer.hkjcwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HkjcOrgWebPublicController {

	@GetMapping
	public String getMapping() {
		return "Hello World!";
	}
}
