package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.binding.Passanger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.MMTService;

@Controller
public class MMTController {
	
	@Autowired
	private MMTService mmtService;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		Passanger passanger = new Passanger();
		model.addAttribute("pass", passanger);
		return "index";
	}
	
	@GetMapping("/book")
	public String bookTicket(Model model) {
		Passanger passanger = new Passanger();
		Ticket bookTicket = mmtService.bookTicket(passanger);
		model.addAttribute("passanger", bookTicket);
		return "Ticket";
	}
	
	@GetMapping("/getTicket")
	public String getUsers(Passanger passanger, Model model) {
		Ticket[] allUsers = mmtService.getTickets();
		model.addAttribute("tickets", allUsers);
		return "Ticket";
	}

	
}
