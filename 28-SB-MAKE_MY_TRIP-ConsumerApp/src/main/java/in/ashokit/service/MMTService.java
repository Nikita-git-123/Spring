package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Passanger;
import in.ashokit.binding.Ticket;

@Service
public class MMTService {

	public Ticket bookTicket(Passanger passanger) {

		String bookTicketUrl = "http://classes.ashokit.in:8084/ticket";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket> postForEntity = rt.postForEntity(bookTicketUrl, passanger, Ticket.class);

		return postForEntity.getBody();
	}

	public Ticket[] getTickets() {

		String bookTicketUrl = "http://classes.ashokit.in:8084/tickets";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(bookTicketUrl, Ticket[].class);

		return forEntity.getBody();

	}
}
