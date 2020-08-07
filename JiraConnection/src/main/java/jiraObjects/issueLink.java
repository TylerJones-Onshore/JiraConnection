package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class issueLink {
	public String id;
	public OutwardIssue outwardIssue;
}