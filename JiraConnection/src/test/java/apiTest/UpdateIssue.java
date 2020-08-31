package apiTest;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.IssueUpdate;


public class UpdateIssue {
	@Test
	public static void main(String[] args) {
		IssueUpdate issue = new IssueUpdate();
		//issue is the Jira key
		issue.issue = "TES-107";
		//assignee must use the account id of the desired assignee
		//issue.assignee = "5bfc155710c30e4ac8c8a502";
		issue.description = "Step 21 error: Expected condition failed: waiting for presence of element located by: By.cssSelector: .body_container ul.visible > li button[title*='Accept']\\n (tried for 45 second(s) with 500 milliseconds interval)\\n\\nError repeated for second execution.";
		//issue.labels = new String[]{"Regression","Automation"};
		//issue.components = new String[] {"Application","Framework"};
		//issue.fixVersions = "Version 1";
		//summary is the Title of the ticket.
		//issue.summary = "Testing JIRA API connection";
		
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		c.contentType= "application/json";
		System.out.println(c.updateIssue(issue));
	}
}