package jiraObjects;

import jiraObjects.BrowserEnum.Browsers;

public class EnvironmentsEnum {
	public enum Environments{
		DEV("Dev"),
		QA("QA"),
		UAT("UAT"),
		STAGING("Staging"),
		PRODUCTION("Production");
		
		private String environment;
		private String fieldId = "customfield_11252";
		public String getFieldId() {
			return fieldId;
		}
		public String getEnvironment() {
			return environment;
		}
		Environments(String environmentString){
			environment = environmentString;
		}
	}
	
	public Environments getEnvironment(String env) {
		Environments e= null;
		if(env.equalsIgnoreCase("DEV")) {
			e=Environments.DEV;
		}
		else if(env.equalsIgnoreCase("QA")) {
			e=Environments.QA;
		}
		else if(env.equalsIgnoreCase("UAT")) {
			e=Environments.UAT;
		}
		else if(env.equalsIgnoreCase("STAGING")) {
			e=Environments.STAGING;
		}
		else if(env.equalsIgnoreCase("PRODUCTION")) {
			e=Environments.PRODUCTION;
		}
		return e;
	}
}
