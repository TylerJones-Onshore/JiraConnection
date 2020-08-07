package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AtlassianUser {
	//@JsonProperty("name")
	public String name;
	public String key;
	public String accountId;
	public String displayName;
	public String accountType;
}