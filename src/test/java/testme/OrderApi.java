package testme;

import org.testng.annotations.Test;

import common.BuisnessLogic;

public class OrderApi {

	BuisnessLogic b = new BuisnessLogic();

	// commit
	@Test

	public void test() {

		b.testNeworder1();

	}
}
