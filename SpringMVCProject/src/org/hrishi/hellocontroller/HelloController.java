package org.hrishi.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class HelloController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
		
		return modelandview;
	}
}*/

@Controller
//@RequestMapping("/greet")
public class HelloController{
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {
		
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello! " + name + " You are from " + country);
		return model;
		
	}
	/*@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi!");
		return model;
		
	}*/
}