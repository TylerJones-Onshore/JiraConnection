package projectTESObjectsMoveLater;

public class DeviceEnum {
	public enum Devices{
		DESKTOP("Desktop"),
		MOBILE_IPHONE("Mobile (Iphone)"),
		TABLET("Tablet"),
		MOBILE_ANDROID("Mobile (Android)"),
		LAPTOP("Laptop");
		
		private String device;
		private String fieldId = "customfield_11260";
		public String getFieldId() {
			return fieldId;
		}
		public String getDevice() {
			return device;
		}
		private Devices(String deviceString) {
			device = deviceString;
		}
	}
}
