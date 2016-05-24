package common;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utils.utility;
import properties.Constant;

public class BuisnessLogic {

	Constant c = new Constant();
	utility u = new utility();

	// this section deals with new orders api
	public void testNeworder1() {
		Response res = given().body(c.jsonBody).with().contentType(ContentType.JSON).when()
				.post(c.BaseUrl + c.new_orders).then().statusCode(c.created).body("user_id", equalTo(54321)).extract()
				.response();
		int id = res.path("id");

		/// next phase of get

		given().accept(ContentType.JSON).when().get(c.BaseUrl + id).then().statusCode(c.ok);

	}

}
