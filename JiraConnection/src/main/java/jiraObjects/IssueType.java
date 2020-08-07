package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueType {
	public String self;
	public String id;
	public String description;
	public String iconUrl;
	public String name;
	public boolean subtask;
	public int avatarId;
}
