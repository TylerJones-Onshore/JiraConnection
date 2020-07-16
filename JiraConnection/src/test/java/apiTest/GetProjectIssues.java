package apiTest;

import java.util.List;

import jira.Client;
import jiraObjects.Issue;

public class GetProjectIssues {
	public static void main(String[] args) {
		Client c = new Client("tjones@aarp.org", "0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		List<Issue> issues = c.getAllProjectIssues("KCA");

		System.out.println("BUGS:");
		for (Issue i : issues) {
			if (i.fields.issuetype.name.equalsIgnoreCase("bug")) {
				System.out.print(i.key+" ");
				System.out.println(i.fields.summary);
			}
		}
		System.out.println("TESTS:");
		for (Issue i : issues) {
			if (i.fields.issuetype.name.equalsIgnoreCase("test")) {
				System.out.print(i.key+" ");
				System.out.println(i.fields.summary);
			}
		}
	}
}
