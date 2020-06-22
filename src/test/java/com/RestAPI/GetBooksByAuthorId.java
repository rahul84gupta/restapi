package com.RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;

import static io.restassured.RestAssured.*;

public class GetBooksByAuthorId {
	
	public static void main(String[] args) {
	
	RestAssured.baseURI="https://www.goodreads.com";
	String response=
						given()//.log().all()
						.queryParam("key", "VQNlPqbmkJqI4Pe9ispA")
						.queryParam("id", "938064")
						.queryParam("page","N-N")
						.when()//.log().all()
						.get("author/list.xml")
						.then().log().all().assertThat().statusCode(200)
						.extract().response().asString();
						
	XmlPath xml = new XmlPath(response);
	System.out.println("response ====");
	//System.out.println(response);
	System.out.println("Author Name -- "+xml.getString("GoodreadsResponse.author.name"));
	int TotalBooks=xml.get("GoodreadsResponse.author.books.book.size()");
	System.out.println("Total Number of Books "+TotalBooks);
	for(int i=0;i<TotalBooks;i++) {
		System.out.println("Book Name: "+xml.getString("GoodreadsResponse.author.books.book["+i+"].title"));
	}
	
	
	}

}
