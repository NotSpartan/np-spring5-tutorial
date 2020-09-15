package com.josipcode.npspring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josipcode.npspring5tutorial.mail.MailSender;



@RestController
public class MailController {
	
	private MailSender mailSender;
	
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		mailSender.send("josip.batinic9@gmail.com", "A test mail", "Body of the test mail");
		
		return "Mail sent";		
	}

}
