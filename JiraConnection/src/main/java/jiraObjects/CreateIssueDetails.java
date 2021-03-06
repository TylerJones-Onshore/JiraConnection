package jiraObjects;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jiraObjects.IssueTypeEnum.TypeCode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateIssueDetails {
	public String summary;
	public TypeCode iCode;
	public String project;
	public String description;
	public Map<String,String> customFields;
	
	public String getJson() {
		String json = "{\"fields\":{";
		json+="\"summary\":\""+summary+"\","
			 +"\"issuetype\":{\"id\":\""+iCode.getIssueCode()+"\"},"
			 +"\"project\":{\"id\":\""+project+"\"},"
			 +"\"description\":\""+description+"\"";
		for(String key:customFields.keySet()) {
			json+=",\""+key+"\":"+customFields.get(key);
		}
		
		json+="}}";
		return json;
	}
}