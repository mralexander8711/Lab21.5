package co.grandcircus.Mileage21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mileController {

	@RequestMapping("/")
	public ModelAndView showHome() {
	ModelAndView mav = new ModelAndView("index");
	
		return mav;
	}
	@RequestMapping("/add-form")
    public ModelAndView showAddForm() {
		return  new ModelAndView("/Mileage-Form");
	}
				
	@RequestMapping("/add-result")
	public ModelAndView showAddResult( 
		   @RequestParam("MPG") int num1,
		   @RequestParam("Gallons") int num2,
		   @RequestParam("Price") int num3)	{
	  
		int result = (num1 * num2);
	    int total = (num2 * num3);
	  
	  
	  ModelAndView mav = new ModelAndView("multi-result");
	  mav.addObject("num1", num1);
	  mav.addObject("num2", num2);
	  mav.addObject("num3", num3);
	  mav.addObject("result", result);
	  mav.addObject("total",total);
	  return mav;
	}
}
	
	
