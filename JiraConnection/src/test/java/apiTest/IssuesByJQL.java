package apiTest;

import java.util.List;

import org.testng.annotations.Test;

import jira.Client;
import jiraObjects.Issue;

public class IssuesByJQL {
	@Test
	public static void main(String[] args) {
		Client c = new Client("tjones@aarp.org", "0yw8ZD5F9Xn7p2gVAF8pC588");
		c.baseUri = "https://aarpqmo.atlassian.net";
		List<Issue> framework = c.getIssuesByJQL("TES","component = Framework");
		List<Issue> application = c.getIssuesByJQL("TES","component = Application");
		List<Issue> notNull = c.getIssuesByJQL("TES","component != null");
		List<Issue> isNull = c.getIssuesByJQL("TES","component = null");

		System.out.println("framework:");
		for (Issue i : framework) {
				System.out.print(i.key+" ");
				System.out.println(i.fields.summary);
		}
		System.out.println("application:");
		for (Issue i : application) {
				System.out.print(i.key+" ");
				System.out.println(i.fields.summary);
		}
		System.out.println("notNull:");
		for (Issue i : notNull) {
			System.out.print(i.key+" ");
			System.out.println(i.fields.summary);
		}
		System.out.println("isNull:");
		for (Issue i : isNull) {
			System.out.print(i.key+" ");
			System.out.println(i.fields.summary);
		}
	}
}
