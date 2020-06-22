package com.RestAPI;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import pojo.AddPlace2;

import static io.restassured.RestAssured.*;

public class GetPlaceAPI {

	public static void main(String[] args) {
		//AddPlaceAPI ap = new AddPlaceAPI();
		String place_id="f7e3933a0ce99657187cf05e10d0bccb" ;// ap.addPlace();
		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	AddPlace2 data=
	//	String Response=	
				given().log().all().queryParam("key","qaclick123").queryParam("place_id", place_id).expect().defaultParser(Parser.JSON)
	.when().get("maps/api/place/get/json")
	.then().log().all().assertThat().statusCode(200).extract().response().as(AddPlace2.class);
		
	
	System.out.println("Data --> "+data.getAddress());		

	}

}
