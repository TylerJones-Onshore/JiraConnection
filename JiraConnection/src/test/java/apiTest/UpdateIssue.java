package apiTest;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.IssueUpdate;


public class UpdateIssue {
	@Test
	public static void main(String[] args) {
		IssueUpdate issue = new IssueUpdate();
		//issue is the Jira key
		issue.issue = "";
		//assignee must use the account id of the desired assignee
		issue.assignee = "accountId";
		issue.description = "Using this ticket to test the api connection to JIRA using a java framework.";
		issue.labels = new String[]{"Regression","Automation"};
		issue.components = new String[] {"Application","Framework"};
		issue.fixVersions = "Version 1";
		//summary is the Title of the ticket.
		issue.summary = "Testing JIRA API connection";
		
		Client c = new Client("username should go here", "jira api key goes here");
		c.baseUri = "https://yourcompany.atlassian.net";
		c.contentType= "application/json";
		System.out.println(c.updateIssue(issue));
	}
}
