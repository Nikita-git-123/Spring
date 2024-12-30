package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class EmailController {

	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("/email")
	public String sendEmail() throws Exception {
		
		SimpleMailMessage msg = new SimpleMailMessage();
		
		msg.setTo("patilniku.2645@gmail.com");
		msg.setSubject("Welcome to mail service");
		
		mailSender.send(msg);
		
		return "Successfull.......";
	}
}
