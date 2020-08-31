package jiraObjects;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueUpdate {
	public String summary;
	public String description;
	public String fixVersions;
	public String[] labels;
	public String assignee;
	public String issue;
	public String[] components;
	
	public String getJson() {
		List<String> parts = new ArrayList<String>();
		
		if(summary!=null&&!summary.equals("")) {
			parts.add("\"summary\":[{\"set\":\""+summary+"\"}]");
		}
		if(components != null && components.length>0) {
			String builder ="\"components\":[{\"set\":[";
			for(int i = 0; i < components.length;i++) {
				if(i>0) {
					builder+=",";
				}
				builder+="{\"name\":\""+components[i]+"\"}";
			}
			builder+="]}]";
			parts.add(builder);
		}
		if(description!=null&&!description.equals("")) {
			parts.add("\"description\":[{\"set\":\""+description+"\"}]");			
		}
		if(assignee!=null&&!assignee.equals("")) {
			parts.add("\"assignee\":[{\"set\":{\"id\":\""+assignee+"\"}}]");						
		}
		if(labels!=null&&labels.length>0) {
			String builder ="\"labels\":[{\"set\":[";
			for(int i = 0; i < labels.length;i++) {
				if(i>0) {
					builder+=",";
				}
				builder+="\""+labels[i]+"\"";
			}
			builder+="]}]";
			parts.add(builder);
		}
		if(fixVersions!=null&&!fixVersions.equals("")) {
			parts.add("\"fixVersions\":[{\"set\":[{\"name\":\""+fixVersions+"\"}]}]");
		}
		
		String json = "{\"update\":{";
		for(int i = 0; i<parts.size();i++) {
			if(i>0) {
				json+=",";
			}
			json+=parts.get(i);
		}
		json+="}}";
		return json;
	}
}