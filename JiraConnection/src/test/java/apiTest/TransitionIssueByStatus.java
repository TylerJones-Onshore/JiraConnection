package apiTest;

import org.testng.annotations.Test;

import jira.Client;

public class TransitionIssueByStatus {
	@Test
	public void transitionById() {
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		c.transitionIssueByStatus("TES-8", "To do");
		try{Thread.sleep(8000);}catch(Exception e) {}
		c.transitionIssueByStatus("TES-8", "in Progress");
		try{Thread.sleep(8000);}catch(Exception e) {}
		c.transitionIssueByStatus("TES-8", "doNE");
	}
}
