package projectTESObjectsMoveLater;

public class BrowserEnum {
	public enum Browsers{
		CHROME("Chrome"),
		E11("E11"),
		EDGE("Edge"),
		SAFARI("Safari"),
		FIREFOX("Firefox");
		
		private String browser;
		private String fieldId="customfield_11259";
		public String getFieldId() {
			return fieldId;
		}
		public String getBrowser() {
			return browser;
		}
		Browsers(String browserString){
			browser = browserString;
		}
	}
}
