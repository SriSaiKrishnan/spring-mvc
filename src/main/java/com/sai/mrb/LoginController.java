/**
 * 
 */
package com.sai.mrb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sv
 *
 */

@Controller
public class LoginController {
	
@RequestMapping("/")	
public ModelAndView login() {
	ModelAndView mav = new ModelAndView("login");
	mav.addObject("message","Hello Welcome");
	return mav;
}

}
