package stepDefinations;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.ResourceSpec;
import resources.TestDataBody;
import static org.junit.Assert.*;

public class StepDefination {
	RequestSpecification req;
	ResourceSpec ext;
	Response response;

	@Given("Add Place payload")
	public void add_Place_payload() {
		ext = new ResourceSpec();
		RequestSpecification Request = ext.RequestSpecification().body(TestDataBody.addPlaceBody());
		req = given().spec(Request);
	}

	@When("user calls AddPlace API with Post request method")
	public void user_calls_AddPlace_API_with_Post_request_method() {
		response = req.when().post("maps/api/place/add/json").then().assertThat().spec(ext.ResponseSpecification())
				.extract().response();

	}

	@Then("user should receive status code as {int}")
	public void user_should_receive_status_code_as(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
	}

}
