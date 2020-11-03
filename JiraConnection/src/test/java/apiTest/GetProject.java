package apiTest;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.Project;

public class GetProject {
	@Test
	public static void getProject() {
		Client c = new Client("username should go here", "jira api key goes here");
		c.baseUri = "https://yourcompany.atlassian.net";
		Project p =	c.getProject("Project Key here");
		System.out.println(p.id);
	}
}
