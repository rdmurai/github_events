package br.com.rdmurai.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rdmurai.model.IssueEvent;
import br.com.rdmurai.service.IssueEventService;

@RestController
public class IssueEventController {

	@Autowired
	private IssueEventService issueEventService;

	@PostMapping(path = "/events", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void addEvent(@RequestBody IssueEvent event) throws URISyntaxException {
		
		issueEventService.saveIssue(event);
		
	}


	@GetMapping(path = "/issues/{issueNumber}/events", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<IssueEvent>> getEvent(@PathVariable("issueNumber") Long issueNumber) {
		List<IssueEvent> issuesEvent = issueEventService.listIssue(issueNumber);
		return ResponseEntity.ok(issuesEvent);
	};

}
