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

import com.sai.mrb.model.User;
import com.sai.mrb.service.UserService;

/**
 * @author sv
 *
 */

@Controller
public class AddUserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("user") User user) {
	  userService.addUser(user);
	  return new ModelAndView("adduser");
	  }
	

}
