package com.springsearch.engine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Home {

	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query) {
		
		String url="https://www.google.com/search?q="+query;
		if(query.isBlank()) {
			System.err.println("Please fill the fields ");
			return new RedirectView("home");
		}
		RedirectView r = new RedirectView();
		r.setUrl(url);
		
		
		
		return r;
	}
}
