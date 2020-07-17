package projectTESObjectsMoveLater;

public class DefectTypeEnum {
	public enum DefectType {
		FUNCTIONAL("Functional"),
		UI("UI"),
		WEB_SERVICE("Web Services/API"),
		DATABASE("Database"),
		REGRESSION("Regression"),
		BUG("Bug"),
		DEPLOYMENT("Deployment"),
		CONFIGURATION("Configuration"),
		INTEGRATION("Integration"),
		DATA("Data"),
		DESIGN("Design"),
		ENHANCEMENT("Enhancement"),
		ENVIRONMENT("Environment"),
		NOT_REPRODUCABLE("Not Reproducible"),
		PERFORMANCE("Performance"),
		QUESTION("Question");
		
		private String defectType;
		private String fieldId = "customfield_11258";
		public String getFieldId() {
			return fieldId;
		}
		public String getDefectType() {
			return defectType;
		}

		DefectType(String defectTypeString) {
			defectType = defectTypeString;
		}
	}
}
