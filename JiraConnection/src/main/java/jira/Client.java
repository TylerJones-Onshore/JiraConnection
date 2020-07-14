package jira;

import java.util.Base64;

import jiraObjects.Issue;

public class Client {
	public static String BASEURL;
	private static String encoded;
	
	
	public Client(String url, String username, String password) {
		BASEURL = url;
		encoded = encryptCreds(username,password);
	}
	
	public static Issue getIssue(String issueKey) {
		return new Issue();
	}
	
	private static String encryptCreds(String username, String password) {
		return Base64.getEncoder().encodeToString((username+":"+password).getBytes());
	}
}
