package apiTest;

import jira.Client;
import jiraObjects.Issue;

public class GetIssue {

	public static void main(String[] args) {
		Client c = new Client("username should go here", "jira api key goes here");
		c.baseUri = "https://yourcompany.atlassian.net";
		Issue issue = c.getIssue("Jira Issue Key");
		System.out.println(issue);
	}
}
