package klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	Faculty F= new Faculty();
	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "welcome...";
	}
	@GetMapping("/faculty")
	@ResponseBody
	public String faculty() 
	{
		return F.toString();
	}
}
