package common;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utils.utility;
import Utils.xml_read;
import properties.Constant;

public class BuisnessLogic {

	Constant c = new Constant();
	utility u = new utility();
	xml_read x = new xml_read();

	// this section deals with new orders api
	public void testNeworder1() {
		Response res = given().body(c.jsonBody).with().contentType(ContentType.JSON).when()
				.post(c.BaseUrl + c.Order_api + c.newOrder_Api).then().statusCode(c.created).body("user_id", equalTo(7))
				.extract().response();
		int id = res.path("id");

		/// next phase of get

		given().accept(ContentType.JSON).when().get(c.BaseUrl + c.Order_api + id).then().statusCode(c.ok);

	}

	// this section is for subscriptions

	public void testingSubscApi1() {

		given().content(ContentType.JSON).when().get(c.BaseUrl + c.Subscriptions_api).then().statusCode(c.ok);

	}

	@Test
	public void testingSubscApi2() {

		Response res = given().content(ContentType.JSON).when().get(c.BaseUrl + c.Subscriptions_api).then()
				.statusCode(c.ok).extract().response();
		String jsonAsString = res.asString();
		int id = res.path("id[2]");

		given().content(ContentType.JSON).when().get(c.BaseUrl + c.Subscriptions_api + id).then().statusCode(c.ok)
				.body("id", equalTo(id)).body("city_id", equalTo(1)).body("packages.package_id[0]", equalTo(236));

	}

	// this section deals with Slots api

	public void testingSlotApi1() {

		given().queryParam(c.SlotDate, c.slot_date_1).queryParam(c.SlotCity, c.Bang_city).when()
				.get(c.BaseUrl + c.Slot_api).then().statusCode(c.ok);

	}

	public void testingSlotApi2() {

		given().queryParam(c.SlotDate, c.slot_date_1).queryParam(c.SlotCity, c.Mumb_city).when()
				.get(c.BaseUrl + c.Slot_api).then().statusCode(c.ok);

	}

	public void testingSlotApi3() {

		given().queryParam(c.SlotDate, c.slot_date_1).queryParam(c.SlotCity, c.pune_city).when()
				.get(c.BaseUrl + c.Slot_api).then().statusCode(c.ok);

	}

}
