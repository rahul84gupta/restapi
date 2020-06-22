package com.RestAPI;

import resources.ResourceSpec;
import resources.TestDataBody;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DeleteAPI {

	public static void main(String[] args) {
		ResourceSpec res = new ResourceSpec();
		RequestSpecification req = res.RequestSpecification().body(TestDataBody.deletePlaceBody());
		ResponseSpecification resp = res.ResponseSpecification();

		given().log().all().spec(req).expect().defaultParser(Parser.JSON).when().delete("maps/api/place/delete/json")
				.then().log().all().assertThat().spec(resp);

	}

}
