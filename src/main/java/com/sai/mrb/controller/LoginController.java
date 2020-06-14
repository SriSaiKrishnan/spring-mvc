/**
 * 
 */
package com.sai.mrb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sai.mrb.model.Login;
import com.sai.mrb.model.User;
import com.sai.mrb.service.UserService;

/**
 * @author sv
 *
 */

@Controller
public class LoginController {
	
	@Autowired
	  UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    User user = userService.validateUser(login);
	    if (null != user) {
	    mav = new ModelAndView("adduser");
	    mav.addObject("firstname", user.getName());
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }

}
