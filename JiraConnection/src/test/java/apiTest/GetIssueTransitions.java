package apiTest;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.Transition;
import jiraObjects.TransitionObject;

public class GetIssueTransitions {
	@Test
	public void getTransitions() {
		Client c = new Client("tjones@aarp.org","0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		TransitionObject transitions = c.getTransitions("TES-8");
		for(Transition t:transitions.transitions) {
			if(t.name.equalsIgnoreCase("todo")) {
				System.out.println(t.name+" : "+t.id);
			}
		}
	}
}
