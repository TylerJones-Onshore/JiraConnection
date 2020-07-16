package apiTest;

import jira.Client;
import jiraObjects.Issue;

public class GetIssue {

	public static void main(String[] args) {
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		Issue issue = c.getIssue("TES-8");
		System.out.println(issue);
	}
}