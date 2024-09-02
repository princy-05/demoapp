package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/demo/api")
public class DemoController {

	@GetMapping("/welcome")
	public String welcome() {
		return "hello world";
	}
	
}
