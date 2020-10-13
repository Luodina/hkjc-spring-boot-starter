package org.hkjc.developer.hkjcwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hkjc-org")
public class HkjcOrgWebController {

	@GetMapping
	public String getMapping() {
		return "I fight for the users!";
	}
}
