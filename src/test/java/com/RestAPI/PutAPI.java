package com.RestAPI;

import resources.ResourceSpec;
import resources.TestDataBody;

import static io.restassured.RestAssured.*;

public class PutAPI {

	public static void main(String[] args) {
		ResourceSpec req= new ResourceSpec(); 
		
	
		given().log().all().spec(req.RequestSpecification()).body(TestDataBody.putPlaceBody()).
		when().log().all().put("maps/api/place/update/json").
		then().log().all().assertThat().spec(req.ResponseSpecification());
		
	}

}
