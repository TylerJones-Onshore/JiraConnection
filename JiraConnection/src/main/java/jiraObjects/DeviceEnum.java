package jiraObjects;

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
	public Devices getDevice(String Device) {
		Devices d= null;
		if(Device.equalsIgnoreCase("DESKTOP")) {
			d=Devices.DESKTOP;
		}
		else if(Device.equalsIgnoreCase("MOBILE_IPHONE")) {
			d=Devices.MOBILE_IPHONE;
		}
		else if(Device.equalsIgnoreCase("TABLET")) {
			d=Devices.TABLET;
		}
		else if(Device.equalsIgnoreCase("MOBILE_ANDROID")) {
			d=Devices.MOBILE_ANDROID;
		}
		else if(Device.equalsIgnoreCase("LAPTOP")) {
			d=Devices.LAPTOP;
		}
		return d;
	}
}
