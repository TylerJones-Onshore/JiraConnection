package launchPoints;

import jira.Client;
import jiraObjects.Issue;

public class getIssue {
	public static void main(String[] args) {
		//https://aarpqmo.atlassian.net/rest/api/latest/issue/TES-8
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		c.contentType = "application/json";
		Issue i = c.getIssue("TES-8");
		System.out.println(i.key);
	}
}
