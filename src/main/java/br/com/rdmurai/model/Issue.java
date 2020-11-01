package br.com.rdmurai.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Issue {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long issue_id;

	private String url;
	private String repository_url;
	private String labels_url;
	private String comments_url;
	private String events_url;
	private String html_url;
	private float id;
	private String node_id;
	private float number;
	private String title;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@JsonProperty(value = "user")
	User user;
	
	ArrayList<Object> labels = new ArrayList<Object>();
	private String state;
	private boolean locked;
	private String assignee = null;
	ArrayList<Object> assignees = new ArrayList<Object>();
	private String milestone = null;
	private float comments;
	private String created_at;
	private String updated_at;
	private String closed_at = null;
	private String author_association;
	private String active_lock_reason = null;
	private String body;
	private String performed_via_github_app = null;

	public Issue() {
	}

	public Issue(Long issue_id, String url, String repository_url, String labels_url, String comments_url,
			String events_url, String html_url, float id, String node_id, float number, String title, User user,
			ArrayList<Object> labels, String state, boolean locked, String assignee, ArrayList<Object> assignees,
			String milestone, float comments, String created_at, String updated_at, String closed_at,
			String author_association, String active_lock_reason, String body, String performed_via_github_app) {
		this.issue_id = issue_id;
		this.url = url;
		this.repository_url = repository_url;
		this.labels_url = labels_url;
		this.comments_url = comments_url;
		this.events_url = events_url;
		this.html_url = html_url;
		this.id = id;
		this.node_id = node_id;
		this.number = number;
		this.title = title;
		this.user = user;
		this.labels = labels;
		this.state = state;
		this.locked = locked;
		this.assignee = assignee;
		this.assignees = assignees;
		this.milestone = milestone;
		this.comments = comments;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.closed_at = closed_at;
		this.author_association = author_association;
		this.active_lock_reason = active_lock_reason;
		this.body = body;
		this.performed_via_github_app = performed_via_github_app;
	}

	public Long getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(Long issue_id) {
		this.issue_id = issue_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRepository_url() {
		return repository_url;
	}

	public void setRepository_url(String repository_url) {
		this.repository_url = repository_url;
	}

	public String getLabels_url() {
		return labels_url;
	}

	public void setLabels_url(String labels_url) {
		this.labels_url = labels_url;
	}

	public String getComments_url() {
		return comments_url;
	}

	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}

	public String getEvents_url() {
		return events_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUserObject() {
		return user;
	}

	public void setUserObject(User user) {
		this.user = user;
	}

	public ArrayList<Object> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<Object> labels) {
		this.labels = labels;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public ArrayList<Object> getAssignees() {
		return assignees;
	}

	public void setAssignees(ArrayList<Object> assignees) {
		this.assignees = assignees;
	}

	public String getMilestone() {
		return milestone;
	}

	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}

	public float getComments() {
		return comments;
	}

	public void setComments(float comments) {
		this.comments = comments;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}

	public String getAuthor_association() {
		return author_association;
	}

	public void setAuthor_association(String author_association) {
		this.author_association = author_association;
	}

	public String getActive_lock_reason() {
		return active_lock_reason;
	}

	public void setActive_lock_reason(String active_lock_reason) {
		this.active_lock_reason = active_lock_reason;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPerformed_via_github_app() {
		return performed_via_github_app;
	}

	public void setPerformed_via_github_app(String performed_via_github_app) {
		this.performed_via_github_app = performed_via_github_app;
	}

}
