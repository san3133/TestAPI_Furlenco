package common;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;

import com.jayway.restassured.http.ContentType;

import Utils.utility;
import properties.Constant;

public class TestPost2 {

	utility u = new utility();
	Constant c = new Constant();

	public void post() throws IOException {

		given().body(c.jsonBody).with().contentType(ContentType.JSON)

				.when().post(c.BaseUrl + c.new_orders).then().statusCode(c.created);

	}

}
