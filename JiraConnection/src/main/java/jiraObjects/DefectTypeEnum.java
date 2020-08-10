package jiraObjects;

import jiraObjects.DeviceEnum.Devices;

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
	public DefectType getDefectType(String defectType) {
		DefectType d= null;
		if(defectType.equalsIgnoreCase("FUNCTIONAL")) {
			d=DefectType.FUNCTIONAL;
		}
		else if(defectType.equalsIgnoreCase("UI")) {
			d=DefectType.UI;
		}
		else if(defectType.equalsIgnoreCase("WEB_SERVICE")) {
			d=DefectType.WEB_SERVICE;
		}
		else if(defectType.equalsIgnoreCase("DATABASE")) {
			d=DefectType.DATABASE;
		}
		else if(defectType.equalsIgnoreCase("REGRESSION")) {
			d=DefectType.REGRESSION;
		}
		else if(defectType.equalsIgnoreCase("BUG")) {
			d=DefectType.BUG;
		}
		else if(defectType.equalsIgnoreCase("DEPLOYMENT")) {
			d=DefectType.DEPLOYMENT;
		}
		else if(defectType.equalsIgnoreCase("CONFIGURATION")) {
			d=DefectType.CONFIGURATION;
		}
		else if(defectType.equalsIgnoreCase("INTEGRATION")) {
			d=DefectType.INTEGRATION;
		}
		else if(defectType.equalsIgnoreCase("DATA")) {
			d=DefectType.DATA;
		}
		else if(defectType.equalsIgnoreCase("DESIGN")) {
			d=DefectType.DESIGN;
		}
		else if(defectType.equalsIgnoreCase("ENHANCEMENT")) {
			d=DefectType.ENHANCEMENT;
		}
		else if(defectType.equalsIgnoreCase("ENVIRONMENT")) {
			d=DefectType.ENVIRONMENT;
		}
		else if(defectType.equalsIgnoreCase("NOT_REPRODUCABLE")) {
			d=DefectType.NOT_REPRODUCABLE;
		}
		else if(defectType.equalsIgnoreCase("PERFORMANCE")) {
			d=DefectType.PERFORMANCE;
		}
		else if(defectType.equalsIgnoreCase("QUESTION")) {
			d=DefectType.QUESTION;
		}
		return d;
	}
}
