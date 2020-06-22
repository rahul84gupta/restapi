package com.RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;

import static io.restassured.RestAssured.*;

public class GetBooksByAuthor {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://www.goodreads.com/search/index.xml";
		
		String response= 
		given().log().all().queryParam("key", "VQNlPqbmkJqI4Pe9ispA")
		.queryParam("page","N-N")
		.queryParam("q","Kermit Bonner")
		.queryParam("search", "author")
		.when().log().all().get()
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		XmlPath xml = new XmlPath(response);
		int totalbooks = xml.getInt("GoodreadsResponse.search.results.work.size()");
		for(int i=0;i<totalbooks;i++) {
			System.out.println("Book Name: "+xml.getString("GoodreadsResponse.search.results.work["+i+"].best_book.title"));
		}
	}

}
