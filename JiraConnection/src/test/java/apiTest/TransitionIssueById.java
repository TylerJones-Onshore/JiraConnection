package apiTest;

import org.testng.annotations.Test;

import jira.Client;

public class TransitionIssueById {
	@Test
	public void transitionById() {
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		c.transitionIssueById("TES-8", "31");
	}
}
