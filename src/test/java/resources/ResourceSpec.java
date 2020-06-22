package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/*
RestAssured.baseURI = "https://rahulshettyacademy.com";
given().log().all().header("Content-Type", "application/json").queryParam("key", "qaclick123")
		.body(pj)
		.when().log().all().post("maps/api/place/add/json").then().log()
		.all().assertThat().statusCode(200).extract().response().asString();

*/
public class ResourceSpec {
    RequestSpecification request;
	ResponseSpecification res;
	

public RequestSpecification RequestSpecification() {
	
	 request = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
	.addQueryParam("key","qaclick123")
	.setContentType(ContentType.JSON).build();	
	return request;	
}
	

public  ResponseSpecification ResponseSpecification() {
	ResponseSpecification res= new ResponseSpecBuilder().expectStatusCode(200)
	.build();
	return res;
	}

}
