package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {
	public String expand;
	public String id;
	public String key;
	public Fields fields;
}