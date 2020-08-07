package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
	public String id;
	public String key;
	public String description;
	public String name;
	public Version[] versions;
}