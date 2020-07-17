package projectTESObjectsMoveLater;

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
}
