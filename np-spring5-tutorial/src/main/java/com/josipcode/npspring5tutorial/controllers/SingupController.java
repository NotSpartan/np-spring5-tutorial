package com.josipcode.npspring5tutorial.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.josipcode.npspring5tutorial.commands.UserCommand;

@Controller
@RequestMapping("/singup")
public class SingupController {
	
	private static Log log = LogFactory.getLog(SingupController.class);
	
	@GetMapping
	public String singup(Model model) {

		model.addAttribute("user", new UserCommand());
		return "singup";		
	}

	@PostMapping
	public String doSingup(@Validated @ModelAttribute("user") UserCommand user,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "singup";
		}
		log.info("Email: " + user.getEmail() + "; Name: " 
			+ user.getName() + "; Password: " + user.getPassword());	
		return "redirect:/";		
	}
}
