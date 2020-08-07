package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {
	public FixVersion[] fixVersions;
	public Priority priority;
	public String[] labels;
	public issueLink[] issuelinks;
	public AtlassianUser assignee;
	public AtlassianUser creator;
	public AtlassianUser reporter;
	public ProjectShort project;
	public UserComments comment;
	public String summary;
	public IssueType issuetype;
	public Component[] components;
}
