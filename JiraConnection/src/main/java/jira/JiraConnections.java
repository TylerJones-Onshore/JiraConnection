package jira;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jiraObjects.Issue;
import jiraObjects.IssueUpdate;
import jiraObjects.Project;
import jiraObjects.ProjectIssuesReturn;

import java.io.File;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;

public class JiraConnections {
	public String baseUri;
	public String contentType = "";
	private String encodedCreds;
	
	public HashMap<String, String> headers = new HashMap<String, String>();

	//Connection Setup
	//Gets
	public Issue getIssue(String issueKey) {
		headers.clear();
		headers.put("Authorization", "Basic "+encodedCreds);
		headers.put("Accept","application/json");
		
		Response res = get("/rest/api/latest/issue/" + issueKey);
		Issue issueJson = res.then().log().all().extract().as(Issue.class);
		return issueJson;
	}
	
	public List<Issue> getAllProjectIssues(String projectKey) {
		headers.clear();
		headers.put("Authorization", "Basic "+encodedCreds);
		headers.put("Accept","application/json");
		
		List<Issue> issues = new ArrayList<Issue>();
		int startAt =0;
		int total =0;
		
		do {
			String resource = "/rest/api/latest/search?startAt="+startAt+"&jql=project="+projectKey;
			Response res = get(resource);
			ProjectIssuesReturn partialReturn = res.then().log().all().extract().as(ProjectIssuesReturn.class);
			for(Issue i:partialReturn.issues) {
				issues.add(i);
			}
			startAt += partialReturn.maxResults;
			total = partialReturn.total;
		}while(startAt <total);
		
		return issues;
	}
	
	/**
	 * Returns project information and associated versions
	 * */
	public Project getProject(String project) {
		headers.clear();
		headers.put("Authorization", "Basic "+encodedCreds);
		headers.put("Accept","application/json");
		
		return get("/rest/api/latest/project/"+project).then().log().all().extract().as(Project.class);
	}
	
	//Put
	public int updateIssue(IssueUpdate update) {
		headers.clear();
		headers.put("Authorization", "Basic "+encodedCreds);
		
		String json =update.getJson();
		Response res = put("/rest/api/latest/issue/"+update.issue,json);
		String bodyString = res.getBody().asString();
		int success = res.getStatusCode();
		return success;
	}

	//Post
	public int addAttachment(String issueKey, File file) {
		headers.clear();
		headers.put("Authorization", "Basic "+encodedCreds);
		headers.put("X-Atlassian-Token", "no-check");
		
		Response res = post("/rest/api/latest/issue/"+issueKey+"/attachments",file);
		String bodyString = res.getBody().asString();
		return res.getStatusCode();
	}
	//Connections
	
	private Response post(String resource, File body) {
		RequestSpecification request = given().baseUri(baseUri);
		if(contentType != null&&!contentType.contentEquals("")) {
			request = request.contentType(contentType);
		}
		if(headers != null && headers.size()>0) {
			request = request.headers(headers);
		}
		request.log().all();
		return request.when().multiPart(body).post(resource).andReturn();
	}

	private Response put(String resource,Object body) {
		RequestSpecification request = given().baseUri(baseUri);
		if(contentType != null && !contentType.equals("")) {
			request = request.contentType(contentType);
		}
		if(headers != null && headers.size()>0) {
			request = request.headers(headers);
		}
		request.log().all();
		return request.when().body(body).put(resource);
	}

	private Response get(String resource) {
		RequestSpecification request = given().baseUri(baseUri);
		if (!contentType.equals("")) {
			request = request.contentType(contentType);
		}
		if (headers.size() > 0) {
			request = request.headers(headers);
		}
		return request.log().all().when().get(resource).andReturn();
	}

	private Response delete() {
		return null;
	}

	public static String encodeCredentials(String username, String apiKey) {
		String creds = username + ":" + apiKey;
		String encoded = "";
		try {
			byte[] credentials = creds.getBytes("UTF8");
			encoded = Base64.getEncoder().encodeToString(credentials);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return encoded;
	}
	
	public JiraConnections(String username, String password) {
		this.encodedCreds = encodeCredentials(username,password);
	}
}