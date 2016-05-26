package properties;

import java.io.File;

import Utils.utility;

public class Constant {

	// classes used for testing and calling
	utility u = new utility();

	// basic system level properties
	public File basepath = new File(System.getProperty("user.dir"));

	// basic uri and api used for testing
	public String BaseUrl = "https://furlenco-alfred-staging-1.herokuapp.com/api/";
	public String Order_api = "orders/";

	// Subscriptions api
	public String Subscriptions_api = "subscriptions/";

	// slots api
	public String Slot_api = "slots";

	// new orders api

	// (https://furlenco-alfred-staging-1.herokuapp.com/api/orders/new_orders/)
	public String newOrder_Api = "new_orders/";

	// basic content types,accepting
	public String Content = "ContentType.JSON";

	// related city id's for testing
	public int Bang_city = 1;
	public int Mumb_city = 2;
	public int pune_city = 3;

	// related to slots api
	public String slot_date_1 = "24-05-2016";
	public String SlotDate = "date";
	public String SlotCity = "city";

	// different status related to results of the api's
	public int ok = 200;
	public int created = 201;

	// different json we use to test
	public String jsonBody = u.generateStringFromResource(basepath + File.separator + "src" + File.separator + "main"
			+ File.separator + "java" + File.separator + "properties" + File.separator + "generated.json");

	public File test = new File(basepath + File.separator + "src" + File.separator + "main" + File.separator + "java"
			+ File.separator + "properties" + File.separator + "TestData.xml");

}
