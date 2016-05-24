package common;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;

import Utils.utility;
import properties.Constant;

public class testPost {
	Constant c = new Constant();
	utility u = new utility();

	public void test() {

		given().body(c.jsonBody).with().contentType(ContentType.JSON)

				.when().post(c.BaseUrl + c.new_orders).then().statusCode(c.created);

	}

}
