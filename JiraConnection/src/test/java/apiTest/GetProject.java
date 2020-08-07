package apiTest;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.Project;

public class GetProject {
	@Test
	public static void getProject() {
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri="https://aarpqmo.atlassian.net";
		Project p =	c.getProject("TES");
		System.out.println(p.id);
	}
}