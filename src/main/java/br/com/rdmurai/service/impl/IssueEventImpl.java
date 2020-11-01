package br.com.rdmurai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rdmurai.model.IssueEvent;
import br.com.rdmurai.repository.IssueEventRepository;
import br.com.rdmurai.repository.IssueRepository;
import br.com.rdmurai.repository.OwnerRepository;
import br.com.rdmurai.repository.RepositoryRespository;
import br.com.rdmurai.repository.SenderRepository;
import br.com.rdmurai.repository.UserRepository;
import br.com.rdmurai.service.IssueEventService;

@Service
public class IssueEventImpl implements IssueEventService{

	
	@Autowired
	IssueEventRepository issueEventRepository;
	@Autowired
	IssueRepository issueRepository;
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	SenderRepository senderRepository;
	@Autowired
	RepositoryRespository repositoryRespository;
	@Autowired
	UserRepository userRespository;
	
	@Override
	public void saveIssue(IssueEvent issueEvent) {
		
		userRespository.save(issueEvent.getIssue().getUserObject());
		senderRepository.save(issueEvent.getSender());
		ownerRepository.save(issueEvent.getRepository().getOwnerObject());
		repositoryRespository.save(issueEvent.getRepository());
		issueRepository.save(issueEvent.getIssue());
		
		issueEventRepository.saveAndFlush(issueEvent);
		
	}

	@Override
	public List<IssueEvent> listIssue(Long id) {

		return issueEventRepository.findAllByIssueId(id);
	}

}
