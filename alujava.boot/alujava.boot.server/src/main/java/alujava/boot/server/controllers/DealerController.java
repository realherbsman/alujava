package alujava.boot.server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private Logger logger = LoggerFactory.getLogger(alujava.boot.server.controllers.DealerController.class);
	
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
		Card result = dealer.getCard();
		if (logger.isInfoEnabled()) {
			logger.info(String.format("Return card %s", result));
		}
		return result;
	}
	
	@RequestMapping(path= {"card"}, method={RequestMethod.POST}, consumes={MediaType.APPLICATION_JSON_UTF8_VALUE})
	public void postCard(@RequestBody Card card) {
		if (logger.isInfoEnabled()) {
			logger.info(String.format("Recieve card %s", card));
		}
		dealer.putCard(card);
	}
	
}
