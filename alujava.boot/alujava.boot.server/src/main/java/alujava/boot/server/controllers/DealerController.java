package alujava.boot.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import alujava.boot.server.services.DealerService;
import alujava.deck.Card;

@RestController
public class DealerController {

	@Autowired
	private DealerService dealer;
	
	public DealerController() {
		super();
	}
	
	@RequestMapping(path= {"hi"}, produces={MediaType.TEXT_PLAIN_VALUE})
	@ResponseBody
	public String hi() {
		return "Hi, Jack!";
	}
	
	@RequestMapping(path= {"card"}, method={RequestMethod.GET}, produces={MediaType.APPLICATION_JSON_UTF8_VALUE})
	@ResponseBody
	public Card getCard() {
		return dealer.getCard();
	}
	
	@RequestMapping(path= {"card"}, method={RequestMethod.POST}, consumes={MediaType.APPLICATION_JSON_UTF8_VALUE})
	public void postCard(@RequestBody Card card) {
		dealer.putCard(card);
	}
	
}
