package jiraObjects;

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
	public Browsers getBrowser(String browser) {
		Browsers b= null;
		if(browser.equalsIgnoreCase("CHROME")) {
			b=Browsers.CHROME;
		}
		else if(browser.equalsIgnoreCase("E11")) {
			b=Browsers.E11;
		}
		else if(browser.equalsIgnoreCase("EDGE")) {
			b=Browsers.EDGE;
		}
		else if(browser.equalsIgnoreCase("FIREFOX")) {
			b=Browsers.FIREFOX;
		}
		else if(browser.equalsIgnoreCase("SAFARI")) {
			b=Browsers.SAFARI;
		}
		return b;
	}
}
