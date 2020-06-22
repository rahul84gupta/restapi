package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;
import pojo.PutPlace;

public class TestDataBody {

	
	public static AddPlace addPlaceBody() {
		AddPlace pj = new AddPlace();
		pj.setAccuracy("50");
		pj.setAddress("29, side layout, cohen 09");
		pj.setLanguage("French-IN");
		pj.setWebsite("http://google.com");
		pj.setName("Frontline house");
		pj.setPhone_number("(+91) 983 893 3937");
		List<String> lst = new ArrayList<String>();
		lst.add("shoe park");
		lst.add("shop");
		pj.setTypes(lst);
		Location loc = new Location();
		loc.setLat("-38.383494");
		loc.setLng("33.427362");
		pj.setLocation(loc);
		
		return pj;
		
	}
	
	public static String deletePlaceBody() {
		String place_id= "f7e3933a0ce99657187cf05e10d0bccb";
		return place_id;
		
	}
	
	public static PutPlace putPlaceBody() {
				
		PutPlace pp = new PutPlace();
		pp.setAddress("70 Summer walk, USA");
		pp.setKey("qaclick123");
		pp.setPlace_id("f7e3933a0ce99657187cf05e10d0bccb");
		return pp;
			

	}
}
