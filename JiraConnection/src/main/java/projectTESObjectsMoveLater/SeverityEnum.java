package projectTESObjectsMoveLater;

public class SeverityEnum {
	public enum Severity{
		CRITICAL("Sev 1-Critical"),
		HIGH("Sev 2-High"),
		MEDIUM("Sev 3-Medium"),
		LOW("Sev 4-Low");
		
		private String severity;
		private String fieldId = "customfield_11255";
		public String getFieldId() {
			return fieldId;
		}
		public String getSeverity() {
			return severity;
		}
		Severity(String severityString){
			severity = severityString;
		}
	}
}
