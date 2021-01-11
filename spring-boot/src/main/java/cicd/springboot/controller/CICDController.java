package cicd.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping(value = "test")
	public String showMessage()
	{
		return "Hi ! This is just test message.";
	}

}
