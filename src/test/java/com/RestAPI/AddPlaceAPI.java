package com.RestAPI;

import io.restassured.specification.RequestSpecification;

import resources.ResourceSpec;
import resources.TestDataBody;
import static io.restassured.RestAssured.*;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class AddPlaceAPI {

	
	public String addPlace(){
		ResourceSpec ext = new ResourceSpec();
		RequestSpecification Request = ext.RequestSpecification().body(TestDataBody.addPlaceBody());


		String Response = given().spec(Request).expect().defaultParser(Parser.JSON).when()
				.post("maps/api/place/add/json").then().assertThat().spec(ext.ResponseSpecification()).extract()
				.response().asString();

		System.out.println("Response --> " + Response);
		JsonPath js = new JsonPath(Response);
		System.out.println("place_id is -->  "+js.get("place_id"));
		String PlaceID= js.get("place_id");
		return PlaceID;

	}
	
	public static void main(String[] args) {
		AddPlaceAPI apj = new AddPlaceAPI();
		System.out.println(apj.addPlace());
		
	} 
	
	
	
}
