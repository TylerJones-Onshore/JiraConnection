package jiraObjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {
	public String id;
	public AtlassianUser author;
	public String body;
	public AtlassianUser updateAuthor;
	public String created;
	public String updated;
}