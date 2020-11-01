package br.com.rdmurai.service;

import java.util.List;

import br.com.rdmurai.model.IssueEvent;

public interface IssueEventService {

	void saveIssue(IssueEvent issueEvent);
	
	List<IssueEvent> listIssue(Long id);
}
