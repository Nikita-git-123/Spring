package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {

	@Autowired
	private JavaMailSender mailSender;
	
	@GetMapping("/email")
	@ResponseBody
	public String sendEmail() {
		
		SimpleMailMessage msg = new SimpleMailMessage();
		
		msg.setTo("0.outfithub@gmail.com");
		msg.setText("Welcome to Outfit Hub ....");
		
		mailSender.send(msg);
		
		return "Email sent successfully...";
	}
}
