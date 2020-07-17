package projectTESObjectsMoveLater;

public class PriorityEnum {
	public enum Priority{
		CRITICAL("Critical"),
		HIGH("High"),
		MEDIUM("Medium"),
		LOW("Low");
		
		private String priority;
		private String fieldId = "customfield_11256";
		public String getFieldId() {
			return fieldId;
		}
		public String getPriority() {
			return priority;
		}
		Priority(String priorityString){
			priority = priorityString;
		}
	}
}