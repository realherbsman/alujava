package alujava.boot.server.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import alujava.boot.server.exceptions.DuplicateCardException;
import alujava.boot.server.exceptions.InvalidCardException;
import alujava.boot.server.exceptions.NoCardException;

@Controller
public class ExceptionController {

	@ExceptionHandler
	public ResponseEntity<String> handleNoCard(NoCardException exception) {
		return new ResponseEntity<String>("No card!", HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler
	public ResponseEntity<String> handleInvalidCard(InvalidCardException exception) {
		return new ResponseEntity<String>("Invalid card!", HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler
	public ResponseEntity<String> handleDuplicateCard(DuplicateCardException exception) {
		return new ResponseEntity<String>("Duplicate card!", HttpStatus.NO_CONTENT);
	}
}