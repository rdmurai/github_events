package br.com.rdmurai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "issue_event")
public class IssueEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	@Column(name = "action")
	private String action;
	
	@OneToOne
	@JoinColumn(name = "issue_id")
	private Issue issue;
	
	@OneToOne
	@JoinColumn(name = "repo_id")
	private Repository repository;
	

	@OneToOne
	@JoinColumn(name = "sender_id")
	private Sender sender;
	
	
	public IssueEvent() {
	}



	public IssueEvent(Long id, String action, Issue issue, Repository repository, Sender sender) {
		this.id = id;
		this.action = action;
		this.issue = issue;
		this.repository = repository;
		this.sender = sender;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public Issue getIssue() {
		return issue;
	}


	public void setIssue(Issue issue) {
		this.issue = issue;
	}


	public Repository getRepository() {
		return repository;
	}


	public void setRepository(Repository repository) {
		this.repository = repository;
	}


	public Sender getSender() {
		return sender;
	}


	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	
	

	
	
}
