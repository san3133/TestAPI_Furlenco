package testme;

import org.testng.annotations.Test;

import common.BuisnessLogic;

public class Subscriptions_Api {
	BuisnessLogic b = new BuisnessLogic();

	@Test
	public void testSubscription_Api1() {
		b.testingSubscApi1();

	}

	@Test(priority = 2)
	public void testSubscription_Api2() {
		b.testingSubscApi2();

	}
}
