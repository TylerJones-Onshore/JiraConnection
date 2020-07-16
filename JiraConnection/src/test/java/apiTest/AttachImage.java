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

			Client c = new Client("tjones@aarp.org", "0yw8ZD5F9Xn7p2gVAF8pC588");
			c.baseUri = "https://aarpqmo.atlassian.net";
			System.out.println(c.addAttachment("TES-1", file));
		} else {
			Assert.assertEquals(true, false);
		}
	}
}
