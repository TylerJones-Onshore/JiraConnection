package apiTest;

import java.util.HashMap;

import jira.Client;
import jiraObjects.CreateIssueDetails;
import jiraObjects.Issue;
import jiraObjects.IssueTypeEnum;
import projectTESObjectsMoveLater.BrowserEnum.Browsers;
import projectTESObjectsMoveLater.DefectTypeEnum.DefectType;
import projectTESObjectsMoveLater.DeviceEnum.Devices;
import projectTESObjectsMoveLater.EnvironmentsEnum.Environments;
import projectTESObjectsMoveLater.PriorityEnum.Priority;
import projectTESObjectsMoveLater.SeverityEnum.Severity;

public class CreateIssue {
	public static void main(String[] args) {
		Client c = new Client("username should go here", "jira api key goes here");
		c.baseUri = "https://yourcompany.atlassian.net";
		c.contentType = "application/json";
		
		CreateIssueDetails ci = new CreateIssueDetails();
		ci.summary = "Creating a ticket via java framework";
		ci.description = "This ticket was created by utilizing the JIRA api.";
		ci.iCode = IssueTypeEnum.TypeCode.BUG;
		ci.project = "project id goes here";
		ci.customFields = new HashMap<String,String>();
		Browsers browser = Browsers.CHROME;
		ci.customFields.put(browser.getFieldId(),"[{\"value\":\""+ browser.getBrowser()+"\"}]");
		Devices device = Devices.DESKTOP;
		ci.customFields.put(device.getFieldId(), "[{\"value\":\""+ device.getDevice()+"\"}]");
		Environments environment = Environments.QA;
		ci.customFields.put(environment.getFieldId(), "[{\"value\":\""+ environment.getEnvironment()+"\"}]");
		Priority p = Priority.LOW;
		ci.customFields.put(p.getFieldId(), "{\"value\":\""+ p.getPriority()+"\"}");
		Severity s = Severity.LOW;
		ci.customFields.put(s.getFieldId(), "{\"value\":\""+ s.getSeverity()+"\"}");
		DefectType dType = DefectType.BUG;
		ci.customFields.put(dType.getFieldId(), "{\"value\":\""+ dType.getDefectType()+"\"}");
		
		Issue i = c.createIssue(ci);
		System.out.println(i.key);
		System.out.println(i.id);		
		
	}
}
