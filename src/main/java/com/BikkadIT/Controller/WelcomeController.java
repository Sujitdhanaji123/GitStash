package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String WelcomeMsg() {
		String msg="Welcome to BikkadIT";
		return msg;
	}
}
