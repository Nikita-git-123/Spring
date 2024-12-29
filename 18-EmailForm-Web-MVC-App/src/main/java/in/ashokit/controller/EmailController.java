package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.service.EmailService;
import jakarta.mail.MessagingException;

@Controller
@RequestMapping("/send-email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@GetMapping
	public String showEmailForm() {
		return "emailForm"; // The name of your HTML form (emailForm.html)
	}

	@PostMapping
	public String sendEmail(@RequestParam("email") String toEmail, Model model) {
		try {
			// Sending email to the provided email address
			emailService.sendEmail(toEmail, "Test Subject", "Hello, this is a test email.");
			model.addAttribute("message", "Email sent successfully!");
		} catch (MessagingException e) {
			model.addAttribute("message", "Failed to send email. Please try again.");
		}
		return "emailForm"; // You can redirect or return a new page
	}
}
