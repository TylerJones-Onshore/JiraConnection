package apiTest;

import java.util.List;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.Issue;

public class GetProjectIssuesByModifier {
	@Test
	public static void main(String[] args) {
		Client c = new Client("username should go here", "jira api key goes here");
		c.baseUri = "https://yourcompany.atlassian.net";
		List<Issue> issues = c.getAllIssues("ProjectKey","summary","Test");

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
