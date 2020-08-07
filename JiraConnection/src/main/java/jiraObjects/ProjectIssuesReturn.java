package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectIssuesReturn {
	public int startAt;
	public int maxResults;
	public int total;
	public Issue[] issues;
}
