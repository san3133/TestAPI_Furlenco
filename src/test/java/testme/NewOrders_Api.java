package testme;

import org.testng.annotations.Test;

import common.BuisnessLogic;

public class NewOrders_Api {

	BuisnessLogic b = new BuisnessLogic();

	@Test

	public void test() {

		b.testNeworder1();

	}
}
