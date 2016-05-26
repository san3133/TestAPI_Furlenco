package testme;

import org.testng.annotations.Test;

import common.BuisnessLogic;

public class Slots_Api {

	BuisnessLogic b = new BuisnessLogic();

	@Test(priority = 1)
	public void testSlots_Api1() {

		b.testingSlotApi1();

	}

	@Test(priority = 2)
	public void testSlots_Api2() {
		b.testingSlotApi2();
	}

	@Test(priority = 3)
	public void testSlots_Api3() {
		b.testingSlotApi3();
	}
}
