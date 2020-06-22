package pojo;

import java.util.List;

public class AddPlace {

	private Location location;
	private String accuracy;
	private String name;
	private String phone_number;
	private String address;
	private List<String> types;
	private String website;
	private String language;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public  List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
//	public static void main(String[] args) {
//		AddPlacePoJo pj = new AddPlacePoJo();
//		pj.setAccuracy("50");
//		pj.setAddress("29, side layout, cohen 09");
//		pj.setLanguage("French-IN");
//		pj.setWebsite("http://google.com");
//		pj.setName("Frontline house");
//		pj.setPhone_number("(+91) 983 893 3937");
//		List<String> lst = new ArrayList<String>();
//		lst.add("shoe park1");
//		lst.add("shop");
//		pj.setTypes(lst);
//	}

}
