package scicom.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String indexController(HttpServletRequest req, Model model){
		
		return "main";
	}

}
