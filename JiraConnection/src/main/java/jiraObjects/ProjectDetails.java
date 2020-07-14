package jiraObjects;

import java.util.List;

public class ProjectDetails {
	public String expand;
	public String self;
	public String id;
	public String key;
	public String description;
	public Lead lead;
	public List<Object> components;
	public List<IssueType> issueTypes;
	public String assigneeType;
	public List<Version> versions;
	public String name;
	public String projectTypeKey;
	public boolean simplified;
	public String style;
	public boolean isPrivate;
}
