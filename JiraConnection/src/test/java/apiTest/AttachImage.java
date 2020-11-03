package apiTest;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import jira.Client;

public class AttachImage {

	@Test
	public static void main(String[] args) {
		Path root = Paths.get(".").normalize().toAbsolutePath();
		String path = root.toString() + "/src/test/resources/TestImages/ThumbsUP.jpg";
		File file = new File(path);

		if (file.exists()) {

			Client c = new Client("username should go here", "jira api key goes here");
			c.baseUri = "https://yourcompany.atlassian.net";
			System.out.println(c.addAttachment("JiraIssueKey here", file));
		} else {
			Assert.assertEquals(true, false);
		}
	}
}
